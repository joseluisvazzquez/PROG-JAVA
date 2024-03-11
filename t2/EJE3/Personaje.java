package EJE3;

public abstract class Personaje {
    private String nombre;
    private int vida;
    
    private int fuerza;

    public Personaje(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVida() {
        return vida;
    }
    public int getFuerza() {
        return fuerza;
    }
    abstract public void Atacar(Personaje objetivo);
    abstract public void recibirAtaque(int cantidad);

    
}
