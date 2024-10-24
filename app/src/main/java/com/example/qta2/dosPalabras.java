package com.example.qta2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class dosPalabras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dos_palabras);

        EditText inputEditText = findViewById(R.id.et_input);
        TextView resultTextView = findViewById(R.id.tv_result);
        Button solveButton = findViewById(R.id.btn_solve);

        solveButton.setOnClickListener(v -> {
            String inputText = inputEditText.getText().toString().trim();

            String[] words = inputText.split(" ");

            if (words.length == 2) {
                String result = words[1] + " " + words[0];
                resultTextView.setText(result);
            } else {
                resultTextView.setText("Por favor, ingresa exactamente 2 palabras.");
            }
        });
    }
}
