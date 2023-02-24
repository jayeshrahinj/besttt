package com.example.bestbuyy;

import androidx.appcompat.app.AppCompatActivity;
import java.net.*;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SamsungActivity extends AppCompatActivity {
 Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);


    }
    public void browser(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.amazon.in/Samsung-Storage-Adapter-Purchased-Separately/dp/B0BS181R59/ref=asc_df_B0BS181R59/?tag=googleshopdes-21&linkCode=df0&hvadid=619684970763&hvpos=&hvnetw=g&hvrand=12453751497242434255&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007796&hvtargid=pla-1946090779419&psc=1"));
        startActivity(intent);
    }
}