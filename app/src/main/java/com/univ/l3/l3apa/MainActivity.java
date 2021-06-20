package com.univ.l3.l3apa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connexion = (Button) findViewById(R.id.button);
    }

    public void validationConnexion (View v) {
        EditText userText = (EditText) findViewById(R.id.editTextUsername);
        EditText passText = (EditText) findViewById(R.id.editTextPassword);

        if (userText.getText().toString().equals("client") && passText.getText().toString().equals("passe")) {
            if (type.equals("parcours")) {
                Intent intent = new Intent (this, Generale.class);
                startActivity(intent);
            } else if (type.equals("activite")) {
                Intent intent = new Intent (this, Activites.class);
                startActivity(intent);
            } else {
                finish();
            }
        } else {
            finish();
        }
    }
}