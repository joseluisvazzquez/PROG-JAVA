package EJE1;

public class m {
    public static void main(String[] args) {

       Circulo circulo = new Circulo(2.5);
       Cuadrado cuadrado = new Cuadrado(4.5);
       Rectangulo rectangulo = new Rectangulo(29, 39);

       circulo.calcularArea();
       circulo.calcularPerimetro();
       cuadrado.calcularArea();
       cuadrado.calcularPerimetro();
       rectangulo.calcularArea();
       rectangulo.calcularPerimetro();
        
    }
}
