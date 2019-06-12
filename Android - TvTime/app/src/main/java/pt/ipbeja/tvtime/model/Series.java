package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Series {
    @PrimaryKey(autoGenerate = true)
    private long idSerie;
    private String nomeSerie;
    private int idCategoria;
    private int imdb;
    private String descricao;
    private String  imagem;


    public Series(long idSerie, String nomeSerie, int idCategoria, int imdb, String descricao, String imagem) {
        this.idSerie = idSerie;
        this.nomeSerie = nomeSerie;
        this.idCategoria = idCategoria;
        this.imdb = imdb;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public long getIdSerie() {
        return idSerie;
    }


    public int Imdb() {
        return imdb;
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

    public int getImdb() {
        return imdb;
    }

    public void setIdSerie(long idSerie) {
        this.idSerie = idSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setImdb(int imdb) {
        this.imdb = imdb;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


}
