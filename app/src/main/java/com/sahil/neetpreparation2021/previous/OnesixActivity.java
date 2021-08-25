package com.sahil.neetpreparation2021.previous;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

public class OnesixActivity extends AppCompatActivity {
    LinearLayout onesix,twosix,threesix,neetphaseone,neetphasetwo,phyp,chep,biop,aap,bbq;
    DatabaseReference database,database1,database2,database3,database4,database5,database6,database7,database8,database9;
    String message,message1,message2,message3,message4,message5,message6,message7,message8,message9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onesix);

        onesix=findViewById(R.id.sixOneLayout);
        twosix=findViewById(R.id.sixTwoLayout);
        threesix=findViewById(R.id.sixThreeLayout);
        neetphaseone=findViewById(R.id.neetPhaseOne);
        neetphasetwo=findViewById(R.id.neetPhaseTwo);
        phyp=findViewById(R.id.phyP);
        chep=findViewById(R.id.cheP);
        biop=findViewById(R.id.bioP);
        aap=findViewById(R.id.aaP);
        bbq=findViewById(R.id.bbQ);


        // 2016(1)
        database= FirebaseDatabase.getInstance().getReference().child("2016").child("2016(1)");
        database.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        onesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                CharSequence options[]=new CharSequence[]{
//                       "Download",
                        "View",
                        "Cancel"
                };
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                builder.setTitle("Choose One");
                builder.setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        if (which==0){
//                            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(message));
//                            startActivity(intent);
//                        }
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

        //2016(3)
        database1= FirebaseDatabase.getInstance().getReference().child("2016").child("2016(3)");
        database1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message2=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        threesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //2016(2)
        database2=FirebaseDatabase.getInstance().getReference().child("2016").child("2016(2)");
        database2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message1=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });

        twosix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //neet phase 1

        database3= FirebaseDatabase.getInstance().getReference().child("2016").child("phase1");
        database3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message3=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        neetphaseone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //neet phase 2

        database4= FirebaseDatabase.getInstance().getReference().child("2016").child("phase2");
        database4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message4=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        neetphasetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //phy
        database5= FirebaseDatabase.getInstance().getReference().child("2016").child("phys");
        database5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message5=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        phyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //che
        database6= FirebaseDatabase.getInstance().getReference().child("2016").child("che");
        database6.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message6=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        chep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        //bio
        database7= FirebaseDatabase.getInstance().getReference().child("2016").child("biology");
        database7.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message7=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        biop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //AA-PP-WW
        database8= FirebaseDatabase.getInstance().getReference().child("2016").child("AA-PP-WW");
        database8.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message8=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        aap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        //BB-QQ-XX

        database9= FirebaseDatabase.getInstance().getReference().child("2016").child("BB-QQ-XX");
        database9.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                message9=snapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(OnesixActivity.this, "Error Loading PDF", Toast.LENGTH_SHORT).show();
            }
        });
        bbq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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



    }
}