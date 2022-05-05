package com.example.audioactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    ImageButton btnsalsa,btnhuayno,btnbachata,btnblues,btncountry,btnSalir;

    String nombreMusica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsalsa = findViewById(R.id.btnsalsa);
        btnbachata = findViewById(R.id.btnbachata);
        btnhuayno = findViewById(R.id.btnhuayno);
        btnblues = findViewById(R.id.btnblues);
        btncountry = findViewById(R.id.btncountry);
        btnSalir = findViewById(R.id.salirPrincipal);

        btnsalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreMusica = "Salsa";
                Intent i = new Intent(MainActivity.this, ReproducirMusica.class);
                i.putExtra("musica", nombreMusica);
                startActivity(i);
            }
        });

        btnbachata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreMusica = "Bachata";
                Intent i = new Intent(MainActivity.this, ReproducirMusica.class);
                i.putExtra("musica", nombreMusica);
                startActivity(i);
            }
        });

        btnhuayno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreMusica = "Huayno";
                Intent i = new Intent(MainActivity.this, ReproducirMusica.class);
                i.putExtra("musica", nombreMusica);
                startActivity(i);
            }
        });

        btnblues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreMusica = "Blues";
                Intent i = new Intent(MainActivity.this, ReproducirMusica.class);
                i.putExtra("musica", nombreMusica);
                startActivity(i);
            }
        });

        btncountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreMusica = "Country";
                Intent i = new Intent(MainActivity.this, ReproducirMusica.class);
                i.putExtra("musica", nombreMusica);
                startActivity(i);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}