package com.sahil.neetpreparation2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sahil.neetpreparation2021.previous.OneeightActivity;
import com.sahil.neetpreparation2021.previous.OnefiveActivity;
import com.sahil.neetpreparation2021.previous.OnefourActivity;
import com.sahil.neetpreparation2021.previous.OnenineActivity;
import com.sahil.neetpreparation2021.previous.OneoneActivity;
import com.sahil.neetpreparation2021.previous.OnesevenActivity;
import com.sahil.neetpreparation2021.previous.OnesixActivity;
import com.sahil.neetpreparation2021.previous.OnethreeActivity;
import com.sahil.neetpreparation2021.previous.OnezeroActivity;
import com.sahil.neetpreparation2021.previous.TwozeroActivity;
import com.sahil.neetpreparation2021.previous.ZeroeightActivity;
import com.sahil.neetpreparation2021.previous.ZerofiveActivity;
import com.sahil.neetpreparation2021.previous.ZeronineActivity;
import com.sahil.neetpreparation2021.previous.ZerosevenActivity;
import com.sahil.neetpreparation2021.previous.ZerosixActivity;
import com.sahil.neetpreparation2021.previous.oneTwoActivity;

public class PreviousYearActivity extends AppCompatActivity {

    TextView twozero,onenine,oneeight,oneseven,onesix,onefive,onefour,onethree,onetwo,oneone,onezero,zeronine,zeroeight,
    zeroseven,zerosix,zerofive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_year);

        getSupportActionBar().setTitle("NEET");
        getSupportActionBar().setSubtitle("Preparation");
        twozero=findViewById(R.id.twoZero);
        onenine=findViewById(R.id.oneNine);
        oneeight=findViewById(R.id.oneEight);
        oneseven=findViewById(R.id.oneSeven);
        onesix=findViewById(R.id.oneSix);
        onefive=findViewById(R.id.oneFive);
        onefour=findViewById(R.id.oneFour);
        onethree=findViewById(R.id.oneThree);
        onetwo=findViewById(R.id.oneTwo);
        oneone=findViewById(R.id.oneOne);
        onezero=findViewById(R.id.oneZero);
        zeronine=findViewById(R.id.zeroNine);
        zeroeight=findViewById(R.id.zeroEight);
        zeroseven=findViewById(R.id.zeroSeven);
        zerosix=findViewById(R.id.zeroSix);
        zerofive=findViewById(R.id.zeroFive);

        twozero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2020", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, TwozeroActivity.class);
                startActivity(intent);
            }
        });
        onenine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2019", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnenineActivity.class);
                startActivity(intent);
            }
        });
        oneeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2018", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OneeightActivity.class);
                startActivity(intent);
            }
        });
        oneseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2017", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnesevenActivity.class);
                startActivity(intent);
            }
        });
        onesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2016", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnesixActivity.class);
                startActivity(intent);
            }
        });
        onefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2015", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnefiveActivity.class);
                startActivity(intent);
            }
        });
        onefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2014", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnefourActivity.class);
                startActivity(intent);
            }
        });
        onethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2013", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnethreeActivity.class);
                startActivity(intent);
            }
        });
        onetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2012", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, oneTwoActivity.class);
                startActivity(intent);
            }
        });
        oneone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2011", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OneoneActivity.class);
                startActivity(intent);
            }
        });
        onezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2010", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, OnezeroActivity.class);
                startActivity(intent);
            }
        });
        zeronine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2009", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, ZeronineActivity.class);
                startActivity(intent);
            }
        });
        zeroeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2008", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, ZeroeightActivity.class);
                startActivity(intent);
            }
        });
        zeroseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2007", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, ZerosevenActivity.class);
                startActivity(intent);
            }
        });
        zerosix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2006", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, ZerosixActivity.class);
                startActivity(intent);
            }
        });
        zerofive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreviousYearActivity.this, "go to 2005", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(PreviousYearActivity.this, ZerofiveActivity.class);
                startActivity(intent);
            }
        });
    }
}