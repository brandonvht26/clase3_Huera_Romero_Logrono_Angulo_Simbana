package Ardanny_Romero.Ejercicio1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola Usuario! Como te llamas?");
        System.out.print("Tu nombre: "); String nombre = sc.nextLine();

        Usuario usuario1 = new Usuario(nombre);
        System.out.println(usuario1.saludos(usuario1.nombre_de_usuario));
    }
}