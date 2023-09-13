package com.yidridev.algolus

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.yidridev.algolus.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_about.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home)  {

    private lateinit var imageSlider : ImageSlider




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       imageSlider = view.findViewById(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.creation_site,"Creation de site Web"))
        imageList.add(SlideModel(R.drawable.dev_spe,"Developement Specific"))
        imageList.add(SlideModel(R.drawable.seo,"Marketing Strategy"))
        imageList.add(SlideModel(R.drawable.seo_o,"Referencement SEO"))
        imageList.add(SlideModel(R.drawable.maintenance,"Maintenance"))
        imageList.add(SlideModel(R.drawable.social,"Community Management"))


        imageSlider.setImageList(imageList,ScaleTypes.FIT)




        devisButton0.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_devisFragment)
        }
        contact_button0.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_InfoFragment)
        }





        web_service_card.setOnClickListener {

             Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_nextFragment)
        }

        maintenace_card.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_maintenanceFragment2)
        }

        developement_spe_card.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_devSpeFragment)
        }

        seo_card.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_seoFragment)
        }

        comm_management_card.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_commManagmentFragment)
        }
        strategie_card.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_strategieFragment)
        }
  fab.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_devisFragment)

        }



    }











}