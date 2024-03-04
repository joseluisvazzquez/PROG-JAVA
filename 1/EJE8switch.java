import java.util.Scanner;

public class EJE8switch{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int resp;
        System.out.println("Para calcular el area de: (1) triangulo, (2) Pentagono, (3) Hexagono...");
        resp = myObj.nextInt();
        myObj.close();
    }
}