package AnguloEjer1_8_12;

import java.util.Scanner;

/*1.	Bancos - Control de Cuentas
Validación de Depósito:
    Verificar que el monto a depositar sea positivo.
    Si es negativo o cero, no debe permitirse el depósito.
 Validación de Retiro:
    Verificar que el monto a retirar sea positivo y no exceda
     el saldo disponible en la cuenta.*/
public class Ejer8Main {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese saldo de su cuenta: ");
        double saldo=leer.nextDouble();
        int opcion=1;
       while(opcion!=3){
           System.out.println(" Bancos - Control de Cuentas ");
           System.out.println("--------Menu--------");
           System.out.println(" 1. Deposito");
           System.out.println(" 2. Retiro");
           System.out.println(" 3. Salir");

           System.out.println("Ingrese una opcion: ");
           opcion=leer.nextInt();

           Cuentas cuenta = new Cuentas(saldo);

           switch (opcion){
               case 1:
                   System.out.println("Ingrese el monto a deposistar: ");
                   double deposito=leer.nextDouble();
                   saldo=cuenta.depositar(deposito);
                   cuenta.mostrarSaldo();
                   break;
               case 2:
                   System.out.println("Ingrese el monto a retirar: ");
                   double retiro=leer.nextDouble();
                   saldo=cuenta.retirar(retiro);
                   cuenta.mostrarSaldo();
                   break;
               case 3:
                   System.out.println("  Saliendo....Gracias");
                   break;
               default:
                   System.out.println("   Opcion invalida ");
           }
       }

    }
}

