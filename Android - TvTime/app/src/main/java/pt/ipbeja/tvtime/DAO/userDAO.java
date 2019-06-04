package pt.ipbeja.tvtime.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import pt.ipbeja.tvtime.User;

@Dao
public interface userDAO {

@Query("SELECT UserId AND Password FROM User") //Selecionar o user name e a password
public List<User>GetUserPassword();

@Query("SELECT * From User")
public List<User>GetAllUsers();

    @Update
    public void update (User User);

    @Insert
    public void Insert

}
