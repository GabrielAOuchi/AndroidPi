package com.example.pi.controller;

import android.content.Context;

import com.example.pi.dao.ColetorDAO;
import com.example.pi.database.AppDatabase;
import com.example.pi.model.Coletor;

import java.util.List;

public class ColetorController {
    private AppDatabase db;
    private ColetorDAO dao;

    public ColetorController(Context context){
        db = AppDatabase.getInstance(context);
        dao = db.coletorDAO();
    }

    public long inserir(Coletor coletor){
        return dao.insert(coletor);
    }

    public List<Coletor> findAll(){
        return dao.getAll();
    }
}
