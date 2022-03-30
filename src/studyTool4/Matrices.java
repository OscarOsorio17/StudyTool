package studyTool4;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        Scanner Scan=new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        int matriz[]={numero=Scan.nextInt()};

        for (int i=0;i<matriz[0];i++){
            for (int j=0;j<matriz[0];j++){

                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
