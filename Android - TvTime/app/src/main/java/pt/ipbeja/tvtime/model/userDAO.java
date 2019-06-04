package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * From User")
    public List<user>GetAllUsers();

    @Update
    public void update (user User);

    @Insert
    public void insert(user User);

}
