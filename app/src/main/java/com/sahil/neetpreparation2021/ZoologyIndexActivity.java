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

public class ZoologyIndexActivity extends AppCompatActivity {


    LinearLayout zoo111,zoo112,zoo113,zoo114,zoo115,zoo116,zoo117,zoo118,zoo119,
            zoo121,zoo122,zoo123,zoo124,zoo125,zoo126,zoo127;
    DatabaseReference database;
    String message111,message112,message113,message114,message115,message116,message117,message118,message119,
            message121,message122,message123,message124,message125,message126,message127;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoology_index);

        getSupportActionBar().setTitle("Zoology");
        getSupportActionBar().setSubtitle("Preparation");

        zoo111=findViewById(R.id.zoo111);
        zoo112=findViewById(R.id.zoo112);
        zoo113=findViewById(R.id.zoo113);
        zoo114=findViewById(R.id.zoo114);
        zoo115=findViewById(R.id.zoo115);
        zoo116=findViewById(R.id.zoo116);
        zoo117=findViewById(R.id.zoo117);
        zoo118=findViewById(R.id.zoo118);
        zoo119=findViewById(R.id.zoo119);

        zoo121=findViewById(R.id.zoo121);
        zoo122=findViewById(R.id.zoo122);
        zoo123=findViewById(R.id.zoo123);
        zoo124=findViewById(R.id.zoo124);
        zoo125=findViewById(R.id.zoo125);
        zoo126=findViewById(R.id.zoo126);
        zoo127=findViewById(R.id.zoo127);


        // zoo111
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message111=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo111.setOnClickListener(new View.OnClickListener() {
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

        // zoo112
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message112=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo112.setOnClickListener(new View.OnClickListener() {
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

        // zoo113
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message113=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo113.setOnClickListener(new View.OnClickListener() {
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

        // zoo114
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message114=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo114.setOnClickListener(new View.OnClickListener() {
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

        // zoo115
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message115=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo115.setOnClickListener(new View.OnClickListener() {
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

        // zoo116
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message116=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo116.setOnClickListener(new View.OnClickListener() {
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

        // zoo117
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message117=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo117.setOnClickListener(new View.OnClickListener() {
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

        // zoo118
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("8");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message118=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo118.setOnClickListener(new View.OnClickListener() {
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

        // zoo119
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("11th").child("9");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message119=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo119.setOnClickListener(new View.OnClickListener() {
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

        // zoo121
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("1");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message121=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo121.setOnClickListener(new View.OnClickListener() {
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

        // zoo122
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("2");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message122=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo122.setOnClickListener(new View.OnClickListener() {
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

        // zoo123
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("3");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message123=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo123.setOnClickListener(new View.OnClickListener() {
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

        // zoo124
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("4");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message124=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo124.setOnClickListener(new View.OnClickListener() {
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

        // zoo125
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("5");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message125=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo125.setOnClickListener(new View.OnClickListener() {
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

        // zoo126
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("6");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message126=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo126.setOnClickListener(new View.OnClickListener() {
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

        // zoo127
        database= FirebaseDatabase.getInstance().getReference().child("zoo").child("12th").child("7");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message127=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ZoologyIndexActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        zoo127.setOnClickListener(new View.OnClickListener() {
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
    }
}