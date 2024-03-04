import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class EJE4 {
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int c;
        System.out.println("introduce una temperatura a celsius, la pasaremos a Farenheit");
        c = myObj.nextInt();
        myObj.close();
        farenheit(c);
    }
  static void farenheit( int c) {
      int farenheit;
      farenheit = (c*9/5)+32;
      System.out.println("Su temperatura en farenheit es: "+ farenheit);
  }
}
