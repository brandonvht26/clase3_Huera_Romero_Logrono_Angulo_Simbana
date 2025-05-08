package AnguloEjer1_8_12;

import java.util.Scanner;

public class Ejer12Main {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese saldo de su cuenta: ");
        double _saldo=leer.nextDouble();
        int opcion=1;
        while(opcion!=3){
            System.out.println(" Bancos - Control de Cuentas ");
            System.out.println("------- Menu -------");
            System.out.println(" 1. Deposito");
            System.out.println(" 2. Retiro");
            System.out.println(" 3. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion=leer.nextInt();

            CuentasPrivate cuenta = new CuentasPrivate(_saldo);

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito=leer.nextDouble();
                    cuenta.depositar(deposito);
                    _saldo=cuenta.getSaldo();
                    System.out.println("El saldo es: "+cuenta.getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    double retiro=leer.nextDouble();
                    cuenta.retirar(retiro);
                    _saldo=cuenta.getSaldo();
                    System.out.println("El saldo es: "+cuenta.getSaldo());
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


