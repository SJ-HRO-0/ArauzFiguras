import java.util.Scanner;

public class Cubo extends Figura {
    private double lado;

    @Override
    public double obtenerPerimetro() {
        return 12 * this.lado;
    }

    @Override
    public double obtenerArea() {
        return 6 * Math.pow(this.lado, 2);
    }

    @Override
    public double obtenerVolumen() {
        return Math.pow(this.lado, 3);
    }

    public void definirLado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el lado del cubo: ");
        this.lado = entrada.nextDouble();
    }
}
