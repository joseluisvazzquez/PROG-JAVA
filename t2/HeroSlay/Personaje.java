package HeroSlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import HeroSlay.Carta.Tipo;

/**
 * Personaje
 */
public class Personaje {
    private String NombreP;
    private int vida;
    private List<Carta> mazopersonaje;
    
    public Personaje(String nombreP, int vida, List<Carta> mazopersonaje) {
        NombreP = nombreP;
        this.vida = vida;
        this.mazopersonaje = mazopersonaje;
    }
    public String getNombreP() {
        return NombreP;
    }
    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public List<Carta> getMazopersonaje() {
        return mazopersonaje;
    }
    public void setMazopersonaje(List<Carta> mazopersonaje) {
        this.mazopersonaje = mazopersonaje;
    }

    public void alterarVida(int valor){
        vida = vida + valor;
    }
    
    public void PintarCartas(){
        for(int i = 0; i < mazopersonaje.size(); i++){
            mazopersonaje.get(i).pintarCarta();
        }
    }

}
