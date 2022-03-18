import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner insertar = new Scanner(System.in);
        boolean certificado;
        int universidad;
        int tipoLiquidacion;
        double descuento = 10;
///////////////////////////////////////////
        //Matricula liquidacionEAFIT = new Matricula();
        //System.out.println(liquidacionEAFIT.getTotal(100,15));
///////////////////////////////////////////
        //Liquidacion liquidacionUNAULA = new LiquidacionEAFIT(new Matricula());
        //System.out.println(liquidacionUNAULA.getTotal(100,15));

        System.out.println("Ingrese el numero de la Universidad: \n 1. EAFIT \n 2. UNAULA \n 3. LIBERTADORES");
        universidad = insertar.nextInt();

        switch (universidad){
            case 1:
                Liquidacion liquidacionEAFIT;
                System.out.println("Inserte el tipo de liquidacion: \n 1. Matricula \n 2. Inscripción \n 3. Derechos de grado");
                tipoLiquidacion = insertar.nextInt();
                switch (tipoLiquidacion){
                    case 1:
                        liquidacionEAFIT = new LiquidacionEAFIT(new Matricula());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionEAFIT.getTipo() + " en EAFIT es " + liquidacionEAFIT.getTotal(100,0));
                        break;
                    case 2:
                        liquidacionEAFIT = new LiquidacionEAFIT(new Inscripcion());
                        System.out.println("Tiene certificado electoral:");
                        certificado = insertar.nextBoolean();
                        if (certificado) {
                            System.out.println("El valor de su liquidación de " +
                                    liquidacionEAFIT.getTipo() + " en EAFIT es " + (liquidacionEAFIT.getTotal(50, 0) - descuento) );
                        }else
                            System.out.println("El valor de su liquidación de " +
                                    liquidacionEAFIT.getTipo() + " en EAFIT es " + liquidacionEAFIT.getTotal(50, 0) );
                        break;
                    case 3:
                        liquidacionEAFIT = new LiquidacionEAFIT(new DerechoGrado());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionEAFIT.getTipo() + " en EAFIT es " + liquidacionEAFIT.getTotal(100,15));
                        break;
                }
                break;
            case 2:
                Liquidacion liquidacionUNAULA;
                System.out.println("Inserte el tipo de liquidacion: \n 1. Matricula \n 2. Inscripción \n 3. Derechos de grado");
                tipoLiquidacion = insertar.nextInt();
                switch (tipoLiquidacion){
                    case 1:
                        liquidacionUNAULA = new LiquidacionUNAULA(new Matricula());
                        System.out.println("Tiene certificado electoral:");
                        certificado = insertar.nextBoolean();
                        if (certificado) {
                            System.out.println("El valor de su liquidación de " +
                                    liquidacionUNAULA.getTipo() + " en UNAULA es " + (liquidacionUNAULA.getTotal(80, 0) - descuento) );
                        }else
                            System.out.println("El valor de su liquidación de " +
                                    liquidacionUNAULA.getTipo() + " en UNAULA es " + liquidacionUNAULA.getTotal(80, 0) );
                        break;
                    case 2:
                        liquidacionUNAULA = new LiquidacionUNAULA(new Inscripcion());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionUNAULA.getTipo() + " en EAFIT es " + liquidacionUNAULA.getTotal(40,0));
                    break;
                    case 3:
                        liquidacionUNAULA = new LiquidacionUNAULA(new DerechoGrado());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionUNAULA.getTipo() + " en EAFIT es " + liquidacionUNAULA.getTotal(80,20));
                        break;
                }
                break;
            case 3:
                Liquidacion liquidacionLIBERTADORES;
                System.out.println("Inserte el tipo de liquidacion: \n 1. Matricula \n 2. Inscripción \n 3. Derechos de grado");
                tipoLiquidacion = insertar.nextInt();
                switch (tipoLiquidacion){
                    case 1:
                        liquidacionLIBERTADORES = new LiquidacionLIBERTADORES(new Matricula());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionLIBERTADORES.getTipo() + " en EAFIT es " + liquidacionLIBERTADORES.getTotal(90,0));
                        break;
                    case 2:
                        liquidacionLIBERTADORES = new LiquidacionLIBERTADORES(new Inscripcion());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionLIBERTADORES.getTipo() + " en EAFIT es " + liquidacionLIBERTADORES.getTotal(40,0));
                        break;
                    case 3:
                        liquidacionLIBERTADORES = new LiquidacionLIBERTADORES(new DerechoGrado());
                        System.out.println("El valor de su liquidación de " +
                                liquidacionLIBERTADORES.getTipo() + " en EAFIT es " + liquidacionLIBERTADORES.getTotal(10,0));
                        break;
                }
                break;
        }


    }
}
