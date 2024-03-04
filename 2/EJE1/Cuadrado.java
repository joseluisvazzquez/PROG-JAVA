package EJE1;

public class Cuadrado extends Figura{
    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularPerimetro() {
        Double pe  = 2*(this.lado);
        System.out.println("Este es el perimetro de tu Cuadrado:"+pe);
         
    }
    @Override
    public void calcularArea() {
        Double ar = this.lado*this.lado;
        System.out.println("Este es el perimetro de tu Circulo:"+ar);

         
    }

    
}
