package AnguloEjer1_8_12;

public class CuentasPrivate {

    private double saldo;

    public CuentasPrivate(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito){
        if (deposito>0)
            saldo+=deposito;
        else
            System.out.println("No se permite el deposito");

    }

    public void retirar(double retiro){
        if (retiro>0&&retiro<=saldo)
            saldo-=retiro;
        else
            System.out.println("No se permite el retiro");

    }



}

