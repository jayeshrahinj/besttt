package com.example.bestbuyy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.bestbuyy.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class home_Navbar_Activity extends AppCompatActivity {
    Menu menu;
    MenuView.ItemView itemView;
    ImageView phone;
    ImageView earphone;
    ImageView ac,profilebtn,homebtn;
    BottomNavigationView bottomNavigationView;
    

            ImageView camera; ImageView micro; ImageView laptop; ImageView tv; ImageView  tablet; ImageView fridge;
            ImageView p1,p2,p4;
//    String api ="http://price-api.datayuge.com/register";
   TextView search;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_navbar);
        search = findViewById(R.id.search);
        itemView = findViewById(R.id.personfrag);
        profilebtn = findViewById(R.id.profilebtn);
        homebtn = findViewById(R.id.homebtn);
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p4 = findViewById(R.id.p4);
        phone=findViewById(R.id.phone);
        earphone=findViewById(R.id.earphone);
        ac=findViewById(R.id.ac);
        camera=findViewById(R.id.camera);
        micro=findViewById(R.id.micro);
        laptop=findViewById(R.id.laptop);
        tv=findViewById(R.id.tablet);
        tablet=findViewById(R.id.tv);
        fridge=findViewById(R.id.fridge);

        phone.setOnClickListener(view -> {
            Intent intent = new Intent(home_Navbar_Activity.this,phoneActivity2.class)
                    ;
            startActivity(intent);
        });
        earphone.setOnClickListener(view -> {
            Intent intent = new Intent(home_Navbar_Activity.this,earphoneActivity.class)
                    ;
            startActivity(intent);
        });
             camera.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(home_Navbar_Activity.this,cameraActivity.class)
                            ;
                    startActivity(intent);
                }
            });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,acActivity.class)
                        ;
                startActivity(intent);
            }
        });
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,SamsungActivity.class)
                        ;
                startActivity(intent);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,RealmeActivity.class)
                        ;
                startActivity(intent);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,RealmeActivity.class)
                        ;
                startActivity(intent);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,cameraActivity.class)
                        ;
                startActivity(intent);
            }
        });
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,profileActivity.class)
                        ;
                startActivity(intent);
            }
        });
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_Navbar_Activity.this,home_Navbar_Activity.class)
                        ;
                startActivity(intent);
            }
        });


//
//

// Instantiate the RequestQueue.
//      String s=  search.getText().toString();
//    getdata();
//    }
//
//    private void getdata() {
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url = "http://price-api.datayuge.com/register";
//
//// Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Log.e("api", "onErrorResponse: " + response.toString());
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("api", "onErrorResponse: " + error.getLocalizedMessage() );
//            }
//        });
//
//// Add the request to the RequestQueue.
//        queue.add(stringRequest);
//



    }
//    public  void  getactivity( View view)
//    {
//
//          Intent intent = new Intent(home_Navbar_Activity.this,profileActivity.class);
//            startActivity(intent);
//        }



//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout,fragment);
//        fragmentTransaction.commit();
//    }
}