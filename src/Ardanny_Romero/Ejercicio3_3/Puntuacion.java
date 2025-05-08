package Ardanny_Romero.Ejercicio3_3;

public class Puntuacion {
    private int puntos;

    public Puntuacion() {
        this.puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int Sumar_Puntos(int puntos){ //esto se llamaba Calcular_Puntaje
        this.puntos += puntos;
        return this.puntos;
    }
}
