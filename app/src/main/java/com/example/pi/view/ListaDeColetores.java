package com.example.pi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.pi.adapter.ColetorAdapter;
import com.example.pi.controller.ColetorController;
import com.example.pi.R;

public class ListaDeColetores extends AppCompatActivity {

    private ListView lvColetores;
    private ColetorAdapter adapter;
    private ColetorController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_coletores);

        lvColetores = findViewById(R.id.listColetores);
        controller = new ColetorController(this);
        adapter = new ColetorAdapter(this, R.layout.unidade_coletor, controller.findAll());

        lvColetores.setAdapter(adapter);
    }
}