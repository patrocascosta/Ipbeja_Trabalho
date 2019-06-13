package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity

public class Categorias {

    public static final long THRILLER = 1;
    public static final long COMEDIA = 2;
    public static final long DRAMA = 3;
    public static final long CRIME = 4;

    @PrimaryKey(autoGenerate = true)
    private int idCategoria;
    private String nomeCategoria;


    public Categorias(int idCategoria, String nomeCategoria){
        this.idCategoria= idCategoria;
        this.nomeCategoria=nomeCategoria;

    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}
