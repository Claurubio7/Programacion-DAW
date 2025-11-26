package Biblioteca;

import java.util.ArrayList;

public class Autor {
    private String nombre;
    private ArrayList<Libro> librosEscritos;

    public Autor(){
        librosEscritos=new ArrayList<>();   
    }
    public Autor(String nombre){
        this.nombre=nombre;
        this.librosEscritos=new ArrayList<>();;
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Libro> getLibrosEscritos() {
        return librosEscritos;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setLibrosPrestados(ArrayList<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    
    @Override
    public String toString() {
        if(librosEscritos!=null)
            return "Autor [nombre=" + nombre + ", librosEscritos=" + librosEscritos + "]";
        else return "El autor "+nombre+" no tiene libros escritos";
    }
    
    //Métodos propios
    public void nuevoLibro(Libro libro){
        if(librosEscritos!=null)
            if(!librosEscritos.contains(libro))
                librosEscritos.add(libro);
        else{
            librosEscritos.add(libro);
        }
    }
}