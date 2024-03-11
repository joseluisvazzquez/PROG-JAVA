package EJE5;

public class EmpleadoContrato extends Persona implements Empleado{
    private double salariomes;
    private double duracioncontrato;
    
    public EmpleadoContrato(String nombre, String dni, double salariomes, double duracioncontrato) {
        super(nombre, dni);
        this.salariomes = salariomes;
        this.duracioncontrato = duracioncontrato;
    }
    public double getSalariomes() {
        return salariomes;
    }
    public double getDuracioncontrato() {
        return duracioncontrato;
    }
    @Override
    public void CalcularSalario() {
        System.out.println("Salario Completo:"+salariomes*duracioncontrato);
    }
    @Override
    public void PrintInfo() {
        System.out.println("Nombre:"+getNombre()+"  DNI:"+getDni()+"  Salario mes :"+this.salariomes+" Duraion contrato:"+this.duracioncontrato);
      
    }
    
}
