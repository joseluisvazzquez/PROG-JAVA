package EJE1;

public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    

    @Override
    public void calcularArea() {
        double ar = this.base*this.altura;
        System.out.println("Este es el area de tu Rectangulo:"+ar);
    }

    @Override
    public void calcularPerimetro() {
        double pe = 2*this.base+2*this.altura;
        System.out.println("Este es el perimetro de tu Rectangulo:"+pe);
    }
    
}
