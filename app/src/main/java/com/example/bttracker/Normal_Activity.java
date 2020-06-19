package com.example.bttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Normal_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_);
    }
    public void normalToHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void goToNormal_Activity(View view) {
    }
}
