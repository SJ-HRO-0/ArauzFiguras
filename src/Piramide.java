import java.util.Scanner;

public class Piramide extends Figura {
    private double base;
    private double altura;

    @Override
    public double obtenerPerimetro() {
        return 4 * this.base;
    }

    @Override
    public double obtenerArea() {
        return this.base * this.base + 2 * this.base * Math.sqrt(Math.pow(this.base / 2, 2) + Math.pow(this.altura, 2));
    }

    @Override
    public double obtenerVolumen() {
        return (1.0 / 3.0) * this.base * this.base * this.altura;
    }

    public void definirDimensiones() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la longitud de la base de la pirámide: ");
        this.base = entrada.nextDouble();
        System.out.println("Introduzca la altura de la pirámide: ");
        this.altura = entrada.nextDouble();
    }
}
