package com.example.pi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pi.R;
import com.example.pi.controller.ContaController;
import com.example.pi.model.Coletor;
import com.example.pi.model.Conta;

public class CriarConta extends AppCompatActivity {

    ContaController controller;

    EditText editUsu, editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        controller = new ContaController(this);

        editUsu = findViewById(R.id.editUsu);
        editPass = findViewById(R.id.editPass);
    }

    public void CriarUsuario(View view) {
        Conta conta = new Conta();
        conta.setUsuario(editUsu.getText().toString());
        conta.setPassword(editPass.getText().toString());

        if (controller.inserir(conta) > 0){
            mensagem("Usuário Criado!");
            clearFields();
        }else{
            mensagem("Falha ao Criar Usuário!");
        }
    }

    private void mensagem(String m) {
        Toast.makeText(this, m, Toast.LENGTH_SHORT).show();
    }

    private void clearFields() {
        editUsu.setText("");
        editPass.setText("");
    }
}