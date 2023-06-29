public class Punto {
    private double x, y, z;

    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double obtenerX() {
        return this.x;
    }

    public void establecerX(double x) {
        this.x = x;
    }

    public double obtenerY() {
        return this.y;
    }

    public void establecerY(double y) {
        this.y = y;
    }

    public double obtenerZ() {
        return this.z;
    }

    public void establecerZ(double z) {
        this.z = z;
    }
}
