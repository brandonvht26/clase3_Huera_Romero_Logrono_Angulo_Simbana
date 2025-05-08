package Logroño;

public class Automovil {
    private double velocidadActual;
    private final double VELOCIDAD_MAXIMA = 200.0;

    public void acelerar(double incremento) {
        if (incremento < 0) {
            System.out.println("Error: Incremento negativo.");
            return;
        }

        velocidadActual = Math.min(velocidadActual + incremento, VELOCIDAD_MAXIMA);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
    }

    public void frenar(double decremento) {
        if (decremento < 0) {
            System.out.println("Error: Decremento negativo.");
            return;
        }

        velocidadActual = Math.max(velocidadActual - decremento, 0);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public static void main(String[] args) {
        Automovil miAuto = new Automovil();

        miAuto.acelerar(50);
        miAuto.acelerar(160);
        miAuto.acelerar(10);
        miAuto.frenar(30);
        miAuto.frenar(200);
    }
}
