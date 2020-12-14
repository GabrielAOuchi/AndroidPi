package com.example.pi.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Conta {
    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "conta_usuario")
    private String usuario;
    @ColumnInfo(name = "conta_password")
    private String password;

    public Conta(){}

    public Conta(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
