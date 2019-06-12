package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * From User")
    public List<User> GetAllUsers();

    @Update
    public void update(User User);

    @Insert
    void insert(User User);

    @Insert
    public void insertAll(List<User> InsertAll);

    @Query("SELECT * FROM User WHERE email = :email")
    User getUserByEmail(String email);

}
