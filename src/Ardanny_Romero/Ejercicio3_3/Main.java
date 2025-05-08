package Ardanny_Romero.Ejercicio3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Puntuacion jugador = new Puntuacion();
        Scanner sc = new Scanner(System.in);

        System.out.println("= = = = = = = = = = = Un Juego! = = = = = = = = = = =\nIngrese aqui los puntos que haya acumulado en sus partidas: ");
        System.out.print("\nPuntos (0 para salir): "); int puntos = sc.nextInt(); sc.nextLine();

        while (puntos != 0){
            if (puntos > 0) {
                int total = jugador.Sumar_Puntos(puntos);
                System.out.printf("Puntaje acumulado: %d\n", total);
            }
            else if (puntos < 0) {
                System.out.println("No existe el puntaje negativo... Intenta de nuevo");
            }
            System.out.print("\nPuntos (0 para salir): "); puntos = sc.nextInt(); sc.nextLine();
        }

        System.out.printf("= = = Puntaje final: %d!",jugador.getPuntos());
        sc.close();
    }
}
