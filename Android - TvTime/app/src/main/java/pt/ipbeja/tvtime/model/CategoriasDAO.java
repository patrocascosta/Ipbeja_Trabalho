package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface CategoriasDAO {

    @Query(" SELECT * FROM Categorias")
    List<Categorias> getAllCategorias();

}
