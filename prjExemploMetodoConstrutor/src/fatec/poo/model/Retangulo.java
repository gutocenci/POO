package fatec.poo.model;

public class Retangulo {

    private double altura;
    private double base;

    public Retangulo(double a, double b) {
        altura = a;
        base = b;
    }

    public double getAltura() {
        return (altura);
    }

    public double getBase() {
        return (base);
    }

    public double CalcArea() {
        double area;
        area = altura * base;
        return (area);
    }

    public double CalcPerimetro() {
        double perimetro;
        perimetro = 2 * (base + altura);
        return (perimetro);
    }

    public double calcDiagonal() {
        double diagonal;
        diagonal = Math.sqrt(Math.pow(altura, 2)) + Math.sqrt(Math.pow(base, 2));
        return (diagonal);
    }
}
