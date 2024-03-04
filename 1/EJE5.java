// 2pi*R , pi*R*R

import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class EJE5 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double r;
        System.out.println("introduce el radio de tu circunferencia");
        r = myObj.nextInt();
        myObj.close();
        longitud(r);
        area(r);
    }

    static void longitud(double r) {
        double longitud;
        longitud = 3.14159 * r * r;
        System.out.println("La longitud de tu circunferencia es: " + longitud);

    }

    static void area(double r) {
        double area;
        area = (2 * 3.14159) * r;
        System.out.println("La longitud de tu circunferencia es: " + area);

    }
}
