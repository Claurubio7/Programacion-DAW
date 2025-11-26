package Biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private String categoria;
    private int totalExistencias;

    public Libro(){autor=null;}
    public Libro(String titulo,String categoria,int existencias){
        this.titulo=titulo;
        this.categoria=categoria;
        this.totalExistencias=existencias;
        this.autor=null;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTotalExistencias(int totalExistencias) {
        this.totalExistencias = totalExistencias;
    }
    public int getTotalExistencias() {
        return totalExistencias;
    }
    
    
    @Override
    public String toString() {
        if(autor!=null)
            return "Libro [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", totalExistencias="+ totalExistencias + "]";
        else return "No hay libro";
    }
    //Métodos propios
    public void modificarExistencias(int num){
        if(num>0){
            this.totalExistencias=this.totalExistencias+num;
        }
        else{
            this.totalExistencias=this.totalExistencias-num;
            if (this.totalExistencias<0) this.totalExistencias=0;
        }
    }
}