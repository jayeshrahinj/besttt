package com.example.bestbuyy;

import static com.example.bestbuyy.R.id.uemail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profileActivity extends AppCompatActivity {
FirebaseAuth mauth;
TextView logout,uname,uemail,ratecount;
FirebaseUser firebaseUser;
ImageView homebtn,profilebtn;
RatingBar ratingBar;
Float ratevalue;
Button submit;
String temp;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        logout =findViewById(R.id.logout);
        uname = findViewById(R.id.uname);
        submit = findViewById(R.id.submit);
        ratecount = findViewById(R.id.ratecount);
        uemail = findViewById(R.id.uemail);
        homebtn = findViewById(R.id.homebtn);
        profilebtn = findViewById(R.id.profilebtn);
        ratingBar = findViewById(R.id.ratingBar);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        uemail.setText(firebaseUser.getEmail());
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(profileActivity.this,LoginActivity.class));
                Toast.makeText(profileActivity.this, "logout", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratevalue = ratingBar.getRating();
                if(ratevalue<=1 && ratevalue>0)
                    ratecount.setText("Bad" + ratevalue + "/5");
                else if(ratevalue<=2 && ratevalue>1)
                    ratecount.setText("OK" + ratevalue + "/5");
                else if(ratevalue<=3 && ratevalue>2)
                    ratecount.setText("Good" + ratevalue + "/5");
                else if(ratevalue<=4 && ratevalue>3)
                    ratecount.setText("Very Good" + ratevalue + "/5");
                else if(ratevalue<=5 && ratevalue>4)
                    ratecount.setText("Excellent" + ratevalue + "/5");

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(profileActivity.this, "Feedback Submit", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(profileActivity.this,home_Navbar_Activity.class));
                finish();
            }
        });

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileActivity.this,profileActivity.class)
                        ;
                startActivity(intent);
            }
        });
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileActivity.this,home_Navbar_Activity.class)
                        ;
                startActivity(intent);
            }
        });
    }
//
//    private void signOutUser() {
//        Intent intent = new Intent(profileActivity.this,LoginActivity.class);
//        loginActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//
//    }

}