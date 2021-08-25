package com.sahil.neetpreparation2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView phy,che,bot,zoo;
//    TextView previous;
    TextView latest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phy=findViewById(R.id.cardPhysics);
        che=findViewById(R.id.cardChemistry);
        bot=findViewById(R.id.cardBotony);
        zoo=findViewById(R.id.cardZoology);
//        previous=findViewById(R.id.gotoCheck);
        latest=findViewById(R.id.seeLatest);

        getSupportActionBar().hide();


        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PhysicsIndexActivity.class);
                startActivity(intent);
            }
        });
        che.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ChemistryIndexActivity.class);
                startActivity(intent);
            }
        });
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, BotanyIndexActivity.class);
                startActivity(intent);
            }
        });
        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PreviousYearActivity.class);
                startActivity(intent);
            }
        });
//        previous.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,PreviousYearActivity.class);
//                startActivity(intent);
//            }
//        });
        latest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LatestPaperActivity.class);
                startActivity(intent);
            }
        });


    }
}