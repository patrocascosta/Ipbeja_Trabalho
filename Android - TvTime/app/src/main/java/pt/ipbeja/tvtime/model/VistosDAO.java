package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface VistosDAO {

    @Query("SELECT * FROM Visto")
    public List<Visto> getAllVistos();

    @Update
    public void update(Visto visto);

    @Update
    public void updateAll(List<Visto> vistoList);

    @Query("SELECT * FROM visto WHERE idSerie= :id AND visto= :visto")
    Visto getVistosBySerieId(long id, boolean visto );



}
