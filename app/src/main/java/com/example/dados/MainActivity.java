package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgResult;
    private Button btnLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgResult = (ImageView) findViewById(R.id.resultImage);
        btnLanzar = (Button) findViewById(R.id.btnLanzar);
        btnLanzar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(btnLanzar == view){
            Lanzar();
        }
    }

    private void Lanzar() {
        Random  r = new Random();
        int random = r.nextInt(6)+1;
        switch (random){
            case 1:
                imgResult.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imgResult.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imgResult.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imgResult.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imgResult.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imgResult.setImageResource(R.drawable.dice_6);
                break;
            default:
                imgResult.setImageResource(R.drawable.empty_dice);
                break;
        }
    }
}