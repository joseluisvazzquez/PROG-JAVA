import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrearLista {
    public static void ListaEje(){
         /*ArrayList<String> semana = new ArrayList<String>();
            semana.add("Lunes"); 
            semana.add("Martes");
            semana.add("Miercoles");
            semana.add("Jueves");
            semana.add("Viernes");
            semana.add("Sabado");
            semana.add("Domingo");
        System.out.println(semana);
        */
    /* Otra forma: */
    System.out.println("Ejercicio listas 1 y 2 :----------------------------");
        ArrayList<String> semanaArrayLista = new ArrayList<>(Arrays.asList("Lunes","Martes","Miercoles","Jueves","pi","pi","pi"));
        /*for(int i = 0; i <= semanaArrayLista.size(); i++){
            System.out.println(semanaArrayLista.get(i));
        }*/
        semanaArrayLista.add(3, "Juernes");
        semanaArrayLista.remove(4);
        for(String dia : semanaArrayLista){
            System.out.println(dia);
        }
    System.out.println("Ejercicio listas 3 :----------------------------");
        ArrayList<String> listaDos = new ArrayList<>();
        listaDos.addAll(semanaArrayLista);
        for(String dia : listaDos){
            System.out.println(dia);
        }
    System.out.println(listaDos.get(2));
    
    }
    public static void Ejelist1(){
         List <Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
         for(int i = 0 ; i < numeros.size(); i++){
            int total  = 0;
            total += numeros.get(i);
            System.out.println(total);
         }
    }
    public static void main(String[] args) {
        ListaEje();
    }
}
