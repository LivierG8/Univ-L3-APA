package com.univ.l3.l3apa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Création des variables de la classe
    private String type;
    EditText userText;
    EditText passText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des boutons et variables à la création de la classe
        Button connexion = (Button) findViewById(R.id.button);
        userText = (EditText) findViewById(R.id.editTextUsername);
        passText = (EditText) findViewById(R.id.editTextPassword);
    }

    public void validationConnexion (View v) {
        // Pour des fins de test d'interface, j'ai ajouté cette variable pour sélectionner l'interface à afficher
        type = "parcours";

        // Cette validation des identifiants est à but de test uniquement, je n'ai pas eu le temps d'implémenter SQLite Rooms
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