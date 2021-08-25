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

public class BotanyIndexActivity extends AppCompatActivity {


    LinearLayout bot111,bot112,bot113,bot114,bot115,bot116,bot117,bot118,bot119,bot1110,bot1111,bot1112,bot1113,bot1114,bot1115,bot1116,bot1117,bot1118,bot1119
            ,bot1120,bot1121,bot1122,
            bot121,bot122,bot123,bot124,bot125,bot126,bot127,bot128,bot129,bot1210,bot1211,bot1212,bot1213,bot1214,bot1215,bot1216;
    DatabaseReference database;
    String message111,message112,message113,message114,message115,message116,message117,message118,message119,message1110,message1111,message1112,message1113,
            message1114,message1115,message1116,message1117,message1118,message1119,message1120,message1121,message1122,

            message121,message122,message123,message124,message125,message126,message127,message128,message129,message1210,message1211,message1212,message1213,message1214
            ,message1215,message1216;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botany_index);

        getSupportActionBar().setTitle("Botany");
        getSupportActionBar().setSubtitle("Preparation");

        bot111=findViewById(R.id.bot111);
        bot112=findViewById(R.id.bot112);
        bot113=findViewById(R.id.bot113);
        bot114=findViewById(R.id.bot114);
        bot115=findViewById(R.id.bot115);
        bot116=findViewById(R.id.bot116);
        bot117=findViewById(R.id.bot117);
        bot118=findViewById(R.id.bot118);
        bot119=findViewById(R.id.bot119);
        bot1110=findViewById(R.id.bot1110);
        bot1111=findViewById(R.id.bot1111);
        bot1112=findViewById(R.id.bot1112);
        bot1113=findViewById(R.id.bot1113);
        bot1114=findViewById(R.id.bot1114);
        bot1115=findViewById(R.id.bot1115);
        bot1116=findViewById(R.id.bot1116);
        bot1117=findViewById(R.id.bot1117);
        bot1118=findViewById(R.id.bot1118);
        bot1119=findViewById(R.id.bot1119);
        bot1120=findViewById(R.id.bot1120);
        bot1121=findViewById(R.id.bot1121);
        bot1122=findViewById(R.id.bot1122);
        bot121=findViewById(R.id.bot121);
        bot122=findViewById(R.id.bot122);
        bot123=findViewById(R.id.bot123);
        bot124=findViewById(R.id.bot124);
        bot125=findViewById(R.id.bot125);
        bot126=findViewById(R.id.bot126);
        bot127=findViewById(R.id.bot127);
        bot128=findViewById(R.id.bot128);
        bot129=findViewById(R.id.bot129);
        bot1210=findViewById(R.id.bot1210);
        bot1211=findViewById(R.id.bot1211);
        bot1212=findViewById(R.id.bot1212);
        bot1213=findViewById(R.id.bot1213);
        bot1214=findViewById(R.id.bot1214);
        bot1215=findViewById(R.id.bot1215);
        bot1216=findViewById(R.id.bot1216);


        // bot111
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot111.setOnClickListener(new View.OnClickListener() {
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

        // bot112
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot112.setOnClickListener(new View.OnClickListener() {
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

        // bot113
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot113.setOnClickListener(new View.OnClickListener() {
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

        // bot114
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot114.setOnClickListener(new View.OnClickListener() {
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

        // bot115
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message115=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot115.setOnClickListener(new View.OnClickListener() {
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

        // bot116
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message116=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot116.setOnClickListener(new View.OnClickListener() {
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

        // bot117
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message117=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot117.setOnClickListener(new View.OnClickListener() {
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

        // bot118
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message118=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot118.setOnClickListener(new View.OnClickListener() {
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

        // bot119
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message119=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot119.setOnClickListener(new View.OnClickListener() {
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

        // bot1110
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("10");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1110=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1110.setOnClickListener(new View.OnClickListener() {
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

        // bot1111
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("11");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1111.setOnClickListener(new View.OnClickListener() {
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

        // bot1112
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("12");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1112.setOnClickListener(new View.OnClickListener() {
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

        // bot1113
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("13");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1113.setOnClickListener(new View.OnClickListener() {
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

        // bot1114
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("14");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1114.setOnClickListener(new View.OnClickListener() {
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

        // bot1115
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("15");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1115=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1115.setOnClickListener(new View.OnClickListener() {
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

        // bot1116
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("16");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1116=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1116.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1116);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot1117
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("17");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1117=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1117.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1117);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot1118
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("18");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1118=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1118.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1118);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot1119
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("19");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1119=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1119.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1119);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot1120
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("20");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1120=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1120.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1120);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot1121
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("21");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1121=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1121.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1121);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot1122
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("11th").child("22");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1122=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1122.setOnClickListener(new View.OnClickListener() {
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
                            intent.putExtra("url",message1122);
                            startActivity(intent);
                        }
                    }
                });
                builder.show();
            }
        });

        // bot121
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message121=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot121.setOnClickListener(new View.OnClickListener() {
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

        // bot122
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message122=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot122.setOnClickListener(new View.OnClickListener() {
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

        // bot123
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message123=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot123.setOnClickListener(new View.OnClickListener() {
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

        // bot124
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message124=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot124.setOnClickListener(new View.OnClickListener() {
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

        // bot125
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message125=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot125.setOnClickListener(new View.OnClickListener() {
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

        // bot126
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message126=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot126.setOnClickListener(new View.OnClickListener() {
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

        // bot127
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message127=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot127.setOnClickListener(new View.OnClickListener() {
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

        // bot128
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message128=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot128.setOnClickListener(new View.OnClickListener() {
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

        // bot129
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message129=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot129.setOnClickListener(new View.OnClickListener() {
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

        // bot1210
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("10");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1210=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1210.setOnClickListener(new View.OnClickListener() {
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

        // bot1211
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("11");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1211=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1211.setOnClickListener(new View.OnClickListener() {
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

        // bot1212
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("12");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1212=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1212.setOnClickListener(new View.OnClickListener() {
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

        // bot1213
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("13");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1213=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1213.setOnClickListener(new View.OnClickListener() {
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

        // bot1214
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("14");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1214=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1214.setOnClickListener(new View.OnClickListener() {
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

        // bot1215
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("15");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1215=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1215.setOnClickListener(new View.OnClickListener() {
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

        // bot1216
        database= FirebaseDatabase.getInstance().getReference().child("bot").child("12th").child("16");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1216=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(BotanyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bot1216.setOnClickListener(new View.OnClickListener() {
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