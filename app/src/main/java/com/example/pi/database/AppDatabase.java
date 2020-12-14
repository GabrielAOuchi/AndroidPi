package com.example.pi.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.pi.dao.ContaDAO;
import com.example.pi.model.Coletor;
import com.example.pi.dao.ColetorDAO;
import com.example.pi.model.Conta;

@Database(entities = {Coletor.class, Conta.class}, version = 3, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ColetorDAO coletorDAO();
    public abstract ContaDAO contaDAO();
    private static volatile AppDatabase instance;

    public  static synchronized AppDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context, AppDatabase.class, "coletor_db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return instance;
    }

}
