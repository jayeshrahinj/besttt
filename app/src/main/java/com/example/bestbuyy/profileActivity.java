package com.example.bestbuyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class profileActivity extends AppCompatActivity {
FirebaseAuth mauth;
TextView logout;
ImageView homebtn,profilebtn;
LoginActivity loginActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mauth = FirebaseAuth.getInstance();
        logout =findViewById(R.id.logout);
        homebtn = findViewById(R.id.homebtn);
        profilebtn = findViewById(R.id.profilebtn);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mauth.signOut();
              //  signOutUser();
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