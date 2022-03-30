package studyTool;
import java.util.*;
public class studyPage {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String termvar, termdef;
        System.out.println("Ingresar un termino");
        termvar =Scan.nextLine();
        System.out.println("Ingresar una definicion");
        termdef=Scan.nextLine();

        System.out.println(termvar+" : "+termdef);
    }
}
