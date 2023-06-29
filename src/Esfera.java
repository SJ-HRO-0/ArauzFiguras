import java.util.Scanner;

public class Esfera extends Figura {
    private double radio;

    @Override
    public double obtenerPerimetro() {
        return 0;
    }

    @Override
    public double obtenerArea() {
        return 4 * Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3);
    }

    public void definirRadio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el radio de la esfera: ");
        this.radio = entrada.nextDouble();
    }
}
