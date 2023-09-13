package com.yidridev.algolus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dev_spe.*

class CommManagmentFragment :Fragment(R.layout.fragment_comm_managment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        devisButton5.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_commManagmentFragment_to_devisFragment)
        }
        contact_button5.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_commManagmentFragment_to_InfoFragment)
        }
    }
}