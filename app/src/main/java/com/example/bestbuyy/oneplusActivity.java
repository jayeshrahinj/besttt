package com.example.bestbuyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class oneplusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus);
    }
    public void browser(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/OnePlus-Nord-Black-128GB-Storage/dp/B09WQY65HN/ref=sr_1_2?crid=19VBAJM3MT7XW&keywords=oneplus+nord+ce+2+5g&qid=1677261680&sprefix=one+pla%2Caps%2C483&sr=8-2"));
        startActivity(intent);
    }
}