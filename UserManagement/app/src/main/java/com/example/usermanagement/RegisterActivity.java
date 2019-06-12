package com.example.usermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText idText = (EditText)findViewById(R.id.id_text);
        EditText passwordText = (EditText)findViewById(R.id.password_text);
        EditText nameText = (EditText)findViewById(R.id.name_text);
        EditText ageText = (EditText)findViewById(R.id.age_text);

        Button registerButton = (Button)findViewById(R.id.register_button);
    }
}
