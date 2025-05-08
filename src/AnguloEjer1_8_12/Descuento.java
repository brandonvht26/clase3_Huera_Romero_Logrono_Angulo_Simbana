package AnguloEjer1_8_12;

public class Descuento {

    public int calcularDescuento(double precio, double porcentajeDescuento){
        double montoDescuento=precio*porcentajeDescuento/100;
        return (int)montoDescuento;
    }
}
