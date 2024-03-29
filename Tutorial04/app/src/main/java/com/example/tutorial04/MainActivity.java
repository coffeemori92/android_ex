package com.example.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameText = (EditText)findViewById(R.id.name_text);
        Button nameButton = (Button)findViewById(R.id.name_button);

        nameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                intent.putExtra("nameText", name);
                startActivity(intent);
            }
        });
    }
}
