package pt.ipbeja.tvtime;

public class Categorias {
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
}
