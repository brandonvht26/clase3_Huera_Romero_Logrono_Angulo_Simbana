/*  5.	Método con Retorno de boolean Enunciado:
    Crea un método llamado verificarEdad que reciba la edad de una persona y determine si es mayor de edad
    (18 años o más). El método debe devolver true si la persona es mayor de edad y false si no lo es.

    Acciones a realizar:
        •	El método debe devolver un valor boolean (true o false).
        •	El programa debe mostrar si la persona es mayor de edad o no, según el resultado del método. */

package Huera_Brandon;

import java.util.Scanner;

public class Ejercicio1_5 {

    public static boolean verificarEdad(int edad) { // Método

        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEs mayor de edad???");
        System.out.print("\nIngrese su edad para comprobarlo: ");
        int edad = sc.nextInt();

        System.out.print("El resultado boolean es: " + verificarEdad(edad) + "\n");

        if (verificarEdad(edad) == false) {
            System.out.print("\nUsted es menor de edad\n");
        } else {
            System.out.print("\nUsted es mayor\n");
        }

        sc.close();
    }
}