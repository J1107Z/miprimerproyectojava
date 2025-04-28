package Modelo;

public class Triangulo extends Figura {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double resultado = (base * altura)/2;
        return resultado;
    }
    
}
