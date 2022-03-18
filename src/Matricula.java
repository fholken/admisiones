public class Matricula implements Liquidacion{

    private double valor;
    @Override
    public String getTipo() {
        return "Matricula";
    }

    @Override
    public double getTotal(double valor, double descuento) {
        return valor;

    }

}
