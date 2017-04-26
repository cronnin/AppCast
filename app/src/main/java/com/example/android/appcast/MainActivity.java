package com.example.android.appcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button meusPC = (Button) findViewById(R.id.meusPC);
        Button buscarPC = (Button) findViewById(R.id.buscarPC);

        meusPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meusPCIntent = new Intent(MainActivity.this, MeusPodCasts.class);
                startActivity(meusPCIntent);
            }
        });

        buscarPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent buscarPCIntent = new Intent(MainActivity.this, BuscarPodcasts.class);
                startActivity(buscarPCIntent);
            }
        });
    }
}
