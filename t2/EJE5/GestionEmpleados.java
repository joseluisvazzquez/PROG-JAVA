package EJE5;

public class GestionEmpleados {
    public static void main(String[] args) {
        EmpleadoContrato jorge = new EmpleadoContrato("Jorge", "45453434T", 1000, 12);
        EmpleadoPorHora jojo = new EmpleadoPorHora("Jojo", "45893235F", 32.34, 800.45);
        EmpleadoTiempoCompleto Koko  = new EmpleadoTiempoCompleto("Koko", "68679644Y", 34000, "Carpitero");

        jorge.CalcularSalario();
        jorge.PrintInfo();

        jojo.CalcularSalario();
        jojo.PrintInfo();

        Koko.CalcularSalario();
        Koko.PrintInfo();
    }
    
}
