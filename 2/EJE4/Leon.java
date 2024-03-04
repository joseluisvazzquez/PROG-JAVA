package EJE4;

public class Leon extends Animal implements Carnivoro{

    public Leon(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    
    }

    @Override
    public void Alimentar(Carne carne) {
        System.out.println("Estoy comiendo:"+carne.getName()+ "  cuantas estoy comiendo?: "+ carne.getQuantity());
    }
    
}
