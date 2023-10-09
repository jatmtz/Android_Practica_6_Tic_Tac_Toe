package com.example.android_practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countdownTimer;

    CountDownTimer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countdownTimer = (TextView) findViewById(R.id.countdown_timer);

        CountDownTimer CDT = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long milliUntilFinish) {
                countdownTimer.setText("" + milliUntilFinish /1000);
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(getApplicationContext(), Segunda.class);

            }
        };

        CDT.start();

    }
}