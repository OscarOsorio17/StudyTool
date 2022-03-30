package studyTool4;

import java.util.Arrays;

public class InicArreglo {
    public static void main(String[] args) {
        int arreglo[]={21,23,46,27,86,56,13,87,30,98};

        System.out.printf("%s%8s\n","Indice", "Valor" );
        for (Integer i=0; i<arreglo.length;i++){
            System.out.printf("%5d%8d\n",i,arreglo[i]);
        }
        System.out.println(arreglo.length);
    }
}
