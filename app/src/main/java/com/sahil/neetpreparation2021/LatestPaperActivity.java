package com.sahil.neetpreparation2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class LatestPaperActivity extends AppCompatActivity {

    PDFView paper;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_paper);

        getSupportActionBar().setTitle("Latest Paper");
        getSupportActionBar().setSubtitle("Preparation");

        ans=findViewById(R.id.answerKey);
        paper=findViewById(R.id.latestPaper);

        paper.fromAsset("paperfirst.pdf").load();

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LatestPaperActivity.this,PaperLatestActivity.class);
                startActivity(intent);
            }
        });
    }
}