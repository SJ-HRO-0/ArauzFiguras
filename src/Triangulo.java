import java.util.Scanner;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    @Override
    public double obtenerPerimetro() {
        return 2 * this.altura + this.base;
    }

    @Override
    public double obtenerArea() {
        return 0.5 * this.base * this.altura;
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    public void definirDimensiones() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la base del triángulo: ");
        this.base = entrada.nextDouble();
        System.out.println("Introduzca la altura del triángulo: ");
        this.altura = entrada.nextDouble();
    }
}
