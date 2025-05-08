package Simbana.Ejercicio04_Validacion;
import java.util.Scanner;

public class Main_Conf_Usuario {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //creamos una clase
        Conf_Usuario conf= new Conf_Usuario();


        //Ingresamos Datos
        System.out.println("Ingrese el Idioma: ");
        System.out.println("Español/Ingles/Frances");
        String idioma= scanner.nextLine();

        //LLamamos a la funcion
        conf.validacion_idioma(idioma);

        System.out.println();

        //ingresamos opcion
        System.out.println("Quieres activar las notificaciones");
        System.out.println("Si /No");
        String v_notificacion= scanner.nextLine();

        //LLamamos a la funcion
        conf.validacion_notificacion(v_notificacion);

    }
}
