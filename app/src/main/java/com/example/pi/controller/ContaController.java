package com.example.pi.controller;

import android.content.Context;
import android.widget.Toast;

import com.example.pi.dao.ContaDAO;
import com.example.pi.database.AppDatabase;
import com.example.pi.model.Conta;
import com.example.pi.view.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class ContaController {
    List<Conta> contas = new ArrayList<Conta>();
    private AppDatabase db;
    private ContaDAO dao;

    public ContaController(Context context){
        db = AppDatabase.getInstance(context);
        dao = db.contaDAO();
    }

    public long inserir(Conta conta){
        return dao.insert(conta);
    }

    public List<Conta> findAll(){
        return dao.getAll();
    }
}
