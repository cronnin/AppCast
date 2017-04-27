package com.example.android.appcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuscarPodcasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_podcasts);

        TextView voltar = (TextView) findViewById(R.id.buscarPCVoltar);

        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent voltarIntent = new Intent(BuscarPodcasts.this, MainActivity.class);
                startActivity(voltarIntent);

            }
        });
    }
}
