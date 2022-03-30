package studyTool2;
import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);

        System.out.println("Ingrese un numero para omitir");
        int omitir=Scan.nextInt();
        int i;
        for (i=1; i<=10;i++){
            if (i==omitir){
                continue;
            }
            System.out.printf("%d ",i);
        }
        System.out.println("\nSe uso continue para omitir imprimir "+omitir);
    }
}
