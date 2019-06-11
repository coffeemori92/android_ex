package com.example.android05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_email, TextInputEditText_password;
    Button Button_login;
    String emailOK = "123@gmail.com";
    String passwordOK = "1234";
    String inputEmail = "";
    String inputPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText_email = findViewById(R.id.TextInputEditText_email);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
        Button_login = findViewById(R.id.Button_login);

        // 1. 값을 가져온다. - 검사 (123@gmail.com / 1234)
        // 2. 클릭을 감지한다.
        // 3. 1번의 값을 다음 액티비티로 넘긴다.

        Button_login.setClickable(false);
        TextInputEditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

                if(s != null){
                    inputEmail = s.toString();
                    Button_login.setEnabled(validation());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        TextInputEditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

                if(s != null){
                    inputPassword = s.toString();
                    Button_login.setEnabled(validation());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

//        Button_login.setClickable(true);
        Button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = TextInputEditText_email.getText().toString();
                String password = TextInputEditText_password.getText().toString();

                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });
    }

    public boolean validation(){
        return inputEmail.equals(emailOK)  && inputPassword.equals(passwordOK);
    }
}
