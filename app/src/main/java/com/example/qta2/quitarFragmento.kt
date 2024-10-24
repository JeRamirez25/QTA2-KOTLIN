package com.example.qta2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class quitarFragmento : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_quitar_fragmento, container, false)

        val inputEditText = root.findViewById<EditText>(R.id.et_input)
        val resultTextView = root.findViewById<TextView>(R.id.tv_result)
        val solveButton = root.findViewById<Button>(R.id.btn_solve)

        solveButton.setOnClickListener {
            val inputText = inputEditText.text.toString().trim()

            val firstIndex = inputText.indexOf('h')
            val lastIndex = inputText.lastIndexOf('h')

            if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
                val result = inputText.substring(0, firstIndex) + inputText.substring(lastIndex + 1)
                resultTextView.text = result
            } else {
                resultTextView.text = "Por favor, ingresa una cadena con al menos dos 'h'."
            }
        }

        return root
    }


}