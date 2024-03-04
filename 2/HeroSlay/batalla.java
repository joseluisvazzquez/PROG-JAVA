package HeroSlay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import HeroSlay.Carta.Tipo;

public class batalla {

    public static void main(String[] args) {
        //Empieza el programa
        //Creamos 4 cartas
        Carta carta1 = new Carta("Fuego", Tipo.ataque, 5);
        Carta carta2 = new Carta("Rayo", Tipo.ataque, 10);
        Carta carta3 = new Carta("Agua", Tipo.ataque, 5);
        Carta carta4 = new Carta("Piedras", Tipo.ataque, 4);
        //Crear una lista con estas 4 cartass
        
        List<Carta> mazo1 = new ArrayList<>();
        mazo1.add(carta1);
        mazo1.add(carta2);
        mazo1.add(carta3);
        //Crear 2 personajes (j1 y j2 o heroe y villano o batman y spiderman)
        Personaje p1 = new Personaje("J1", 20, mazo1);
        Personaje p2 = new Personaje("J2", 20, mazo1);
        Random rand = new Random();

        int random_number = rand.nextInt(10);
        int random_number2 = rand.nextInt(10);
        //Ya tienes todo creado, empiezas el bule:
        while(p1.getVida() > 0 && p2.getVida() > 0){
            //intro
            Scanner sc = new Scanner(System.in);
            System.out.println("Quien saque un numero par comienza!");
            System.out.println("Primero el jugador 1!");  
            System.out.println("Pulse (1) para continuar!!");
            int resp = sc.nextInt();
            
            while (resp != 1){ 
                System.out.println("Pulse (1) para continuar!!");
                resp = sc.nextInt();
            }

            System.out.println("Has sacado un: "+random_number);
            System.out.println("Ahora el segundo jugador!. Pulse(1) para continuar!");  
            resp = sc.nextInt();
            while (resp != 1){ 
                System.out.println("Pulse (1) para continuar!!");
                resp = sc.nextInt();
            }
            System.out.println("Has sacado un: "+random_number2);
            while(random_number%2 != 0 && random_number2%2 != 0 || random_number%2 == 0 && random_number2%2 == 0){
                System.out.println("ninguno ha sacado un numero par, juajuajuajuajua!!");
                System.out.println("De aqui no se van hasta que haya un numero par!!!!");
                random_number = rand.nextInt(10);
                random_number2 = rand.nextInt(10);
                System.out.println("Primero el jugador 1!");  
                System.out.println("Pulse (1) para continuar!!");
                resp = sc.nextInt();
                System.out.println("Has sacado un: "+random_number);
                System.out.println("Ahora el segundo jugador!. Pulse(1) para continuar!");  
                resp = sc.nextInt();
                System.out.println("Has sacado un: "+random_number2);
            }
            if(random_number%2 == 0 || random_number2%2 == 0){

                System.out.println("Comienza el ganador!!!");
                System.out.println("elige una de entre estas cartas:");
                p1.PintarCartas();
                resp = sc.nextInt();
            
                while (resp > mazo1.size() || resp< 0){
                    System.out.println("no existe la carta porfavor seleccione una carta del mazo");
                    resp = sc.nextInt();
                }
                Carta cartaElegida = mazo1.get(resp-1);
                jugarCarta(cartaElegida, p1, p2);
                System.out.println("Turno para el siguiente jugador:");
                p1.PintarCartas();
                resp = sc.nextInt();
                while (resp > mazo1.size() || resp< 0){
                    System.out.println("no existe la carta porfavor seleccione una carta del mazo");
                    resp = sc.nextInt();
                }
                cartaElegida = mazo1.get(resp-1);
                jugarCarta(cartaElegida, p2, p1);
            }
            

            
            //...




        }
        //Miestras los dos tengan vida:
        // Juegas una ronda
        //...
        // while(jugador1.getVida() > 0 && villano.getVida() > 0){

        // }



    }

    public static void jugarCarta(Carta carta, Personaje actual, Personaje enemigo){
        System.out.println("La carta jugada es: ");
        carta.pintarCarta();
        //Aplicar los efectos de la carta:
        if(carta.getTipo().equals(Tipo.ataque)){
            enemigo.setVida(enemigo.getVida() - carta.getDaño());
            System.out.println("Daño inflingido:"+carta.getDaño()+ "---> Vida restante del enemig0:"+enemigo.getVida());

        }
    }
    
}
