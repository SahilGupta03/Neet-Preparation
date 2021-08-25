package com.sahil.neetpreparation2021;

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
import com.sahil.neetpreparation2021.R;

public class ChemistryIndexActivity extends AppCompatActivity {

    LinearLayout che111,che112,che113,che114,che115,che116,che117,che118,che119,che1110,che1111,che1112,che1113,che1114,
            che121,che122,che123,che124,che125,che126,che127,che128,che129,che1210,che1211,che1212,che1213,che1214,che1215,che1216;
    DatabaseReference database;
    String message111,message112,message113,message114,message115,message116,message117,message118,message119,message1110,message1111,message1112,message1113,message1114,
            message121,message122,message123,message124,message125,message126,message127,message128,message129,message1210,message1211,message1212,message1213,message1214,message1215,message1216;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_index);

        getSupportActionBar().setTitle("Chemistry");
        getSupportActionBar().setSubtitle("Preparation");

        che111=findViewById(R.id.che111);
        che112=findViewById(R.id.che112);
        che113=findViewById(R.id.che113);
        che114=findViewById(R.id.che114);
        che115=findViewById(R.id.che115);
        che116=findViewById(R.id.che116);
        che117=findViewById(R.id.che117);
        che118=findViewById(R.id.che118);
        che119=findViewById(R.id.che119);
        che1110=findViewById(R.id.che1110);
        che1111=findViewById(R.id.che1111);
        che1112=findViewById(R.id.che1112);
        che1113=findViewById(R.id.che1113);
        che1114=findViewById(R.id.che1114);
        che121=findViewById(R.id.che121);
        che122=findViewById(R.id.che122);
        che123=findViewById(R.id.che123);
        che124=findViewById(R.id.che124);
        che125=findViewById(R.id.che125);
        che126=findViewById(R.id.che126);
        che127=findViewById(R.id.che127);
        che128=findViewById(R.id.che128);
        che129=findViewById(R.id.che129);
        che1210=findViewById(R.id.che1210);
        che1211=findViewById(R.id.che1211);
        che1212=findViewById(R.id.che1212);
        che1213=findViewById(R.id.che1213);
        che1214=findViewById(R.id.che1214);
        che1215=findViewById(R.id.che1215);
        che1216=findViewById(R.id.che1216);

        // Che111
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che111.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message111);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che112
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che112.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message112);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che113
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che113.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message113);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che114
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che114.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message114);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che115
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message115=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che115.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message115);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che116
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message116=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che116.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message116);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che117
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message117=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che117.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message117);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che118
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message118=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che118.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message118);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che119
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message119=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che119.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message119);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1110
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("10");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1110=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1110.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1110);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1111
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("11");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1111.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1111);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1112
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("12");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1112.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1112);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1113
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("13");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1113.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1113);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1114
        database= FirebaseDatabase.getInstance().getReference().child("che").child("11th").child("14");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1114.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1114);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che121
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message121=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che121.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message121);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che122
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message122=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che122.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message122);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che123
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message123=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che123.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message123);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che124
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message124=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che124.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message124);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che125
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message125=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che125.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message125);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che126
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message126=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che126.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message126);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che127
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message127=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che127.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message127);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che128
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message128=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che128.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message128);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che129
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message129=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che129.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message129);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1210
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("10");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1210=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1210.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1210);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1211
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("11");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1211=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1211.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1211);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1212
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("12");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1212=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1212.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1212);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1213
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("13");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1213=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1213.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1213);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1214
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("14");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1214=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1214.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1214);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1215
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("15");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1215=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1215.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1215);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // Che1216
        database= FirebaseDatabase.getInstance().getReference().child("che").child("12").child("16");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1216=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ChemistryIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        che1216.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1216);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });
    }
}