/*  7.	Método con Retorno de float Enunciado:
    Crea un método llamado calcularPrecioConDescuento que reciba el precio original de un producto y un descuento
    en porcentaje. El método debe devolver el precio final después de aplicar el descuento, utilizando el
    tipo de dato float.

    Acciones a realizar:
        •	El método debe recibir el precio original y el descuento, y devolver el precio final calculado como
            un valor de tipo float.
        •	El programa debe mostrar el precio final después de aplicar el descuento. */

package Huera_Brandon;

import java.util.Scanner;

public class Ejercicio1_7 {

    public static float calcularPrecioConDescuento(float precio, float tasaDescuento) {

        return precio-(precio*tasaDescuento);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el subtotal de compras: ");
        float precio = sc.nextFloat();
        System.out.print("Ingrese la tasa de descuento (0 < i < 1): ");
        float tasaDecuento = sc.nextFloat();

        if (0 <= tasaDecuento & tasaDecuento <=1) {
            float total = calcularPrecioConDescuento(precio, tasaDecuento);
            System.out.print("\nEl total a pagar es de " + total + " $ \n");
        } else {
            System.out.print("\nLa tasa de descuento ingresada no es reconocida\n");
        }

    }

}
