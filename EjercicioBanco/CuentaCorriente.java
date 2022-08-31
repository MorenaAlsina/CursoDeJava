package EjercicioBanco;

public class CuentaCorriente {
    //Propiedades
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta = (long)(Math.random()*1000000000+1);

    //Constructor con parametros
    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaCorriente(final CuentaCorriente c){
        nombreTitular = c.nombreTitular;
        saldo = c.saldo;
        numeroCuenta = c.numeroCuenta;
    }
    //Metodos
    /* Setter --> permite hacer ingresos y reingresos */
    public void setIngresos(double i) {
        saldo = i + saldo;
    }
    public double setReingresos (double i){
        saldo = saldo - i;
        return saldo;
    }
    /*Getter --> permite obtener saldo y datos generales */
    public double getSaldo(){
        return this.saldo;
    }
    public String getDatosGenerales (){
        System.out.println("Numero de cuenta: " + numeroCuenta );
        return this.nombreTitular;
    }
    /* Metodo Adicional --> permite realizar transferencias */
    public void Transferenicas(CuentaCorriente c, double monto) {
        setReingresos(monto);
        c.setIngresos(monto);
    }
}
