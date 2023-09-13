package com.yidridev.algolus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_web_creation.*

class WebCreationFragment : Fragment(R.layout.fragment_web_creation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        devisButton1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_nextFragment_to_devisFragment)
        }
        contact_button1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_nextFragment_to_InfoFragment)
        }


    }
}