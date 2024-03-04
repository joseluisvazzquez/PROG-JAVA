import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class EJE6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double km;
        System.out.println("introduce la distacia que quieres convertir de km/h a m/s");
        km = myObj.nextInt();
        myObj.close();
        DeKmaMetros(km);
      
    }
    static void DeKmaMetros(double km){
        double DeKmaMetros;
        DeKmaMetros = (km*1000)/3600;
        System.out.println("La distancia a metros/s es :"+ DeKmaMetros+"m/s");
        
    }
}
