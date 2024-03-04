import java.util.Scanner;

public class EJE8 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int resp;
        System.out.println("Para calcular el area de: (1) triangulo, (2) Pentagono, (3) Hexagono...");
        resp = myObj.nextInt();

        if (resp == 1) {
            Scanner t = new Scanner(System.in);
            int base;
            int altura;
            System.out.println("Introduceme la base de tu Triangulo:");
            base = t.nextInt();
            System.out.println("Introduceme la altura de tu Triangulo:");
            altura = t.nextInt();
            t.close();
            double Triangulo = (base * altura) / 2;
            System.out.println("EL AREA DE TU TRIANGULO ES: " + Triangulo);
        }

        if (resp == 2) {
            Scanner p = new Scanner(System.in);
            int pe;
            int ap;
            System.out.println("Introduceme el perimetro de tu Pentagono:");
            pe = p.nextInt();
            System.out.println("Introduceme el apotema de tu Pentagono:");
            ap = p.nextInt();
            p.close();
            double Pentagono = (pe * ap) / 2;
            System.out.println("EL AREA DE TU PENTAGONO ES: " + Pentagono);

        }
        myObj.close();
    }
}
