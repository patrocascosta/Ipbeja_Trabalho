package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface VistosDAO {

    @Query("SELECT * FROM Vistos")
    public List<Vistos> getAllVistos();

    @Update
    public void update(Vistos vistos);

    @Update
    public void updateAll(List<Vistos> VistosList);



}
