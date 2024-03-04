import java.util.Scanner;


public class EJE2 {
        public static void main(String[] args) {
                Scanner num = new Scanner(System.in);
                int numero;
                System.out.println("introduce un numero");
                numero = num.nextInt();
                System.out.println("El numero que introducido es: " + numero);
                num.close();
        }
}
