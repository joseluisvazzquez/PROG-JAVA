package EJE2;

public class Moto extends Vehiculo {
    public Moto(int ruedas, String matricula){
        super(matricula, ruedas);
    }
    @Override
    public String toString(){
        return "Matricula: "+getMatricula()+" Ruedas:"+ getRuedas();
    }
    
}
