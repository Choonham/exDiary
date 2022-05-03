package com.example.diary;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.diary.MainActivity;

public class SplashActivity extends AppCompatActivity {
    Handler handler = new Handler(Looper.myLooper());

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                finish();
            }
        }, 1000);
    }
}
