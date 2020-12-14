package com.example.pi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pi.controller.ColetorController;
import com.example.pi.R;
import com.example.pi.model.Coletor;

public class AdicionarColetor extends AppCompatActivity {

    private ColetorController controller;

    private EditText editNome, editQL, editADB, editIDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_coletor);

        controller = new ColetorController(this);

        editNome = findViewById(R.id.editNome);
        editQL = findViewById(R.id.editQL);
        editADB = findViewById(R.id.editADB);
        editIDB = findViewById(R.id.editIDB);
    }

    public void salvarColetorDB(View view) {
        Coletor coletor = new Coletor();
        coletor.setNome(editNome.getText().toString());
        coletor.setQL(Integer.parseInt(editQL.getText().toString()));
        coletor.setADB(editADB.getText().toString());
        coletor.setIDB(editIDB.getText().toString());

        if (controller.inserir(coletor) > 0){
            mensagem("Coletor Adicionado!");
            clearFields();
        }else{
            mensagem("Falha ao Adicionar!");
        }
    }

    private void mensagem(String m) {
        Toast.makeText(this, m, Toast.LENGTH_SHORT).show();
    }

    private void clearFields() {
        editNome.setText("");
        editQL.setText("");
        editADB.setText("");
        editIDB.setText("");
    }
}