package com.projects.worldbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contatore;
    TextView display;
    Button add,sub,nextpag,nothing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contatore=0;
        add= (Button) findViewById(R.id.ag);
        sub= (Button) findViewById(R.id.sot);
        nextpag= (Button) findViewById(R.id.suc);
        nothing = (Button) findViewById(R.id.not);
        display = (TextView) findViewById(R.id.tV);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore++; // aumenta di uno
                display.setText("Il totale è " + contatore); // aggiorna la vista
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatore--; // diminuisci di uno
                display.setText("Il totale è " + contatore); // aggiorna la vista
            }
        });
        nextpag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent np = new Intent(getApplicationContext(),Main2Activity.class); // inizializza l'intent per passare dalla prima pagina alla successiva
                startActivity(np);
            }
        });
    }
}
