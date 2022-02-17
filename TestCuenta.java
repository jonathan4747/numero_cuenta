public class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1  = new Cuenta(100, 150);

        System.out.println(cuenta1.getCuenta());

        cuenta1.Deposito(50, "corriente");
        System.out.println(cuenta1.getCuenta());
        cuenta1.Deposito(50, "ahorros");
        System.out.println(cuenta1.getAhorros());

        cuenta1.Retiro(20, "corriente");
        System.out.println(cuenta1.getCuenta());
        cuenta1.Retiro(5.5, "ahorros");
        System.out.println(cuenta1.getAhorros());

        cuenta1.obtnerSaldo();


    }
    
}
