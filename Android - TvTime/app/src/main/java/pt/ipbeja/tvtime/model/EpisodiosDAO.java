package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface EpisodiosDAO {

    @Query("SELECT * FROM Episodio")
    public List<Episodio> getAllEpisodios();

    @Update
    public void update(Episodio episodio);

    @Insert
    public void insert(Episodio episodio);

    @Insert
    public void insertAll(List<Episodio> episodios);

    @Delete
    public void remove(Episodio episodio);

}
