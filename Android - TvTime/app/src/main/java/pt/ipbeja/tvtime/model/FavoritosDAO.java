package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface FavoritosDAO {

    @Query("SELECT * FROM Favorito")
    public List<Favorito> getAllFavoritos();

    @Update
    public void update(Favorito favorito);

    @Insert
    public void insert(Favorito favorito);

    @Insert
    public void insertAll(List<Favorito> favoritoLista);

    @Delete
    public void remove(Favorito favorito);

}
