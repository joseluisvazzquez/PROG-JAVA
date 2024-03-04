import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class EJE3 {
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int numero;
        System.out.println("introduce un numero");
        numero = myObj.nextInt();
        myObj.close();
        doble(numero);
        triple(numero);
    }
    static void doble(int numero) {
        int doble;
        doble  = numero*2;
        System.out.println(doble);
    
}
   static void triple(int numero) {
       int triple;
        triple  = numero*3;
        System.out.println(triple);
   }
   }
