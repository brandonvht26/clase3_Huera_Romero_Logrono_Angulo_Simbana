package Ardanny_Romero.Ejercicio2_3;

public class Puntuacion {
    int puntos;

    public Puntuacion() {
        this.puntos = 0;
    }

    public int Calcular_Puntaje(int puntos){
        this.puntos += puntos;
        return this.puntos;
    }
}
