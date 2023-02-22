package com.example.bestbuyy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class home_Navbar_Activity extends AppCompatActivity {
//
//    ImageView phone;
//    ImageView earphone;
//    ImageView ac;
//            ImageView camera; ImageView micro; ImageView laptop; ImageView tv; ImageView  tablet; ImageView fridge;
//            ImageView p1,p2,p4;
//    String api ="http://price-api.datayuge.com/register";
    TextView search;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_navbar);
        search = findViewById(R.id.search);
//        p1 = findViewById(R.id.p1);
//        p2 = findViewById(R.id.p2);
//        p4 = findViewById(R.id.p4);
//        phone=findViewById(R.id.phone);
//        earphone=findViewById(R.id.earphone);
//        ac=findViewById(R.id.ac);
//        camera=findViewById(R.id.camera);
//        micro=findViewById(R.id.micro);
//        laptop=findViewById(R.id.laptop);
//        tv=findViewById(R.id.tablet);
//        tablet=findViewById(R.id.tv);
//        fridge=findViewById(R.id.fridge);
//
//        phone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(home_Navbar_Activity.this,phoneActivity2.class)
//                        ;
//                startActivity(intent);
//            }
//        });
//        earphone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(home_Navbar_Activity.this,earphoneActivity.class)
//                        ;
//                startActivity(intent);
//            }});
//             camera.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(home_Navbar_Activity.this,cameraActivity.class)
//                            ;
//                    startActivity(intent);
//                }
//            });
//        ac.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(home_Navbar_Activity.this,acActivity.class)
//                        ;
//                startActivity(intent);
//            }
//        });
//        p1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(home_Navbar_Activity.this,SamsungActivity.class)
//                        ;
//                startActivity(intent);
//            }
//        });
//        p2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(home_Navbar_Activity.this,RealmeActivity.class)
//                        ;
//                startActivity(intent);
//            }
//        });
//        p4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(home_Navbar_Activity.this,RealmeActivity.class)
//                        ;
//                startActivity(intent);
//            }
//        });
//
//
//

// Instantiate the RequestQueue.
      String s=  search.getText().toString();
    getdata();
    }

    private void getdata() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://price-api.datayuge.com/register";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("api", "onErrorResponse: " + response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("api", "onErrorResponse: " + error.getLocalizedMessage() );
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);




    }
}