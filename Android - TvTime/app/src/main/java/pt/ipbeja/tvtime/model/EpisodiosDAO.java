package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface EpisodiosDAO {
    @Query("SELECT * FROM Episodios")
    public List<Categorias> GetAllEpisodios();

    @Update
    public void update(Episodios episodios);

    @Insert
    public void insert (Episodios episodios);

    @Insert
    public void insertAll(List<Episodios> AllEpisodios);

    @Delete
    public void remove (Episodios episodios);

}
