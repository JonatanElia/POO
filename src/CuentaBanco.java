public class CuentaBanco {
    private int numeroCuenta;
    private int cedula;
    private double saldoActual;

    public CuentaBanco() {
    }

    public CuentaBanco(int numeroCuenta, int cedula, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.cedula = cedula;
        this.saldoActual = saldoActual;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" +
                "numeroCuenta=" + numeroCuenta +
                ", cedula=" + cedula +
                ", saldoActual=" + saldoActual +
                '}';
    }

    public double ingresarDinero(double ingresado){
        if(ingresado>0) {
            System.out.println("Usted a ingresado "+ingresado);
            return this.saldoActual+=ingresado;
        }
        else {
            System.out.println("No se puede ingresar 0");
            return 0;
        }
    }
    public double retirarDinero(double retirado){
        if(retirado<=this.saldoActual && this.saldoActual>10000) {
            System.out.println("Usted a retirado: "+this.saldoActual);
            return this.saldoActual-=retirado;
        }
        else {
            System.out.println("Saldo insuficiente");
            return 0;
        }
    }
    public double extraccionRapida(){
        if(10000<this.saldoActual) {
            System.out.println("Usted a retirado " + this.saldoActual*20/100);
            return this.saldoActual-=this.saldoActual*20/100;
        }
        else {
            System.out.println("Saldo insuficiente");
            return 0;
        }
    }
    public double consultarSaldo(){
        return this.saldoActual;
    }

}
