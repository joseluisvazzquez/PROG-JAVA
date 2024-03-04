package EJE5;

public class EmpleadoTiempoCompleto extends Persona implements Empleado {
    private double salario;
    private String cargo;
    
    public EmpleadoTiempoCompleto(String nombre, String dni, int salario, String cargo) {
        super(nombre, dni);
        this.salario = salario;
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public String getCargo() {
        return cargo;
    }
    @Override
    public void CalcularSalario() {
        System.out.println("Salario Anual:"+this.salario);
       
    }
    @Override
    public void PrintInfo() {
        System.out.println("Nombre:"+getNombre()+"  DNI:"+getDni()+"  salario:"+this.salario+"Cargo:"+this.cargo);
      
    }
}
