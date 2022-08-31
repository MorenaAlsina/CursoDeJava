package EjercicioBanco;

public class UsoCuenta {
    public static void main(String[] args) {

        //Intancias
        CuentaCorriente Cuenta1 = new CuentaCorriente("Alsina, Morena", 3000);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Albrecht, Joaquin",3500);
        System.out.println();

        //Datos de las cuentas
        System.out.println("     ESTADO DE CUENTA                    ");
        System.out.println("________________________________________________________________________________________________");
        System.out.println("El titular: " + Cuenta1.getDatosGenerales()+"." + " Tiene un monto de: " + Cuenta1.getSaldo());
        System.out.println("El titular: " + Cuenta2.getDatosGenerales() +"."+ " Tiene un monto de: " + Cuenta2.getSaldo());
        System.out.println("________________________________________________________________________________________________");
        System.out.println();

        //Trasferencia
        Cuenta1.Transferenicas(Cuenta2, 2500);
        System.out.println("________________________________________________________________________________________________");
        System.out.println("                   TRANSFERENCIA EXITOSA                          ");
        System.out.println("El titular: " + Cuenta1.getDatosGenerales()+","+ "transfirio el monto de $2500 a: " + Cuenta2.getDatosGenerales());
        System.out.println("________________________________________________________________________________________________");
        System.out.println();

        //Datos luego de la transferencia
        System.out.println("                         ESTADO ACTUAL DE LAS CUENTAS                  ");
        System.out.println("________________________________________________________________________________________________");
        System.out.println("El saldo actual del titular: " + Cuenta1.getDatosGenerales()+"." + "Tiene un monto de " + Cuenta1.getSaldo());
        System.out.println("El saldo actual del titular: " + Cuenta2.getDatosGenerales()+"." + "Tiene un monto de " + Cuenta2.getSaldo());
        System.out.println("________________________________________________________________________________________________");

    }
}
