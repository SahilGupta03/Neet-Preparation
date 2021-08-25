package com.sahil.neetpreparation2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class PaperLatestActivity extends AppCompatActivity {
    PDFView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_latest);

        getSupportActionBar().setTitle("Answer Key");

        ans=findViewById(R.id.latestAns);
        ans.fromAsset("ansfirst.pdf").load();




    }
}