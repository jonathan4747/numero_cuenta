import java.util.Random;
public class Cuenta{
    private double cuenta_corriente;
    private double ahorros;
    public static int cuentas;
    public static double saldo_total;

    public Cuenta( double cuenta_corriente , double ahorros){
        this.cuenta_corriente=cuenta_corriente;
        this.ahorros=ahorros;
        cuentas++;
        saldo_total=cuenta_corriente+ahorros;
    }

    public double getCuenta(){
        return cuenta_corriente;
    }
    public double getAhorros(){
        return ahorros;
    }

    public void Deposito ( double dinero , String cuenta){
        if (cuenta == "corriente"){
            cuenta_corriente=cuenta_corriente+dinero;
        }
        if (cuenta == "ahorros"){
            ahorros = ahorros + dinero;
        }    
    }

    public void Retiro ( double dinero , String cuenta){
        if (cuenta == "corriente"){
            if (cuenta_corriente > dinero){
            cuenta_corriente=cuenta_corriente-dinero;
            }
            else{
                System.out.println("No hay saldo suficiente");
            }
        }

        if (cuenta == "ahorros"){
            if (ahorros > dinero){
                ahorros=ahorros-dinero;
            }
            else{
                System.out.println("No hay saldo suficiente");
            }
        }

    }

    public void  obtnerSaldo(){
        System.out.println("El saldo de la cuenta corriente es: "+getCuenta());
        System.out.println("El saldo de ahorros es: "+ getAhorros());
    }

    public static char[] generatePassword (){
        char arreglo [] =new char[26];
        Random randMachine = new Random();
        char  password[] = new char[8];
        for (int i = 0 ; i<26 ; i++){
            arreglo[i]= (char)('a'+i) ;
        }
        for(int i = 0 ; i<8 ; i++){
            password[i]= arreglo[randMachine.nextInt(25)];    
        }
        return password;
    }

}