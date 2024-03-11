package EJE1;

public class Circulo extends Figura {
    private Double radio;
    
    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        Double rad  = Math.PI*(this.radio*this.radio);
        System.out.println("Este es el area de tu Circulo:"+rad);
        
    }

    @Override
    public void calcularPerimetro() {
        Double pe = 2*Math.PI*this.radio;
        System.out.println("Este es el perimetro de tu Circulo:"+pe);

    }
}
