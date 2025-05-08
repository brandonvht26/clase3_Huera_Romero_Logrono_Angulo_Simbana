package Logroño;

public class Velocidad {
    private double velocidad;
    private final double VELOCIDAD_MAXIMA = 200.0;

    public void acelerar(double incremento) {
        if (incremento < 0) {
            System.out.println("Error: incremento negativo.");
            return;
        }

        velocidad = Math.min(velocidad + incremento, VELOCIDAD_MAXIMA);
        System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
    }

    public void frenar(double decremento) {
        if (decremento < 0) {
            System.out.println("Error: decremento negativo.");
            return;
        }

        velocidad = Math.max(velocidad - decremento, 0);
        System.out.println("Frenando... Velocidad actual: " + velocidad + " km/h");
    }

    public double getVelocidad() {
        return velocidad;
    }

    public static void main(String[] args) {
        Velocidad miVelocidad = new Velocidad();

        miVelocidad.acelerar(100);
        miVelocidad.acelerar(120);
        miVelocidad.frenar(50);
        miVelocidad.frenar(100);

        System.out.println("Velocidad final: " + miVelocidad.getVelocidad() + " km/h");
    }
}
