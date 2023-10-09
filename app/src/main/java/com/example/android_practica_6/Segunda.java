package com.example.android_practica_6;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Segunda extends AppCompatActivity {

    private final List<int[]> combinationsList = new ArrayList<>();

    private int [] boxPositions = {0,0,0,0,0,0,0,0,0};

    private int turno = 1;

    private int totalBoxes = 1;

    private ImageView img1, img2, imgA, imgB, imgC, imgD, imgE, imgF, imgG, imgH, imgI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        imgA = findViewById(R.id.imgA);
        imgB = findViewById(R.id.imgB);
        imgC = findViewById(R.id.imgC);
        imgD = findViewById(R.id.imgD);
        imgE = findViewById(R.id.imgE);
        imgF = findViewById(R.id.imgF);
        imgG = findViewById(R.id.imgG);
        imgH = findViewById(R.id.imgH);
        imgI = findViewById(R.id.imgI);

        combinationsList.add(new int[]{0,1,2});
        combinationsList.add(new int[]{3,4,5});
        combinationsList.add(new int[]{6,7,8});
        combinationsList.add(new int[]{0,3,6});
        combinationsList.add(new int[]{1,4,7});
        combinationsList.add(new int[]{2,5,8});
        combinationsList.add(new int[]{2,4,6});
        combinationsList.add(new int[]{0,4,8});

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(0)){

                }
            }
        });

        imgB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(1)){

                }
            }
        });

        imgC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(2)){

                }
            }
        });

        imgD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(3)){

                }
            }
        });

        imgE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(4)){

                }
            }
        });

        imgF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(5)){

                }
            }
        });

        imgG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(6)){

                }
            }
        });

        imgH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(7)){

                }
            }
        });

        imgI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(IsBoxSelectable(8)){

                }
            }
        });

    }

    private boolean IsBoxSelectable(int boxPosition){
        boolean response  = false;

        if(boxPositions[boxPosition] == 0){
            response = true;
        }
        return response;
    }

    private void performAction(ImageView ImageView, int SelectBoxPosition){
        boxPositions[SelectBoxPosition] = turno;

        if(turno == 0){
            ImageView.setImageResource(R.drawable.bob);

            if(check()){

            }
        }

    }
    private boolean check(){
        boolean response = false;
        for(int i = 0; i<combinationsList.size(); i++){
            final int [] combination = combinationsList.get(i);

            if(boxPositions[combination[0]] == turno && boxPositions[combination[1]] == turno && boxPositions[combination[2]] == turno){
                response = true;
            }
        }
        return response;
    }

}
