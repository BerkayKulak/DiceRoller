package com.berkaykulak.diceroller.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.core.view.isVisible
import com.berkaykulak.diceroller.R
import com.berkaykulak.diceroller.model.Dice
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val buttonStart = view.buttonStart

        val anim: Animation = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 750
        anim.startOffset = 20
        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = Animation.INFINITE
        buttonStart.startAnimation(anim)

        buttonStart.setOnClickListener {
            buttonStart.clearAnimation()
            buttonStart.isVisible = false
            groupRoll.isVisible = true
            diceRoll(view)
        }

        view.buttonRoll.setOnClickListener {
            diceRoll(view)
        }

        return view
    }

    private fun diceRoll(view: View) {
        val dice = Dice()
        val number = dice.roll()

        val image = when(number){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        view.imageViewRoll.setImageResource(image)
    }


}