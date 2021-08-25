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
import com.sahil.neetpreparation2021.previous.OneeightActivity;

public class PhysicsIndexActivity extends AppCompatActivity {


    LinearLayout phy111,phy112,phy113,phy114,phy115,phy116,phy117,phy118,phy119,phy1110,phy1111,phy1112,phy1113,phy1114,phy1115,
            phy121,phy122,phy123,phy124,phy125,phy126,phy127,phy128,phy129,phy1210, phy1211, phy1212, phy1213, phy1214;

    DatabaseReference database;

    String message111,message112,message113,message114,message115,message116,message117,message118,message119,message1110,message1111,message1112,message1113,message1114,message1115,
            message121,message122,message123,message124,message125,message126,message127,message128,message129,message1210,message1211,message1212,message1213,message1214;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_index);

        getSupportActionBar().setTitle("Physics");
        getSupportActionBar().setSubtitle("Preparation");

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
        phy1211=findViewById(R.id.phy1211);
        phy1212=findViewById(R.id.phy1212);
        phy1213=findViewById(R.id.phy1213);
        phy1214=findViewById(R.id.phy1214);

        // phy111
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy111.setOnClickListener(new View.OnClickListener() {
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

        //phy112
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy112.setOnClickListener(new View.OnClickListener() {
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

        // phy113
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy113.setOnClickListener(new View.OnClickListener() {
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

        // phy114
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy114.setOnClickListener(new View.OnClickListener() {
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

        // phy115
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message115=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy115.setOnClickListener(new View.OnClickListener() {
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

        // phy116
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message116=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy116.setOnClickListener(new View.OnClickListener() {
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

        // phy117
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message117=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy117.setOnClickListener(new View.OnClickListener() {
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

        // phy118
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message118=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy118.setOnClickListener(new View.OnClickListener() {
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

        // phy119
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message119=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy119.setOnClickListener(new View.OnClickListener() {
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

        // phy1110
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("10");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1110=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1110.setOnClickListener(new View.OnClickListener() {
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

        // phy1111
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("11");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1111.setOnClickListener(new View.OnClickListener() {
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

        // phy1112
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("12");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1112.setOnClickListener(new View.OnClickListener() {
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

        // phy1113
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("13");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1113.setOnClickListener(new View.OnClickListener() {
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

        // phy1114
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("14");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1114.setOnClickListener(new View.OnClickListener() {
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

        // phy1115
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("11th").child("15");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1115=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1115.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1115);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });


        // phy121
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message121=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy121.setOnClickListener(new View.OnClickListener() {
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

        // phy122
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message122=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy122.setOnClickListener(new View.OnClickListener() {
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

        // phy123
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message123=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy123.setOnClickListener(new View.OnClickListener() {
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

        // phy124
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message124=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy124.setOnClickListener(new View.OnClickListener() {
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

        // phy125
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message125=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy125.setOnClickListener(new View.OnClickListener() {
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

        // phy126
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message126=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy126.setOnClickListener(new View.OnClickListener() {
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

        // phy127
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message127=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy127.setOnClickListener(new View.OnClickListener() {
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

        // phy128
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message128=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy128.setOnClickListener(new View.OnClickListener() {
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

        // phy129
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message129=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy129.setOnClickListener(new View.OnClickListener() {
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

        // phy1210
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("10");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1210=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1210.setOnClickListener(new View.OnClickListener() {
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

        // phy1211
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("11");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1211=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1211.setOnClickListener(new View.OnClickListener() {
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

        // phy1212
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("12");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1212=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1212.setOnClickListener(new View.OnClickListener() {
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

        // phy1213
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("13");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1213=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1213.setOnClickListener(new View.OnClickListener() {
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

        // phy1214
        database= FirebaseDatabase.getInstance().getReference().child("phy").child("12th").child("14");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1214=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(PhysicsIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phy1214.setOnClickListener(new View.OnClickListener() {
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

    }

}