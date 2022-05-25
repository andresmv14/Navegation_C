package com.mendozavalerio.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class navS : Fragment() {

    lateinit var sBoton:Button
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_nav_s, container, false)
        sBoton = vista.findViewById(R.id.sButton)
        sBoton.setOnClickListener{
            findNavController().navigate(R.id.action_navS_to_navP)
        }
        return vista
    }


}