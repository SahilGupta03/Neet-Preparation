package com.sahil.neetpreparation2021;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

public class PhyActivity extends AppCompatActivity {

    LinearLayout phy111,phy112,phy113,phy114,phy115,phy116,phy117,phy118,phy119,phy1110,phy1111,phy1112,phy1113,phy1114,phy1115,
            phy121,phy122,phy123,phy124,phy125,phy126,phy127,phy128,phy129,phy1210, phy1211, phy1212, phy1213, phy1214;

    DatabaseReference database;

    String message111,message112,message113,message114,message115,message116,message117,message118,message119,message1110,message1111,message1112,message1113,message1114,message1115,
            message121,message122,message123,message124,message125,message126,message127,message128,message129,message1210,message1211,message1212,message1213,message1214;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy);


        phy111=findViewById(R.id.phy111);
        phy112=findViewById(R.id.phy112);
        phy113=findViewById(R.id.phy113);
        phy114=findViewById(R.id.phy114);
        phy115=findViewById(R.id.phy115);
        phy116=findViewById(R.id.phy116);
        phy117=findViewById(R.id.phy117);
        phy118=findViewById(R.id.phy118);
        phy119=findViewById(R.id.phy119);
        phy1110=findViewById(R.id.phy1110);
        phy1111=findViewById(R.id.phy1111);
        phy1112=findViewById(R.id.phy1112);
        phy1113=findViewById(R.id.phy1113);
        phy1114=findViewById(R.id.phy1114);
        phy1115=findViewById(R.id.phy1115);
        phy121=findViewById(R.id.phy121);
        phy122=findViewById(R.id.phy122);
        phy123=findViewById(R.id.phy123);
        phy124=findViewById(R.id.phy124);
        phy125=findViewById(R.id.phy125);
        phy126=findViewById(R.id.phy126);
        phy127=findViewById(R.id.phy127);
        phy128=findViewById(R.id.phy128);
        phy129=findViewById(R.id.phy129);
        phy1210=findViewById(R.id.phy1210);

    }
}