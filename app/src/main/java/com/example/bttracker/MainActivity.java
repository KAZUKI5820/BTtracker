package com.example.bttracker;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLog_Activity(View view) {
        Intent toLog = new Intent(this,Log_Activity.class);
        startActivity(toLog);
    }

    public void goToNormal_Activity(View view) {
        Intent toNormal = new Intent(this,Normal_Activity.class);
        startActivity(toNormal);
    }

    public void goToMechanism_Activity(View view) {
        Intent toMechanism = new Intent(this,Mechanism_Activity.class);
        startActivity(toMechanism);
    }

    public void goToWeb1(View view){
        Intent toWeb1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthline.com/health/how-to-break-a-fever"));

         startActivity(toWeb1);
    }


