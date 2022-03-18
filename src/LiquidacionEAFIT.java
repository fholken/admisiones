public class LiquidacionEAFIT extends LiquidacionServicio{

    private double valor;
    public LiquidacionEAFIT(Liquidacion liquidacion) {
        super(liquidacion);
    }

    @Override
    public String getTipo() {
        return getLiquidacion().getTipo();
    }

    @Override
    public double getTotal(double valor, double descuento) {
        if (descuento > 0 ) {
            this.valor = (valor * descuento) / 100;
        } else {
            this.valor = valor;
        }
        return this.valor;
    }

}
