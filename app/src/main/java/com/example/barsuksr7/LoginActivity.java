package com.example.barsuksr7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действия при нажатии на кнопку "Пропустить"
                Intent intent = new Intent(LoginActivity.this, CodeActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действия при нажатии на кнопку "Пропустить"
                Intent intent = new Intent(LoginActivity.this, CodeActivity.class);
                startActivity(intent);
            }
        });
    }
}