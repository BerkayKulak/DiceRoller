package com.berkaykulak.diceroller.ui.splash

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.berkaykulak.diceroller.R


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        val sharedPref = activity?.getSharedPreferences(
            getString(R.string.sharedPreferences), Context.MODE_PRIVATE)

        val isOnboardingShowed = sharedPref?.getBoolean("onboarding",false)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            if (isOnboardingShowed == true){
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_firstOnboarding)
            }

        },3000)

        return view
    }

}