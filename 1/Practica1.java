import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Practica1 {
    public static int valorDado, valorDado1;

    public static void Rondas(Scanner sc) {

        String[] comienzajugador = {

                "Opcion 0--->:¿Has dejado ya de usar pañales?",
                "Opcion 1--->:Tu madre es tan gorda que no cabe por la puerta!",
                "Opcion 2--->:Tu padre fue a buscar leche y no volvio",
                "Opcion 3--->:Eres tan repulsivo como una mona marrana.",
                "Opcion 4--->:Tu madre es una comebolas"
        };
        String[] pirata1contesta = {
                "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "La tuya tan gorda que hay que abrir el techo para que entre!",
                "El tuyo te dejo de lo feo que eras!",
                "¿Es que TANTO me parezco a tu hermana?",
                "LA TUYA UNA LAMELLANTAS!",
        };
        String[] pirata1insulta = {
                "¡Que el cielo conserve mi vista!¡Pareces muerto como el pescado!",
                "¡Te perseguiré dia y noche sin ningún respeto!",
                "Mis grandes hazañas por todo el Caribe son celebradas.",
                "Jamás había visto a nadie tan torpe con la espada",
                "¡No descansaré hasta que hayas sido exterminado!",
        };
        String[] jcontesta = {
                "Opcion 0--->:La única forma en la que te conservarás será disecado. ",
                "Opcion 1--->:¡Entonces se un buen perro ¡Siéntate! ¡Quieto!",
                "Opcion 2--->:Que pena que todas estén inventadas. ",
                "Opcion 3--->:Y yo jamas habia visto a alguien sin dos piernas.",
                "Opcion 4--->:La unica forma en la que descansaras es muerto",
        };
        String[] craneoinsulta = {
                "Tienes dos neuronas y ambas se estan peleando por el segundo puesto",
                "Eres un pasmasuegras!!",
                "Eres más tonto que girar el cuadrado en el tetris",
                "Eres más feo que pegarle a un padre con un calcetín sudado",
                "¡Si luchas cara a cara conmigo necesitarás un consejero",
        };
        String[] jcontesta2 = {
                "Opcion 0--->:Las mias se estan peleando, las tuyas se escaparon hace tiempo",
                "Opcion 1--->:Y tu un escuchapedos!!",
                "Opcion 2--->:Y tu eres mas tonto que mear contra el viento",
                "Opcion 3--->:Y tu tan feo que tu madre te dio la espalda en vez de el pecho",
                "Opcion 4--->:Es esa tu cara, pensé que era tu trasero. ",
        };
        String[] capitaninsulta = {
                "¡Una vez tuve un perro más listo que tu!",
                "Mi lengua es más hábil que cualquier espada. ",
                "¡Eres como un dolor en la parte baja de la espalda!",
                "Mi espada es famosa en todo el Caribe -¡ Mi nombre es temido en cada sucio rincón de esta isla!",
                "Eres más feo que pegarle a un padre con un calcetín sudado",
        };
        String[] jcontesta3 = {
                "Opcion 0--->:Te habra enseñado todo lo que sabes.",
                "Opcion 1--->:Primero deberías dejar de usarla como un plumero. ",
                "Opcion 2--->:Ya te están fastidiando otra vez las almorranas, ¿Eh? ",
                "Opcion 3--->:Qué pena me da que nadie haya oído hablar de ti",
                "Opcion 4--->:Y tu mas feo que unas bragas marrones!",
        };
        String[] pirata1 = {
                ".......................",
                ".......................",
                "..............__.......",
                "............_(OO)_.....",
                "............|(__)|.....",
                "___|_^_/______||_______",
                "___(==)_______________",
                "__|{__}J_____________",
                "____VV______________",
                "___________________",
        };
        String[] pirata2 = {
                ".......................",
                ".......................",
                "..............__.......",
                "............_(OO)_.....",
                "............|(__)|.....",
                "___|_^_/______||_______",
                "___(**)_______________",
                "__|[__]|_____________",
                "____||______________",
                "___________________",
        };
        String[] pirata3 = {
                ".......................",
                ".......................",
                "..............__.......",
                "............_(OO)_.....",
                "............|(__)|.....",
                "___|_^_/______||_______",
                "__c(ÒÓ)_______________",
                "__|<__>¶_____________",
                "____||______________",
                "___________________",
        };
        int vidajugador, vidapirata, ronda;
        vidajugador = 2;
        vidapirata = 3;
        ronda = 1;

        try {
            while (valorDado > valorDado1) {
                /*
                 * Esto se iniciará cuando saquemos un numero alto con el dado. Printeará el
                 * dibujo del pirata
                 * iniciaremos el random, utilizé este porque es el que hayé por internet y no
                 * requiere de mas lineas
                 * El time.unit.second.sleep es para retrasar el print en la consola. Al
                 * utilizarlo podremos percibir errores
                 * por eso mismo esta dentro de un try-catch para poder manejarlo.
                 */
                Arrays.stream(pirata1).forEach(System.out::println);
                int insultoPirata = (int) (Math.random() * 4);
                TimeUnit.SECONDS.sleep(3);
                /*
                 * printea que el jugador sera el primero y mostrará las opciones del jugador
                 * con el Arrays.stream(array).forEach(print)
                 * y el scanner para la respuesta.
                 */
                System.out.println("\nEl jugador sera el primero...");
                TimeUnit.SECONDS.sleep(4);
                Arrays.stream(comienzajugador).forEach(System.out::println);
                TimeUnit.SECONDS.sleep(3);

                int respJug = sc.nextInt();

                System.out.println("\nJugador:" + comienzajugador[respJug]);
                TimeUnit.SECONDS.sleep(3);
                System.out.println("\nPata de palo:" + pirata1contesta[insultoPirata]);
                TimeUnit.SECONDS.sleep(3);
                /*
                 * Esto es para resetear la consola, lo que hace es printear el codigo en ansi
                 * del intro...
                 */
                System.out.print("\033[H\033[2J");
                System.out.flush();

                if (insultoPirata == respJug) {
                    vidajugador = vidajugador - 1;
                    System.out.println("\nHas perdido una vida, te quedan, " + vidajugador + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                } else {
                    vidapirata = vidapirata - 1;
                    System.out.println(
                            "\nNo ha contestado bien! Le has quitado 1 vida, le quedan" + vidapirata + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                }
                /*
                 * Este valor lo obligamos a que sea 7 para que desde el bucle donde comienza el
                 * jugador salte al otro, donde
                 * el pirata ahora si podra insultarnos todo el tiempo y nosotros contestar...
                 * Si el pirata comienza entonces simplemente ira a este bucle y no entrará en
                 * el otro y comenzará insultando.
                 */
                valorDado1 = 7;
            }
            /* */
            while (valorDado < valorDado1) {
                int insultoPirata = (int) (Math.random() * 4);
                System.out.println("\nPata de palo:" + pirata1insulta[insultoPirata]);
                TimeUnit.SECONDS.sleep(4);
                Arrays.stream(jcontesta).forEach(System.out::println);
                TimeUnit.SECONDS.sleep(3);

                int respJug = sc.nextInt();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("\nJugador:" + jcontesta[respJug]);
                TimeUnit.SECONDS.sleep(3);

                System.out.print("\033[H\033[2J");
                System.out.flush();

                if (respJug == insultoPirata) {
                    vidapirata = vidapirata - 1;
                    System.out.println("\nBien hecho, has respondido bien! Le has quitado 1 vida, le quedan"
                            + vidapirata + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                } else {
                    vidajugador = vidajugador - 1;
                    System.out.println("\nHas perdido una vida, te quedan, " + vidajugador + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                }
                if (vidajugador == 0) {
                    System.out.println(
                            "\nPata de palo: JAJAJAJA! No ha aguantado nada! Vamos a hecharte a los tiburones!!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("\nHas colapsado y los piratas te han secuestrado... Fin de la partida");
                    TimeUnit.SECONDS.sleep(3);
                    break;
                }
                if (vidapirata == 0) {
                    System.out.println("\nDialogo:Has derrotado al temido Pata de palo!!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(
                            "\nCraneo Rojo: Canalla lo lamentaras para el resto de vida!!! Limpiare el camarote con tu cara!!");
                    TimeUnit.SECONDS.sleep(3);
                    /*
                     * Ahora dejamos de utilizar los dados para saltar bucles y comenzamos a
                     * utilizar ronda, por deffault es 1,
                     * cuando le ganemos al primer pirata la ronda sumará un numero y se guardará y
                     * para entrar al otro bucle sera rondas == 2
                     */
                    ronda = ronda + 1;
                    vidapirata = 2;
                    break;
                }
            }
            while (ronda == 2) {
                Arrays.stream(pirata2).forEach(System.out::println);
                int insultoPirata = (int) (Math.random() * 4);
                System.out.println("\nCraneo Rojo:" + craneoinsulta[insultoPirata]);
                TimeUnit.SECONDS.sleep(3);

                Arrays.stream(jcontesta2).forEach(System.out::println);
                TimeUnit.SECONDS.sleep(3);
                int respJug = sc.nextInt();
                System.out.println("\nJugador:" + jcontesta2[respJug]);
                TimeUnit.SECONDS.sleep(3);

                System.out.print("\033[H\033[2J");
                System.out.flush();

                if (respJug == insultoPirata) {
                    vidapirata = vidapirata - 1;
                    System.out.println("\nBien hecho, has respondido bien! Le has quitado 1 vida, le quedan\n"
                            + vidapirata + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                } else {
                    vidajugador = vidajugador - 1;
                    System.out.println("\nHas perdido una vida, te quedan, " + vidajugador + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                }
                if (vidajugador == 0) {
                    System.out.println("\nCraneo Rojo: Esto es por haber humillado a mi camarada!!\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("\nCraneo Rojo acabo contigo... Fin de la partida\n");
                    TimeUnit.SECONDS.sleep(3);
                    break;
                }
                if (vidapirata == 0) {
                    System.out.println("\nDialogo:Acabaste con Craneo Rojo!! Solo te queda un ultimo adversario");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(
                            "\nCapitan Pirata:Me sorprende que hayas llegado tan lejos, di adios a tu buena suerte apartir de ahora");
                    TimeUnit.SECONDS.sleep(3);
                    ronda = ronda + 1;
                    vidapirata = 5;
                    break;
                }
            }
            while (ronda == 3) {
                Arrays.stream(pirata3).forEach(System.out::println);
                int insultoPirata = (int) (Math.random() * 4);
                System.out.println("\nCapitan de los Piratas:" + capitaninsulta[insultoPirata]);
                TimeUnit.SECONDS.sleep(3);

                Arrays.stream(jcontesta3).forEach(System.out::println);
                TimeUnit.SECONDS.sleep(3);
                int respJug = sc.nextInt();
                System.out.println("\nJugador:" + jcontesta3[respJug]);
                TimeUnit.SECONDS.sleep(3);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                if (respJug == insultoPirata) {
                    vidapirata = vidapirata - 1;
                    System.out.println("\nBien hecho, has respondido bien! Le has quitado 1 vida, le quedan\n"
                            + vidapirata + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                } else {
                    vidajugador = vidajugador - 1;
                    System.out.println("\nHas perdido una vida, te quedan, " + vidajugador + "vidas");
                    TimeUnit.SECONDS.sleep(3);
                }
                if (vidajugador == 0) {
                    System.out.println("\nCapitan de los Piratas: Esto es por haber humillado a mi camarada!!\n");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("\nCapitan de los Piratas acabo contigo... Fin de la partida\n");
                    TimeUnit.SECONDS.sleep(3);
                    break;
                }
                if (vidapirata == 0) {
                    System.out.println(
                            "\nCapitan de los piratas: Nunca me habia enfrentado aun zarrapastroso como tu, nos veremos en el infierno!Arr!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(
                            "\nDios:Pero bueno que tenemos por aqui, has podido acabar con los piratas! Enhorabuena!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("\nComo recompensa te entrego esta galleta!");
                    TimeUnit.SECONDS.sleep(3);
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void Dado(Scanner sc) {
        valorDado = (int) (Math.random() * 7 + 1); // dado cuenta de 0 a 6 si le sumo uno es de 1-7?¿
        valorDado1 = (int) (Math.random() * 7 + 1);
        System.out.println("Has sacado un:" + valorDado);
        System.out.println("Pata de palo ha sacado un: " + valorDado1);
        while (valorDado == valorDado1) {
            valorDado = (int) (Math.random() * 7 + 1);
            valorDado1 = (int) (Math.random() * 7 + 1);
            System.out.println("Repitamos de nuevo hay que desempatar!");
            System.out.println("Has sacado un:" + valorDado);
            System.out.println("Pata de palo ha sacado un: " + valorDado1);
        }
    }

    public static void Intro(Scanner sc) {
        String[] intr = {
                "opcion 0--> Claro que si!!",
                "opcion 1--> Pa lante como los de Alicante!",
                "opcion 2--> No hay huevos!!",
                "opcion 3--> Porfavor sacame de aqui!!"
        };
        Arrays.stream(intr).forEach(System.out::println);
        int a = sc.nextInt();
        String elemento = intr[a];
        System.out.println("Jugador: " + elemento);
        if (a == 3) {
            System.out.println(
                    "\nDios: Ya no hay escapatoria imbecil!! JAJAJAJA...(Eres transportado epicamente a la Isla de los malditos monos)");

        } else {
            System.out.println(
                    "\nDios: Mucha suerte y cuidado con los monos (Eres transportado epicamente a la Isla de los malditos monos)...\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("//////////////// Bienvenido a Monkey Island/////////////////////\n");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n||Dios: Cuidado! para salir de la isla tendras que derrotar !!");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n||Dios: Deseas continuar??(Eliga una de las opciones en el dialogo)\n");
            TimeUnit.SECONDS.sleep(3);
            Intro(sc);
            TimeUnit.SECONDS.sleep(3);
            System.out.println(" ______________________________________________________________________________");
            System.out.println("|_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|");
            System.out.println("||.........^............^............................^........................||");
            System.out.println("||........^^^..........^^^..........................^^^........^..............||");
            System.out.println("||.......^^^^^........^^^^^.........__.............^^^^^......^^^.[SIGUIENTE]►||");
            System.out.println("||......^^^^^^^...^..^^^^^^^......_(^^)_..........^^^^^^^....^^^^^............||");
            System.out.println("||.....^^^^^^^^^.^^^.^^^^^^^^.....|(__)|.........^^^^^^^^^..^^^^^^^...........||");
            System.out.println("||_________||___^^^^^___||__________||_______________||____^^^^^^^^^__________||");
            System.out.println("||_____________^^^^^^^_________________________________________||_____________||");
            System.out.println("||____________^^^^^^^^^_______________________________________________________||");
            System.out.println("||_______________||___________________________________________________________||");
            System.out.println("|_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(
                    "\nDialogo: Has sido teletransportado. Ten cuidado por los alrededores, los  piratas te estan buscando!!");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("para el siguiente escenario pulse (1).");
            int b = sc.nextInt();
            while (b != 1) {
                System.out.println("Porfavor introduzca (1) para continuar...");
                b = sc.nextInt();
            }
            if (b == 1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                TimeUnit.SECONDS.sleep(3);
                System.out.println(" ___________________________________________________________________________");
                System.out.println("|_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_|");
                System.out.println("||......^...........................................^........................||");
                System.out.println("||.....^^^...............(!)................(!)....^^^........^..............||");
                System.out.println("||....^^^^^.............|_^_/......__......|_^_/..^^^^^......^^^.............||");
                System.out.println("||...^^^^^^^...^......._(ÒÓ)_...._(OO)_..._(**)_.^^^^^^^....^^^^^............||");
                System.out.println("||..^^^^^^^^^.^^^......|<__>¶....|(__)|...|[__]|^^^^^^^^^..^^^^^^^...........||");
                System.out.println("||______||___^^^^^_______||.|_^_/._||_______||______||____^^^^^^^^^__________||");
                System.out.println("||__________^^^^^^^_________(==)______________________________||_____________||");
                System.out.println("||_________^^^^^^^^^_______|{__}J____________________________________________||");
                System.out.println("||_____________||____________VV______________________________________________||");
                System.out.println("|_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_|");
            }
            TimeUnit.SECONDS.sleep(4);
            System.out
                    .println("\nDialogo: Te han atrapado los piratas y te acaban de retar a un duelo de insultos!!!!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nCapitan de los piratas: Voy a hacerme unos nuevos zapatos con tu piel!!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nCraneo Rojo: Te vamos a hechar a los tiburones! ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nPata de palo: ... ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(
                    "\nCapitan de los piratas: La batalla consistira en una serie de 3 rondas, vas a luchar\n contra dos de mis camaradas, si los derrotas yo sere tu ultimo adversario...");
            TimeUnit.SECONDS.sleep(3);
            System.out.println(
                    "\nCapitan de los piratas: Para averiguar quien va primero, lanzaran un dado y el que tenga el numero mas grande empieza! Arr!!");
            TimeUnit.SECONDS.sleep(3);
            System.out.println(
                    "\nCapitan de los piratas: Cada uno de mis camaradas tiene 2 vidas, tu 3 y YO JAJAJAJA... TENGO 5!! PREPARATE!!!Arr!");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Pata de palo: Tira tu primero cara nabo! Arr!");
            TimeUnit.SECONDS.sleep(2);
            Dado(sc);
            TimeUnit.SECONDS.sleep(2);
            Rondas(sc);
            System.out.println(" ___________________________________________________________________________");
            System.out.println("|_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_|");
            System.out.println("||.........................................................|#..............||");
            System.out.println("||.............................._____......................|##.............||");
            System.out.println("||........(FIN!!.............___________...................|###............||");
            System.out.println("||.........................._____________............|_____|_______/.......||");
            System.out.println("||.........................._____________............|------------/........||");
            System.out.println("||_~,,~____~,,~___~,,~________________________,,____,|___________/~,,~___,_||");
            System.out.println("||~,~.~.~.~.~..~_~..~..~...._-.__.-_.__._-~.~-~.~.~............~~~~--~~.~~.||");
            System.out.println("||~~~-~~~-----~~~-~~~~......_-_.-_._-_.__--~~-~..~~-~~~~~~~--~~~~~~........||");
            System.out.println("||~.~.~--~.~.~--~.~.~.~.~_~..___._-__.__........~~~.~~..~~-.---....~~~~--..||");
            System.out.println("||~.~.~.~.~.~..~_~..~..~....----__.__-~.~-~.~.~............~~~~--~~.~~.....||");
            System.out.println("||~~~-~~~-----~~~-~~~~......~~-~..~~-~~~~~~~--~~~~~~.......................||");
            System.out.println("|_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_||_|_|_|_|_|");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Soy juan ola lluc mira un ballena *tira agua con sonido s*

// ─────▀▄▀─────▄─────▄
// ──▄███████▄──▀██▄██▀
// ▄█████▀█████▄──▄█
// ███████▀████████▀
// ─▄▄▄▄▄▄███████▀