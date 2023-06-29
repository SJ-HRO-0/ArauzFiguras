import java.util.Scanner;

public class Cuadrado extends Figura {
    private double lado;

    @Override
    public double obtenerPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public double obtenerArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    public void definirLado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el lado del cuadrado: ");
        this.lado = entrada.nextDouble();
    }
}
