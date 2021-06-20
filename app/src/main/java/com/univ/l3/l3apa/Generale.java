package com.univ.l3.l3apa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

// Je ne parviens pas à faire s'afficher les différents éléments devant remplir les listes, il y a donc bien le module de liste mais aucun item
public class Generale extends AppCompatActivity {

    // Création des variables nécessaires
    private ArrayList<String> ListeActivites;
    ListView listeParcours;
    ParcoursAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitesParDefaut();

        // Recherche de la vue de liste
        listeParcours = (ListView) findViewById(R.id.listeParcours);
        adapter = new ParcoursAdapter();

        setContentView(R.layout.activity_generale);
    }

    // Initialisation des activités par défaut car je n'ai pas pu implémenter SQLite
    private void activitesParDefaut() {
        ListeActivites = new ArrayList<String>();
        ListeActivites.add("Activité 1");
        ListeActivites.add("Activité 2");
        ListeActivites.add("Activité 3");
    }

    // Affiche la vue de l'activité sélectionnée
    public void voirActivite(View v, String act) {
        Intent i = new Intent(this, Activites.class);
        i.putExtra("Test", act);
        startActivity(i);
    }

    class ParcoursAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return ListeActivites.size();
        }

        @Override
        public Object getItem(int arg0) {
            return ListeActivites.get(arg0);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public int getViewTypeCount() {
            return getCount();
        }

        @Override
        public int getItemViewType(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) Generale.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                itemView = inflater.inflate(R.layout.liste_parcours, null);
            }

            TextView act = (TextView) itemView.findViewById(R.id.textViewAct);
            final Button actVoir = (Button) itemView.findViewById(R.id.btnAct);

            return itemView;
        }


    }
}

