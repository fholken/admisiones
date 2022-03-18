public class Inscripcion implements Liquidacion{

    private double valor;
    @Override
    public String getTipo() {
        return "Inscripcion";
    }

    @Override
    public double getTotal(double valor, double descuento) {
        return valor;

    }

}
