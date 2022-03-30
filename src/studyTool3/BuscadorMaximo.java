package studyTool3;
import java.util.Scanner;
public class BuscadorMaximo {

    public void determinarMaximo(){
        Scanner Scan=new Scanner(System.in);

        System.out.println("Ingrese tres valores de punto flotante: ");
        double num1=Scan.nextDouble();
        double num2=Scan.nextDouble();
        double num3=Scan.nextDouble();

        double resultado=maximo(num1,num2,num3);

        System.out.println("El maximo es: "+resultado);
    }

    public double maximo(double x, double y, double z){
        double valorMaximo=x;

        if (y>valorMaximo && y>z){
            valorMaximo=y;
        }else if(z>valorMaximo){
            valorMaximo=z;
        }
        return valorMaximo;
    }
}
