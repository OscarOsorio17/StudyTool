package studyTool;
import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args) {
        //Se crea el objeto del Scanner
        Scanner Scan=new Scanner(System.in);

        //Se crea el objeto
        Cuenta cuenta1=new Cuenta(50.00);
        Cuenta cuenta2=new Cuenta(-7.53);

        //Muestra el saldo inicial de cada objeto
        System.out.println("Saldo de la cuenta1: $"+cuenta1.obtenerSaldo());
        System.out.println("Saldo de la cuenta2: $"+cuenta2.obtenerSaldo());

        double montoDeposito;

        //Se pedira el monto a abonar en la cuenta1
        System.out.print("\nEscribe el monto para depositar en la cuenta1: $");
        montoDeposito=Scan.nextDouble();
        System.out.println("Sumando al saldo de la cuenta1 $"+montoDeposito);
        cuenta1.abonar(montoDeposito);//Abona en cuenta1

        //Se pedira el monto a abonar en la cuenta2
        System.out.print("\nEscribe el monto para depositar en la cuenta2: $");
        montoDeposito=Scan.nextDouble();
        System.out.println("Sumando al saldo de la cuenta2 $"+montoDeposito);
        cuenta2.abonar(montoDeposito);//Abona en cuenta2

        //Muestra el saldo final de cada objeto
        System.out.println("\nSaldo de la cuenta1: $"+cuenta1.obtenerSaldo());
        System.out.println("Saldo de la cuenta2: $"+cuenta2.obtenerSaldo());
    }
}
