package poo;

public class Numero {
    private double x; // campo privado para encapsulamento

    // Método getter para obter o valor do campo 'x'
    private double getX() {
        return x;
    }
    // Método setter para definir o valor do campo 'x'
    private void setX(double x) {
        this.x = x;
    }
    public double soma (double x, double y) {
        setX(x + y);
        return getX();
    }
    public double subtracao (double x, double y) {
        setX(x - y);
        return getX();
    }
    public double multiplicacao (double x, double y) {
        setX(x * y);
        return getX();
    }
    public double divisao (double x, double y) {
        setX(x / y);
        return getX();
    }
}
