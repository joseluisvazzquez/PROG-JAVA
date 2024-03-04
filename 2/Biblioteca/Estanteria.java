package Biblioteca;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Estanteria {
    
    private List<Libro> libros = new ArrayList<>(10);
    
    public void AñadirLibro(String titulo, String autor, int calif){
        Libro libro = new Libro(titulo, autor, calif);
        libros.add(libro);
        System.out.println("Se ha añadido el libro " + titulo);
    }

    public void EliminarLibro(String Autor){
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).getAutor().equals(Autor)){
                System.out.println(" Se ha eliminado:"+i+":"+libros.get(i).getTitulo());
                libros.remove(i);
            }
        }
    }
    public void Mostrarlibro(){
        System.out.println("|_________________________________ ( LIBROS EN LA ESTANTERIA!!)________________________|");
        libros.sort(Comparator.comparing(Libro::getTitulo));
        for(int i = 0; i < libros.size(); i++){
            System.out.println("   ---------------->"+i+":"+libros.get(i).getTitulo());
        }
        
        System.out.println("|======================================================================================|");
        System.out.println("|======================================================================================|\n\n\n");

    }
    public void Top10(){
        System.out.println("|_________________________________ ( TOP 10!!!)________________________________________|");
        libros.sort(Comparator.comparingInt(Libro::getCalif).reversed());
        for(int i = 0; i < libros.size(); i++){
            System.out.println("   ---------------->"+i+":"+libros.get(i).getTitulo()+"   Puntaje:"+libros.get(i).getCalif()+"/10");
        }
        System.out.println("|======================================================================================|");
        
    }    
}