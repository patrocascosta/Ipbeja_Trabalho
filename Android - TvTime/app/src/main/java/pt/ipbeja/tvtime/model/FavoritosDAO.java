package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface FavoritosDAO {

    @Query("SELECT * FROM Favoritos")
    public List<Favoritos> getAllFavoritos();

    @Update
    public void update(Favoritos favoritos);

    @Insert
    public void insert(Favoritos favoritos);

    @Insert
    public void insertAll(List<Favoritos> favoritosLista);

    @Delete
    public void remove(Favoritos favoritos);

}
