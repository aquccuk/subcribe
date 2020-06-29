package com.example.usersubcribe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnOK;
    private Button btnCancel;
    private TextView resultText;
    private EditText userInput;
    private EditText userMail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK= findViewById(R.id.btnOK);
        btnCancel= findViewById(R.id.btnCancel);
        resultText= findViewById(R.id.result);
        userInput= findViewById(R.id.user);
        userMail= findViewById(R.id.mail);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(String.format(getString(R.string.result), userInput.getText().toString(), userMail.getText().toString()));
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userInput.getText().clear();
                userMail.getText().clear();
                resultText.setText("");
            }
        });
    }
}