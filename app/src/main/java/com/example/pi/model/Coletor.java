package com.example.pi.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Coletor {
    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "coletor_nome")
    private String nome;
    @ColumnInfo(name = "coletor_QL")
    private int QL;
    @ColumnInfo(name = "coletor_ADB")
    private String ADB;
    @ColumnInfo(name = "coletor_IDB")
    private String IDB;

    public Coletor(){}

    public Coletor(String nome, int QL, String ADB, String IDB) {
        this.nome = nome;
        this.QL = QL;
        this.ADB = ADB;
        this.IDB = IDB;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQL() {
        return QL;
    }

    public void setQL(int QL) {
        this.QL = QL;
    }

    public String getADB() {
        return ADB;
    }

    public void setADB(String ADB) {
        this.ADB = ADB;
    }

    public String getIDB() {
        return IDB;
    }

    public void setIDB(String IDB) {
        this.IDB = IDB;
    }
}
