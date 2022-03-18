public abstract class LiquidacionServicio  implements Liquidacion{

    private Liquidacion liquidacion;

    public LiquidacionServicio(Liquidacion liquidacion) {
        this.liquidacion = liquidacion;
    }

    public Liquidacion getLiquidacion(){
        return  liquidacion;
    }
}
