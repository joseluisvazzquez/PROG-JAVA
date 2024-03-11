package EJE5;

public class EmpleadoPorHora extends Persona implements Empleado {
    private double tarifahora;
    private double horastrabajadas;

    
    public EmpleadoPorHora(String nombre, String dni, double tarifahora, double horastrabajadas) {
        super(nombre, dni);
        this.tarifahora = tarifahora;
        this.horastrabajadas = horastrabajadas;
    }
    public double getTarifahora() {
        return tarifahora;
    }
    public double getHorastrabajadas() {
        return horastrabajadas;
    }
    @Override
    public void CalcularSalario() {
        System.out.println("Salario Completo:"+tarifahora*horastrabajadas);
    }
    @Override
    public void PrintInfo() {
        System.out.println("Nombre:"+getNombre()+"  DNI:"+getDni()+"  tarifa horas:"+this.tarifahora+" Horas Trabajadas:"+this.horastrabajadas);
      
    }
    
}
