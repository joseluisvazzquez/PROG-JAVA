package EJE4;

public abstract class Animal {
    private String nombre;
    private int edad;
    private int peso;

    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getPeso() {
        return peso;
    }
}

