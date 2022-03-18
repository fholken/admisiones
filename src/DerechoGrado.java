public class DerechoGrado implements Liquidacion{

    private double valor;
    @Override
    public String getTipo() {
        return "Derecho de grado";
    }

    @Override
    public double getTotal(double valor, double descuento) {
        return valor;

    }

}
