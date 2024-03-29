package com.berkaykulak.diceroller.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.berkaykulak.diceroller.R
import kotlinx.android.synthetic.main.fragment_first_onboarding.view.*


class FirstOnboardingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_onboarding, container, false)


        view.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_firstOnboarding_to_secondOboardingFragment)
        }


        return view
    }
}