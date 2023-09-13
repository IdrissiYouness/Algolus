package com.yidridev.algolus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dev_spe.*

class devSpeFragment :Fragment(R.layout.fragment_dev_spe) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        devisButton5.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_devSpeFragment_to_devisFragment)
        }
        contact_button5.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_devSpeFragment_to_InfoFragment)
        }
    }
}