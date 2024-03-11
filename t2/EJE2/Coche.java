package EJE2;

public class Coche extends Vehiculo {
    private int puertas;


    public Coche(int puertas, String matricula){
            super(matricula, 4);
        this.puertas = puertas;

    }
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    @Override
    public String toString(){
        return "Coche: " + getMatricula()+ ", " + puertas+", "+getRuedas();

    }
}
