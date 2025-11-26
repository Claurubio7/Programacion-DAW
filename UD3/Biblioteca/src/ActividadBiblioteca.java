import Biblioteca.Autor;
import Biblioteca.Biblioteca;
import Biblioteca.Libro;

public class ActividadBiblioteca {
    public static void main(String[] args) throws Exception {
        Biblioteca bib=new Biblioteca("IES Cura Valera");
        Libro l1=new Libro("Viaje al centro de la Tierra","Aventuras",2);
        Libro l2=new Libro("La isala del tesoro","Aventuras",5);
        Autor autor=new Autor("FJ Marber");
        l1.setAutor(autor);
        bib.agregarLibro(l1);
        Libro salida=bib.buscarLibro(l2);
        if(salida!=null)
            System.out.println(salida);
        else{
            System.out.println("No está ese libro");
        }
        
    }
}