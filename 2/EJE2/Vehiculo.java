package EJE2;

public abstract class Vehiculo {
    private int ruedas;
    private String matricula;


    
    public Vehiculo(String matricula, int ruedas) {
        this.ruedas = ruedas;
        this.matricula = matricula;
        
    }
    public int getRuedas() {
        return ruedas;
    }
    public String getMatricula() {
        return matricula;
    }
    
}
