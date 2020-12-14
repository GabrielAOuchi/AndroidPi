package com.example.pi.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pi.model.Coletor;

import java.util.List;

@Dao
public interface ColetorDAO {
    @Query("Select * From coletor")
    List<Coletor> getAll();

    @Query("Select * From coletor Where id = :id Limit 1")
    Coletor getColetorById(long id);

    @Insert
    long insert(Coletor coletor);

    @Delete(entity = Coletor.class)
    int delete(Coletor coletor);

    @Query("Delete From coletor Where id = :id")
    int deleteById(long id);

    @Update
    void update(Coletor coletor);
}
