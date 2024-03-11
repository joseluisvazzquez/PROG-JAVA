package EJE4;

public class Carne{
    private String name;
    private int quantity;
    
    public Carne(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
}