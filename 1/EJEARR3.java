import java.util.Scanner;
public class EJEARR3 {
   static void sumar(){

    int[][] matr = {{1,2,3},{1,2,3},{1,2,3}};
    int resultado, i, j; 
    resultado = 0;

    i = 0;
    while(i < matr.length){

        j = 0;
        while(j < matr[i].length){

            resultado = resultado + matr[i][j];
        j++;
        }
    i++;
    }
    System.out.println(resultado); 
   }
static void UndirLaFlota(){
        Scanner x = new Scanner(System.in);
        System.out.println("indique la posicion lateral Y:");
            int posy = x.nextInt();

        System.out.println("indique la posicion horizontal X:");
            int posx = x.nextInt();
    
        int[][] o = {
            {1,0,0,0,1},
            {1,0,0,0,0},
            {1,0,0,1,0},
        };
        int i;
        i = 5;
    /*while(posx > o.length && posy > o.length){
        System.out.println("Los valores introducidos o cumplen con el tablero, es de 3x4 ");
        System.out.println("Escoja de nuevo la posicion horizontal:");
                 posx = x.nextInt();
            System.out.println("Escoja de nuevo la posicion lateral:");
                posy = x.nextInt();
    }*/
        while(posx < o.length || posy < o.length || i != 0){
            if (o[posy][posx] == 1){
                System.out.println("Le has dado a un barco!!!!");
                System.out.println("Escoja de nuevo la posicion horizontal:");
                    posx = x.nextInt();
                System.out.println("Escoja de nuevo la posicion lateral:");
                    posy = x.nextInt();
                o[posx][posy] = 0;
            }
                else{
                    System.out.println("Has fallado!!!! Tienes:"+i+"intentos");
                        i = i-1;
                    System.out.println("Escoja de nuevo la posicion horizontal:");
                        posx = x.nextInt();
                    System.out.println("Escoja de nuevo la posicion lateral:");
                        posy = x.nextInt();
            }
                if( i == 0){
            break;
            }
        }
    }
 
    public void main(String[] args){
        UndirLaFlota();
        sumar();
    }
}

