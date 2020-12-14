package com.example.pi.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pi.model.Conta;

import java.util.List;

@Dao
public interface ContaDAO {
    @Query("Select * From conta")
    List<Conta> getAll();

    @Query("Select * From conta Where id = :id Limit 1")
    Conta getContaById(String id);

    @Insert
    long insert(Conta conta);

    @Delete(entity = Conta.class)
    int delete(Conta conta);

    @Query("Delete From conta Where id = :id")
    int deleteById(String id);

    @Update
    void update(Conta conta);
}
