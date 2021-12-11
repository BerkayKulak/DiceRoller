package com.berkaykulak.diceroller.ui.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.berkaykulak.diceroller.R
import kotlinx.android.synthetic.main.fragment_second_onboarding.view.*


class SecondOnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_onboarding, container, false)


        val sharedPref = activity?.getSharedPreferences(
            getString(R.string.sharedPreferences), Context.MODE_PRIVATE)

        view.buttonFinish.setOnClickListener {
            findNavController().navigate(R.id.action_secondOboardingFragment_to_homeFragment)
            with(sharedPref?.edit()){
                this?.putBoolean("onboarding",true)
                this?.apply()
            }
        }

        return view
    }

}