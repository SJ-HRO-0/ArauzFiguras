import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la calculadora de figuras.");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Esfera");
        System.out.println("5. Pirámide");
        System.out.println("6. Cubo");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                // Cuadrado
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.definirLado();
                mostrarResultados(cuadrado);
                break;
            case 2:
                // Triangulo
                Triangulo triangulo = new Triangulo();
                triangulo.definirDimensiones();
                mostrarResultados(triangulo);
                break;
            case 3:
                // Círculo
                Circulo circulo = new Circulo();
                circulo.definirRadio();
                mostrarResultados(circulo);
                break;
            case 4:
                // Esfera
                Esfera esfera = new Esfera();
                esfera.definirRadio();
                mostrarResultados(esfera);
                break;
            case 5:
                // Piramide
                Piramide piramide = new Piramide();
                piramide.definirDimensiones();
                mostrarResultados(piramide);
                break;
            case 6:
                // Cubo
                Cubo cubo = new Cubo();
                cubo.definirLado();
                mostrarResultados(cubo);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static void mostrarResultados(Figura figura) {
        System.out.println("Perímetro: " + figura.obtenerPerimetro());
        System.out.println("Área: " + figura.obtenerArea());
        System.out.println("Volumen: " + figura.obtenerVolumen());
    }
}
