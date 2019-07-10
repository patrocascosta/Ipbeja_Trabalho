package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface SeriesDAO {

    @Query("SELECT * FROM Serie")
    List<Serie> getAllSeries();

    @Query("SELECT * FROM Serie WHERE idCategoria = :id")
    List<Serie> getSeriesByCategory(long id);

    @Query("SELECT * FROM serie WHERE idSerie= :id")
  Serie getSerieById(long id)
            ;

}
