package com.yidridev.algolus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_realisations.*
class InfoFragment : Fragment(R.layout.fragment_info) {
    lateinit var  name : EditText
    lateinit var  message : EditText
    lateinit var  mail : EditText
    lateinit var  phone : EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mail = view.findViewById(R.id.mail)
        phone = view.findViewById(R.id.phone)
        name = view.findViewById(R.id.name)
        message = view.findViewById(R.id.message)

        button.setOnClickListener {
              val ename = name.text.toString()
              val email = mail.text.toString()
              val ephone = phone.text.toString()
              val emessage = message.text.toString()

            val addresses = email.split(",".toRegex()).toTypedArray()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:contact@algolus.ma")
                putExtra(Intent.EXTRA_EMAIL,addresses)
                putExtra(Intent.EXTRA_SUBJECT,"")
                putExtra(Intent.EXTRA_TEXT,emessage)
            }
            val packageManager = activity!!.packageManager



            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }else{
                Toast.makeText(context,"Required app is not installed",Toast.LENGTH_SHORT).show()
            }
        }
    }

}

