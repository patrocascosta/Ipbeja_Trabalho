package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
private long UserId;
private String Password;
private String Email;
private String Nacionalidade;


public User(long UserId, String Password, String Email, String Nacionalidade){
    this.UserId = UserId;
    this.Password = Password;
    this.Email = Email;
    this.Nacionalidade = Nacionalidade;
}




    public long getUserId() {

        return this.UserId;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getNacionalidade() {
        return this.Nacionalidade;
    }
}
