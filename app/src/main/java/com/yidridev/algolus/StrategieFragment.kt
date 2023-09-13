package com.yidridev.algolus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_strategie.*

class StrategieFragment :Fragment(R.layout.fragment_strategie) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        devisButton6.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_strategieFragment_to_devisFragment)
        }
        contact_button6.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_strategieFragment_to_InfoFragment)
        }


    }
}