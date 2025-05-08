package AnguloEjer1_8_12;
/*   1.	Metodo con Retorno de int Enunciado:
        Crea un metodo llamado calcularDescuento que reciba el precio original de un producto y el porcentaje de descuento.
        El metodo debe devolver el monto del descuento en int.
        Acciones a realizar:
        •	El metodo debe recibir el precio y el porcentaje de descuento.
        •	El programa debe mostrar el monto del descuento en la consola..*/

import java.util.Scanner;
public class Ejer1Main {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el precio del producto ($):");
        double precioOriginal= leer.nextDouble();
        System.out.println("Ingrese el porcentaje (0-100%) de descuento");
        double porcentajeDescuento= leer.nextDouble();
        Descuento desc= new Descuento();

        int descuento=desc.calcularDescuento(precioOriginal,porcentajeDescuento);
        System.out.println("El descuento es: "+descuento+"$");

    }
}