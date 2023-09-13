package com.yidridev.algolus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_about.*

class AboutFragment : Fragment(R.layout.fragment_about) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        devisButton7.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_devisFragment)
        }
        contact_button7.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_InfoFragment)
        }
        fb_ic.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.facebook.com/algolus.ma")
            startActivity(openURL)

        }
        insta_ic.setOnClickListener {
            val openURL2 = Intent(Intent.ACTION_VIEW)
            openURL2.data = Uri.parse("https://www.instagram.com/algolus.ma")
            startActivity(openURL2)

        }
        linkedin_ic.setOnClickListener {
            val openURL3 = Intent(Intent.ACTION_VIEW)
            openURL3.data = Uri.parse("https://www.linkedin.com/company/algolus")
            startActivity(openURL3)

        }

    }
}