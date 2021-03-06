package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TemporadasDAO {
    @Query("SELECT * FROM Temporada")
    public List<Temporada> getAllTemporadas();
}

