package EJE3;

public class Guerrero extends Personaje{
    private int resistencia;

    public Guerrero(String nombre, int vida, int fuerza, int resistencia) {
        super(nombre, vida, fuerza);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    @Override
    public void Atacar(Personaje objetivo) {
        objetivo.recibirAtaque(getFuerza());
    }

    @Override
    public void recibirAtaque(int cantidad) {
        if(cantidad > resistencia){
            int dañoVerdadero = cantidad - this.resistencia;
            setVida(getVida()-dañoVerdadero);
        }
    }
    public boolean Vivo(){
        // boolean vivo = false;
        if(getVida() > 0){
            // vivo = true;
            return true;

        }else{
            return false;
        }
  
    }
    @Override
    public String toString(){
        return "Vida:"+getVida()+"---- Nombre:"+getNombre(); 
        
    }
}
