/*  6.	Método con Retorno de char Enunciado:
    Crea un método llamado categoriaDeCalificacion que reciba una calificación numérica y devuelva la categoría
    correspondiente como una letra (A, B, C, D, F).

    Acciones a realizar:
        •	El método debe recibir una calificación numérica y devolver una letra (char).
        •	El programa debe mostrar la categoría de calificación en la consola. */

package Huera_Brandon;

import java.util.Scanner;

public class Ejercicio1_6 {

    public static char categoriaCalificacion(float calificacion) {

        if (calificacion < 5) {
            return 'F';
        } else if (5 <= calificacion & calificacion < 7) {
            return 'D';
        } else if (7 <= calificacion & calificacion < 8) {
            return 'C';
        } else if (8 <= calificacion & calificacion < 9) {
            return 'B';
        } else {
            return 'A';
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float calificacion = 0;

        System.out.print("\nIngrese la calificación del alumno: ");
        calificacion = sc.nextFloat();

        if (0 <= calificacion & calificacion <= 10) {
            char notaLetra = categoriaCalificacion(calificacion);
            System.out.print("\nEl alumno cuya calificación es " + calificacion + " tiene una " + notaLetra + "\n");
        } else {
            System.out.print("\nLa nota ingresada es incorrecta\n");
        }

    }

}