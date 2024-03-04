package HeroSlay;

import java.util.List;

public class Carta {
    private String  nombre; 
    private Tipo tipo;
    private int daño;


    public Carta(String nombre, Tipo tipo, int daño){
        this.nombre = nombre; 
        this.tipo = tipo;
        this.daño = daño;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    public void setDaño(int daño){
        this.daño = daño;
    }
    public String getNombre(){
        return nombre;
    }
    public Tipo getTipo (){
        return tipo;
    }
    public int getDaño(){
        return daño;
    }

    public void pintarCarta(){
        System.out.println(nombre + " (" + daño + ") - " + tipo);
    }
    
    public enum Tipo{
        ataque,
        curacion,
        aturdir
    }
    
}




