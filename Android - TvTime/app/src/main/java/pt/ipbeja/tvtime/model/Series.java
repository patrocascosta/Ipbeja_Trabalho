package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Series {
    @PrimaryKey(autoGenerate = true)
    private long idSerie;
    private String nomeSerie;
    private int idCategoria;
    private int Imdb;
    private String descricao;
    private String  imagem;


    public Series(long idSerie, String nomeSerie, int idCategoria, int imdb, String descricao, String imagem){

        this.idSerie= idSerie;
        this.nomeSerie= nomeSerie;
        this.idCategoria= idCategoria;
        this.descricao=descricao;
        this.imagem=imagem;

    }

    public long getIdSerie() {
        return idSerie;
    }


    public int Imdb() {
        return Imdb;
    }
    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeSerie() {
        return nomeSerie;
    }

    public String getImagem() { return imagem;}
}
