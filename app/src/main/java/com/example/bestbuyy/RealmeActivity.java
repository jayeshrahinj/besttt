package com.example.bestbuyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class RealmeActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realme);

    }
    public void browser(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/realme-Storage-Additional-Exchange-Offers/dp/B092QGRHTL/ref=sr_1_3?adgrpid=67169067084&ext_vrnc=hi&gclid=EAIaIQobChMIlZu1sd6u_QIVvJlmAh3npQTBEAAYASAAEgKQFPD_BwE&hvadid=398041144947&hvdev=c&hvlocphy=1007796&hvnetw=g&hvqmt=b&hvrand=14199921016843796776&hvtargid=kwd-1042430493964&hydadcr=24569_1971431&keywords=realme+7+white&qid=1677261611&sr=8-3"));
        startActivity(intent);
    }
}