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

        return userId;
    }
    public void setId(long id) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email= email;
    }

    public String getNacionalidade() {
        return this.nacionalidade= nacionalidade;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
