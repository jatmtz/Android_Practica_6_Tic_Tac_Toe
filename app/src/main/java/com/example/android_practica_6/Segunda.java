package com.example.android_practica_6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Segunda extends AppCompatActivity implements View.OnClickListener{


    private final List<int[]> combinationsList = new ArrayList<>();

    ImageView img1, img2, imgAA, imgBB, imgCC, imgDD, imgEE, imgFF, imgGG, imgHH, imgII;

    boolean bobgana = false, patgana = false;

    int[] gato = new int[9];
    int turno = 1;

    Button salida, volver, resultados;

    int ganadasbob, ganadaspat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_main);

        img1 = (ImageView) findViewById(R.id.img1);

        img2 = (ImageView) findViewById(R.id.img2);

        imgAA = (ImageView) findViewById(R.id.imgAA);
        imgAA.setOnClickListener(this);
        imgBB = (ImageView) findViewById(R.id.imgBB);
        imgBB.setOnClickListener(this);
        imgCC = (ImageView) findViewById(R.id.imgCC);
        imgCC.setOnClickListener(this);
        imgDD = (ImageView) findViewById(R.id.imgDD);
        imgDD.setOnClickListener(this);
        imgEE = (ImageView) findViewById(R.id.imgEE);
        imgEE.setOnClickListener(this);
        imgFF = (ImageView) findViewById(R.id.imgFF);
        imgFF.setOnClickListener(this);
        imgGG = (ImageView) findViewById(R.id.imgGG);
        imgGG.setOnClickListener(this);
        imgHH = (ImageView) findViewById(R.id.imgHH);
        imgHH.setOnClickListener(this);
        imgII = (ImageView) findViewById(R.id.imgII);
        imgII.setOnClickListener(this);

        salida = (Button) findViewById(R.id.btnsalida);
        salida.setOnClickListener(this);

        volver = (Button) findViewById(R.id.btnvolver);
        volver.setOnClickListener(this);


        salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View salida) {
                System.exit(0);
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View volver) {

                borrar();
            }
        });

        resultados = (Button) findViewById((R.id.btnresultados));

        resultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado();
                borrar();
                Intent i = new Intent(Segunda.this, Ganador.class);
                startActivity(i);
            }
        });



    }



    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.imgAA) {
            if (gato[0] == 0 && turno == 1) {
                imgAA.setImageResource(R.drawable.bob);
                gato[0] = 1;
                ConfirmarBob();
                turno = 2;
            }
            else  if (gato[0] == 0 && turno == 2){
                imgAA.setImageResource(R.drawable.patricio);
                gato[0] = 2;
                ConfirmarBob();
                turno = 1;
            }
        }

        if (v.getId() == R.id.imgBB) {
            if (gato[1] == 0 && turno == 1) {
                imgBB.setImageResource(R.drawable.bob);
                gato[1] = 1;
                ConfirmarBob();
                turno = 2;
            }
            else  if (gato[1] == 0 && turno == 2){
                imgBB.setImageResource(R.drawable.patricio);
                gato[1] = 2;
                ConfirmarBob();
                turno = 1;
            }
        }

        if (v.getId() == R.id.imgCC){
            if (gato[2] == 0 && turno == 1) {
                imgCC.setImageResource(R.drawable.bob);
                gato[2] = 1;
                ConfirmarBob();
                turno = 2;
            }
            else  if (gato[2] == 0 && turno == 2){
                imgCC.setImageResource(R.drawable.patricio);
                gato[2] = 2;
                ConfirmarBob();
                turno = 1;
            }
    }

            if (v.getId() == R.id.imgDD) {
                if (gato[3] == 0 && turno ==1) {
                    imgDD.setImageResource(R.drawable.bob);
                    gato[3] = 1;
                    ConfirmarBob();
                    turno = 2;
                }
                else  if (gato[3] == 0 && turno == 2){
                    imgDD.setImageResource(R.drawable.patricio);
                    gato[3] = 2;
                    ConfirmarBob();
                    turno = 1;
                }
            }

        if (v.getId() == R.id.imgEE) {
            if (gato[4] == 0 && turno ==1) {
                imgEE.setImageResource(R.drawable.bob);
                gato[4] = 1;
                ConfirmarBob();
                turno =2;
            }
            else  if (gato[4] == 0 && turno == 2){
                imgEE.setImageResource(R.drawable.patricio);
                gato[4] = 2;
                ConfirmarBob();
                turno = 1;
            }
        }

        if (v.getId() == R.id.imgFF){
                if(gato[5] == 0 && turno == 1){
                    imgFF.setImageResource(R.drawable.bob);
                    gato[5] = 1;
                    ConfirmarBob();
                    turno = 2;
                }
                else  if (gato[5] == 0 && turno == 2){
                    imgFF.setImageResource(R.drawable.patricio);
                    gato[5] = 2;
                    ConfirmarBob();
                    turno = 1;
                }

        }
        if (v.getId() == R.id.imgGG) {
            if (gato[6] == 0 && turno == 1) {
                imgGG.setImageResource(R.drawable.bob);
                gato[6] = 1;
                ConfirmarBob();
                turno = 2;
            }
            else  if (gato[6] == 0 && turno == 2){
                imgGG.setImageResource(R.drawable.patricio);
                gato[6] = 2;
                ConfirmarBob();
                turno = 1;
            }
        }

        if (v.getId() == R.id.imgHH) {
            if (gato[7] == 0 && turno == 1) {
                imgHH.setImageResource(R.drawable.bob);
                gato[7] = 1;
                ConfirmarBob();
                turno = 2;
            }
            else  if (gato[7] == 0 && turno == 2){
                imgHH.setImageResource(R.drawable.patricio);
                gato[7] = 2;
                ConfirmarBob();
                turno = 1;
            }
        }

        if (v.getId() == R.id.imgII) {
            if (gato[8] == 0 && turno == 1) {
                imgII.setImageResource(R.drawable.bob);
                gato[8] = 1;
                ConfirmarBob();
                turno = 2;
            }
            else  if (gato[8] == 0 && turno == 2){
                imgII.setImageResource(R.drawable.patricio);
                gato[8] = 2;
                ConfirmarBob();
                turno = 1;
            }
        }
    }




    public void ConfirmarBob(){
        if(gato[0] == 1 && gato[1]==1 && gato[2]==1) bobgana = true;
        if(gato[3] == 1 && gato[4]==1 && gato[5]==1) bobgana = true;
        if(gato[6] == 1 && gato[7]==1 && gato[8]==1) bobgana = true;



        if(gato[0] == 1 && gato[3]==1 && gato[6]==1) bobgana = true;
        if(gato[1] == 1 && gato[4]==1 && gato[7]==1) bobgana = true;
        if(gato[2] == 1 && gato[5]==1 && gato[8]==1) bobgana = true;


        if(gato[8] == 1 && gato[4]==1 && gato[0]==1) bobgana = true;
        if(gato[6] == 1 && gato[4]==1 && gato[2]==1) bobgana = true;


        if(bobgana==true){
            Toast.makeText(this, "Gano Bob Esponja!! Empieza Bob", Toast.LENGTH_SHORT).show();
            borrar();
        }



        if(gato[0] == 2 && gato[1]==2 && gato[2]==2) patgana = true;
        if(gato[3] == 2 && gato[4]==2 && gato[5]==2) patgana = true;
        if(gato[6] == 2 && gato[7]==2 && gato[8]==2) patgana = true;



        if(gato[0] == 2 && gato[3]==2 && gato[6]==2) patgana = true;
        if(gato[1] == 2 && gato[4]==2 && gato[7]==2) patgana = true;
        if(gato[2] == 2 && gato[5]==2 && gato[8]==2) patgana = true;



        if(gato[8] == 2 && gato[4]==2 && gato[0]==2) patgana = true;
        if(gato[6] == 2 && gato[4]==2 && gato[2]==2) patgana = true;
        if(gato[2] == 2 && gato[4]==2 && gato[6]==2) patgana = true;


        if(patgana==true){
            Toast.makeText(this, "Gano Patricio!! Empieza Patricio", Toast.LENGTH_SHORT).show();
            borrar();
        }


    }

    public void borrar(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imgAA.setImageDrawable(null);
                imgBB.setImageDrawable(null);
                imgCC.setImageDrawable(null);
                imgDD.setImageDrawable(null);
                imgEE.setImageDrawable(null);
                imgFF.setImageDrawable(null);
                imgGG.setImageDrawable(null);
                imgHH.setImageDrawable(null);
                imgII.setImageDrawable(null);

                if(bobgana == true){
                    turno = 1;
                }
                else {
                    turno = 2;
                }

                bobgana = false;
                patgana = false;

                for (int i = 0; i <= 8; i++){
                    gato[i] = 0;
                }


            }
        },000);
    }

    public void resultado() {
        Intent intent = new Intent(Segunda.this, Ganador.class);
        intent.putExtra("ganadasbobb", ganadasbob);
        intent.putExtra("ganadaspatt", ganadaspat);
        startActivity(intent);
    }

}
