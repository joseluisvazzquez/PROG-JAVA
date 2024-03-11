package EJE4;

public class m {
    public static void main(String[] args) {
        Koala koala = new Koala("Pedro", 20, 80);
        Leon leon = new Leon("Biel", 21, 90);
        Oso oso = new Oso("xisco", 18, 89);

        Carne muslo = new Carne("muslo", 20);
        Vegetal planta = new Vegetal("planta", 10);

        oso.Alimentar(planta);
        oso.Alimentar(muslo);

        koala.Alimentar(planta);
        leon.Alimentar(muslo);
    }
    
}
