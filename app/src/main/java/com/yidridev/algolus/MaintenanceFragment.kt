package com.yidridev.algolus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_maintenace.*
import kotlinx.android.synthetic.main.fragment_web_creation.*

class MaintenanceFragment :Fragment(R.layout.fragment_maintenace) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        devisButton2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_maintenanceFragment2_to_devisFragment)
        }
        contact_button2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_maintenanceFragment2_to_InfoFragment)
        }
    }
}