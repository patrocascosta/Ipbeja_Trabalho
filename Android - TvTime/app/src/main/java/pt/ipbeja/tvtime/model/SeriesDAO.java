package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface SeriesDAO {

    @Query("SELECT * FROM Series")
    List<Series> getAllSeries();

    @Query("SELECT * FROM Series WHERE idCategoria = :id")
    List<Series> getSeriesByCategory(long id);


}
