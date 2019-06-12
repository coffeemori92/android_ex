package com.example.usermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText idText = (EditText)findViewById(R.id.id_text);
        EditText passwordText = (EditText)findViewById(R.id.password_text);
        TextView welcomeMsg = (TextView)findViewById(R.id.welcome_msg);
    }
}
