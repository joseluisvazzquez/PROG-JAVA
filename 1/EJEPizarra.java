
import java.util.Scanner;

public class EJEPizarra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroRobot = (int)Math.floor(Math.random()*50);
        int rondas = 5;
        System.out.println("Adivina que numero ha escogido el robot....");
        System.out.println(numeroRobot);
        int numerojugador = sc.nextInt();

        while(numerojugador!= numeroRobot ){
            System.out.println("Tu numero es mas pequeño que el del robot...");
            rondas = rondas-1;
            System.out.println("Te quedan:"+rondas+"  Rondas");
            System.out.println("Introduce de nuevo el num");
             numerojugador = sc.nextInt();
            if(numerojugador > numeroRobot){
                System.out.println("Tu numero es mas grande que el del robot...");
                System.out.println("Introduce de nuevo el num...");
                rondas = rondas-1;
                numerojugador = sc.nextInt();
            }
            if(numerojugador == numeroRobot){
                System.out.println("Lo has acertado, felicidades!!!!");
                break;
            }
            if(rondas == 0){
                System.out.println("Has perdido...");
                break;
            }

        }
    }
}