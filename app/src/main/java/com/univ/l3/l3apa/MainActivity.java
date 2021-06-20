package com.univ.l3.l3apa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connexion = (Button) findViewById(R.id.button);
    }

    public void validationConnexion (View v) {
        Intent intent = new Intent (this, Generale.class);
        startActivity(intent);
    }
}