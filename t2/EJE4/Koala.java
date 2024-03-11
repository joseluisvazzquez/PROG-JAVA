package EJE4;

public class Koala extends Animal implements Herbivoro {

    public Koala(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        
    }

    @Override
    public void Alimentar(Vegetal vegetal) {
        System.out.println("Estoy comiendo:"+vegetal.getName()+ "  cuantas estoy comiendo?: "+ vegetal.getQuantity());
    }


    
}
