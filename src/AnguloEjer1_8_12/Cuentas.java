package AnguloEjer1_8_12;

public class Cuentas {

    public double saldo;

    public Cuentas( double saldo){
        this.saldo=saldo;}

    public double depositar(double deposito){
        if (deposito>0)
            saldo+=deposito;
        else
            System.out.println("No se permite el deposito");
        return saldo;
    }

    public double retirar(double retiro){
        if (retiro>0&&retiro<=saldo)
            saldo-=retiro;
        else
            System.out.println("No se permite el retiro");

        return saldo;
    }

   public void mostrarSaldo(){
       System.out.println("El saldo ahora es:"+saldo);

   }

}
