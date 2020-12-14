package com.example.pi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pi.R;
import com.example.pi.dao.ContaDAO;
import com.example.pi.model.Conta;

public class MainActivity extends AppCompatActivity {
    private EditText editUsuario, editSenha;
    private String usu, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario = findViewById(R.id.editUsuario);
        editSenha = findViewById(R.id.editSenha);
    }

    public void Login(View view) {
        if(editUsuario.getText().toString().equals("Ouchi") && editSenha.getText().toString().equals("123")){
            Intent intent = new Intent(MainActivity.this, MenuColetores.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuário ou Senha incorreto(s)!", Toast.LENGTH_SHORT).show();
        }
    }

    public void CriarConta(View view) {
        Intent intent = new Intent(MainActivity.this, CriarConta.class);
        startActivity(intent);
    }
}