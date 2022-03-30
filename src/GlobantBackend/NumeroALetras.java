package GlobantBackend;
import java.util.Scanner;

public class NumeroALetras {
    // Un algoritmo que convierta un valor numerico a letras, si ingreso 1000
    // debe retornar mil o si ingreso 139800 debe retornar ciento treinta y nueve mil ochocientos,
    // podemos dejar un limite de ingreso de 100 millones.
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);

        System.out.print("Ingresa un numero ");
        int num=Scan.nextInt();
        System.out.println("");

        int longitud=Double.toString(num).length();

        NumberToLetter let=new NumberToLetter(num,longitud);

        let.calcularPalabra9Numero();
        let.calcularPalabra8Numero();
        let.calcularPalabra7Numero();
        let.calcularPalabra6Numero();
        let.calcularPalabra5Numero();
        let.calcularPalabra4Numero();
        let.calcularPalabra3Numero();
        let.calcularPalabra2Numero();
        let.calcularPalabra1Numero();

    }
}
