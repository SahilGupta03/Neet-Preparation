package com.sahil.neetpreparation2021.previous;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sahil.neetpreparation2021.AnswerActivity;
import com.sahil.neetpreparation2021.R;

public class ZeronineActivity extends AppCompatActivity {

    LinearLayout aipmt,aiims;
    DatabaseReference database;
    String message,message1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeronine);

        aipmt=findViewById(R.id.aiPmt2009);
        aiims=findViewById(R.id.aiiMs2009);

        // aiims
        database= FirebaseDatabase.getInstance().getReference().child("2009").child("Aiims");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZeronineActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        aiims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                CharSequence options[]=new CharSequence[]{

                        "View",
                        "Cancel"
                };
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                builder.setTitle("Choose One");
                builder.setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (which==0){
                            Intent intent=new Intent(v.getContext(), AnswerActivity.class);
                            intent.putExtra("url",message);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // aipmt
        database= FirebaseDatabase.getInstance().getReference().child("2009").child("Aipmt");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZeronineActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        aipmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                CharSequence options[]=new CharSequence[]{

                        "View",
                        "Cancel"
                };
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                builder.setTitle("Choose One");
                builder.setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (which==0){
                            Intent intent=new Intent(v.getContext(), AnswerActivity.class);
                            intent.putExtra("url",message1);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });



    }
}