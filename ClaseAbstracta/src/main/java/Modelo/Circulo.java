
package Modelo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double x, double y) {
        super(x, y);
    }

    
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }


    
}
