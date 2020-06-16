package com.example.usersubcribe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    TextView textView1;
    TextView userInput;
    TextView userMail;
    private int user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.btnOK);
        btn2= findViewById(R.id.btnCancel);
        textView1= findViewById(R.id.result);
        userInput= findViewById(R.id.user);
        userMail= findViewById(R.id.mail);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(String.format(getString(R.string.result), userInput.getText(), userMail.getText()));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = R.id.user;
                userInput.setText(null);
                userMail.setText(null);
                textView1.setText("");
            }
        });
    }
}