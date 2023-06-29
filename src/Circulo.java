import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double obtenerVolumen() {
        return 0;
    }

    public void definirRadio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        this.radio = entrada.nextDouble();
    }
}
