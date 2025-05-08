package Simbana.Ejercicio04_Encapsulamiento;

import java.util.Scanner;

public class Main_Conf_UsuarioE {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //Creamos el objeto
        Conf_UsuarioE conf= new Conf_UsuarioE();


        //Ingresamos Datos
        System.out.println("Ingrese el idioma a cambiar (Español/Ingles/Francés)");
        String nu_idioma= scanner.next();
        scanner.nextLine();

        //Llamamos a la funcion
        conf.cambiar_idioma(nu_idioma);


        // Ingreso de opción para notificaciones
        System.out.println("¿Desea activar notificaciones? (Si / No):");
        String respuesta = scanner.nextLine().trim();


        boolean activar = false;

        if (respuesta.equalsIgnoreCase("Si")) {
            activar = true;
        } else if (!respuesta.equalsIgnoreCase("No")) {
            System.out.println("Entrada inválida. Se desactivarán las notificaciones por defecto.");
        }

        //Llamar a la funcion
        conf.activar_notificacion(activar);

    }
}
