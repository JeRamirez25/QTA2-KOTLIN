package com.example.qta2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class dosPalabras : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_dos_palabras, container, false)
        val inputEditText = root.findViewById<EditText>(R.id.et_input)
        val resultTextView = root.findViewById<TextView>(R.id.tv_result)
        val solveButton = root.findViewById<Button>(R.id.btn_solve)

        solveButton.setOnClickListener {
            val inputText = inputEditText.text.toString().trim()

            val words = inputText.split(" ")

            if (words.size == 2) {
                val result = "${words[1]} ${words[0]}"
                resultTextView.text = result
            } else {
                resultTextView.text = "Por favor, ingresa exactamente 2 palabras."
            }
        }
        return root
    }

}