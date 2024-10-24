package com.example.qta2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.qta2.R;

public class dosMitades extends Fragment {

    private EditText inputEditText;
    private TextView resultTextView;
    private Button solveButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dos_mitades, container, false);

        inputEditText = view.findViewById(R.id.et_input);
        resultTextView = view.findViewById(R.id.tv_result);
        solveButton = view.findViewById(R.id.btn_solve);

        solveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = inputEditText.getText().toString();
                String result = solveDosMitades(inputText);
                resultTextView.setText(result);
            }
        });

        return view;
    }

    private String solveDosMitades(String input) {
        int length = input.length();
        int middle = length / 2;

        String firstHalf = input.substring(0, middle + length % 2);
        String secondHalf = input.substring(middle + length % 2);

        return secondHalf + firstHalf;
    }
}
