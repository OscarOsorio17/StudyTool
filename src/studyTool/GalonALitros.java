package studyTool;
import java.util.Scanner;
public class GalonALitros {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float litros, galones;
        System.out.println("Ingrese los galones");
        galones = Scan.nextFloat();
        litros= galones*3.785f;
        System.out.println("los litros son: "+litros);

    }
}
