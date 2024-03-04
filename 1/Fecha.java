import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fecha {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Vamos a imprimir la hora. Escribe (1)");
        int resp = sc.nextInt();

        while (resp == 1) {
           System.out.println("LA FECHA DE HOY ES:"+java.time.LocalDateTime.now()); 
           System.out.println("Vuelva a introducir (1) si quiere mostrarla de nuevo");
           resp = sc.nextInt();
           if (resp !=1){
            System.out.println("Cerrando el programa...");
           }
        }
        
    }
}
