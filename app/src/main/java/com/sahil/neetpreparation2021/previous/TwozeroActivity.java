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

public class TwozeroActivity extends AppCompatActivity {
    LinearLayout e1,e2,e3,e4,f1,f2,g1,g2,g3,h1,h2;
    DatabaseReference database;
    String message,message1,message2,message3,message4,message5,message6,message7,message8,message9,message10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twozero);

        e1=findViewById(R.id.idE1);
        e2=findViewById(R.id.idE2);
        e3=findViewById(R.id.idE3);
        e4=findViewById(R.id.idE4);
        f1=findViewById(R.id.idF1);
        f2=findViewById(R.id.idF2);
        g1=findViewById(R.id.idG1);
        g2=findViewById(R.id.idG2);
        g3=findViewById(R.id.idG3);
        h1=findViewById(R.id.idH1);
        h2=findViewById(R.id.idH2);

        // E1
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("E1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        e1.setOnClickListener(new View.OnClickListener() {
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

        // E2
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("E2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
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

        // E3
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("E3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message2=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message2);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // E4
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("E4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message3=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message3);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });
        // F1
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("F1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message4=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        f1.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message4);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // F2
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("F2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message5=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message5);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // G1
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("G1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message6=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        g1.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message6);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // G2
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("G2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message7=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        g2.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message7);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });
        // G3
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("G3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message8=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        g3.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message8);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // H1
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("H1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message9=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message9);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });


        // H2
        database= FirebaseDatabase.getInstance().getReference().child("2020").child("H2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message10=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TwozeroActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message10);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });








    }
}