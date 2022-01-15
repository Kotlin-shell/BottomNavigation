package com.example.bottomnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.bottomnavigation.R

/**
 * A simple [Fragment] subclass.
 * Use the [home.newInstance] factory method to
 * create an instance of this fragment.
 */
class home : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText = view.findViewById<EditText>(R.id.editTextAge)
        val sendButton = view.findViewById<Button>(R.id.buttonSend)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val ageText = editText.text.toString()

            if(ageText.isEmpty()) {
                return@setOnClickListener
            }

            val age = ageText.toInt()

            val action = homeDirections.actionHomeToDashboard(age)

            controller.navigate(action)
        }
    }
}