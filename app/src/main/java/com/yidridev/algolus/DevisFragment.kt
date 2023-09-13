package com.yidridev.algolus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_devis.*
import kotlinx.android.synthetic.main.fragment_devis.button
import kotlinx.android.synthetic.main.fragment_info.*
import java.util.regex.Pattern

class DevisFragment :Fragment(R.layout.fragment_devis) {

    lateinit var  name : EditText
    lateinit var  message : EditText
    lateinit var  mail : EditText
    lateinit var  phone : EditText
    lateinit var service : AutoCompleteTextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //emailFocusListener()
        mail = view.findViewById(R.id.mail_devis)
        phone = view.findViewById(R.id.phone_devis)
        name = view.findViewById(R.id.name_devis)
        message = view.findViewById(R.id.message_devis)
        service = view.findViewById(R.id.autoCompleteTextView)

        button.setOnClickListener {
            val ename = name.text.toString()
            val email = mail.text.toString()
            val ephone = phone.text.toString()
            val emessage = message.text.toString()
            val eservice = service.text.toString()
            val addresses = email.split(",".toRegex()).toTypedArray()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:contact@algolus.ma")
                putExtra(Intent.EXTRA_EMAIL,addresses)
                putExtra(Intent.EXTRA_SUBJECT,"DEMANDE DE DEVIS")
                putExtra(Intent.EXTRA_TEXT, "Nom : $ename"+"\n"+ "Tel : $ephone"+"\n"+ "Service : $eservice" + "\n"+ "tarif : ${getVal()}" + "\n" +"message : $emessage")
            }
            val packageManager = activity!!.packageManager

            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }else{
                Toast.makeText(context,"Required app is not installed", Toast.LENGTH_SHORT).show()
            }
        }










    }

    override fun onResume() {
        super.onResume()

        val services = resources.getStringArray(R.array.service_titles)
        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.drop_down_adapter,services)
        autoCompleteTextView.setAdapter(arrayAdapter)
        radioGroup.clearCheck()
        radioGroup2.clearCheck()





        autoCompleteTextView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {


                if (adapterView?.getItemAtPosition(position).toString()=="Creation de site web"){
                    radioGroup2.visibility = View.GONE
                    radioGroup.visibility = View.VISIBLE

                }else if (adapterView?.getItemAtPosition(position).toString()=="SEO"){
                    radioGroup.visibility = View.INVISIBLE
                    radioGroup2.visibility = View.VISIBLE
                }else{
                    radioGroup.visibility = View.GONE
                    radioGroup2.visibility = View.GONE
                    radioGroup.clearCheck()
                    radioGroup2.clearCheck()

                }
            }
        }
    }

    private fun getVal():String{

        if (radio_button_1.isChecked){
            return  radio_button_1.text.toString()
        }else if (radio_button_2.isChecked){
            return  radio_button_2.text.toString()
        }else if (radio_button_3.isChecked){
            return  radio_button_3.text.toString()
        }else if (radio_button_4.isChecked){
            return  radio_button_4.text.toString()
        }else if (radio_button_5.isChecked){
            return  radio_button_5.text.toString()
        }else if (radio_button_6.isChecked){
            return  radio_button_6.text.toString()
        }else if (radio_button_7.isChecked){
            return  radio_button_7.text.toString()
        }else{
            return "none"
        }

    }

    private fun emailFocusListener(){

        mail_devis.setOnFocusChangeListener { view, focused ->
            if(!focused){
                email_field.helperText = validEmail()
            }
        }

    }

    private fun validEmail(): String? {
        val emailText = mail.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
              return "Email addresse Invalid"
        }
        return null
    }


}