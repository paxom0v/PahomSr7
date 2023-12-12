package com.example.barsuksr7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000; // время задержки в миллисекундах (в данном случае 3 секунды)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // После задержки запускаем следующую активность
                Intent intent = new Intent(MainActivity.this, BoardActivity.class);
                startActivity(intent);
                finish(); // закрываем текущую активность, чтобы пользователь не мог вернуться на экран загрузки
            }
        }, SPLASH_DELAY);
    }
}