package Logroño;

public class Iva {

    public static double calcularIVA(double precio) {
        double iva = precio * 0.21;
        return iva;
    }
    public static void main(String[] args) {
        double precioProducto = 100.0;
        double ivaCalculado = calcularIVA(precioProducto);
        System.out.println("El IVA del producto es: " + ivaCalculado);
    }
}

//3456789