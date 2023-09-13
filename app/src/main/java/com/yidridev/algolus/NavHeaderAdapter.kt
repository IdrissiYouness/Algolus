package com.yidridev.algolus

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class NavHeaderAdapter : Fragment(R.layout.nav_header_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setupHyperlink()
    }

    private fun setupHyperlink() {
        val algoUrl = view?.findViewById<TextView>(R.id.algo_url)
        algoUrl?.movementMethod = LinkMovementMethod.getInstance()
        algoUrl?.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://algolus.ma"))
            startActivity(browserIntent)
        }
    }

}