package com.example.android_practica_6;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity ;

public class Ganador extends AppCompatActivity implements View.OnClickListener{

    TextView ganadasbob, ganadaspat;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);

        ganadasbob = (TextView) findViewById(R.id.ganadasbob);
        ganadaspat = (TextView) findViewById(R.id.ganadaspat);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ganador.this, Segunda.class);
                startActivity(i);
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        int ganadasbob1 = bundle.getInt("ganadasbobb");
        int ganadaspat1 = bundle.getInt("ganadaspatt");

        ganadasbob.setText("" + ganadasbob1);
        ganadaspat.setText("" + ganadaspat1);




    }

    @Override
    public void onClick(View view) {

    }
}
