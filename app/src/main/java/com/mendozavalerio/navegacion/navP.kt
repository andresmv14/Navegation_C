package com.mendozavalerio.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class navP : Fragment() {

    lateinit var pBoton:Button
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val vista = inflater.inflate(R.layout.fragment_nav_p, container, false)
        pBoton = vista.findViewById(R.id.pButton);
        pBoton.setOnClickListener{
            findNavController().navigate(R.id.action_navP_to_navS)
        }
        return vista
    }

}