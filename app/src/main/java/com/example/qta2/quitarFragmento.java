package com.example.qta2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class quitarFragmento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_quitar_fragmento);

        EditText inputEditText = findViewById(R.id.et_input);
        TextView resultTextView = findViewById(R.id.tv_result);
        Button solveButton = findViewById(R.id.btn_solve);

        solveButton.setOnClickListener(v -> {
            String inputText = inputEditText.getText().toString().trim();

            int firstIndex = inputText.indexOf('h');
            int lastIndex = inputText.lastIndexOf('h');

            if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
                String result = inputText.substring(0, firstIndex) + inputText.substring(lastIndex + 1);
                resultTextView.setText(result);
            } else {
                resultTextView.setText("Por favor, ingresa una cadena con al menos dos 'h'.");
            }
        });
    }
}
