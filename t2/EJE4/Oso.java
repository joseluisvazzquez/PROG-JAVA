package EJE4;

public class Oso extends Animal implements Carnivoro, Herbivoro{

    public Oso(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void Alimentar(Carne carne) {
        System.out.println("Estoy comiendo:"+carne.getName()+ "  cuantas estoy comiendo?: "+ carne.getQuantity());
        
    }

    @Override
    public void Alimentar(Vegetal vegetal) {
        System.out.println("Estoy comiendo:"+vegetal.getName()+ "  cuantas estoy comiendo?: "+ vegetal.getQuantity());
    }

    
}
