package com.univ.l3.l3apa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alamkanak.weekview.WeekView;

public class Activites extends AppCompatActivity {

    String act = getIntent().getStringExtra("Test");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activites2);

        // Insertion du calendrier
        WeekView mWeekView = (WeekView) findViewById(R.id.weekView);
    }
}