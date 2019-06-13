package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private long userId;
    private String password;
    private String email;
    private String nacionalidade;


    public User(long userId, String password, String email, String nacionalidade) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }


    public long getUserId() {

        return this.userId;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }
}
