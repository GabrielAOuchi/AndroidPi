package com.example.pi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pi.R;

public class MenuColetores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_coletores);
    }

    public void AdicionarNovoColetor(View view) {
        Intent intent = new Intent(MenuColetores.this, AdicionarColetor.class);
        startActivity(intent);
    }

    public void TelaListaColetores(View view) {
        Intent intent = new Intent(MenuColetores.this, ListaDeColetores.class);
        startActivity(intent);
    }
}