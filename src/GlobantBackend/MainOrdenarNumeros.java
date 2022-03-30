package GlobantBackend;
import java.util.Scanner;
public class MainOrdenarNumeros {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);

        System.out.print("Ingrese un numero a ordenar: ");
        String numeros=Scan.nextLine();

        OrdenarNumeros Orden=new OrdenarNumeros(numeros);

        Orden.MayorAMenor();
        //Orden.MenorAMayor();
    }
}
