package studyTool4;

public class InicArreglo1 {
    public static void main(String[] args) {
        final int LongArreglo=10;
        int arreglo[]=new int[LongArreglo];

        for (int i=0; i<arreglo.length; i++){
            arreglo[i]=2+2*i;
        }

        System.out.printf("%s%8s\n","Indice", "Valor" );

        for (int i=0; i<arreglo.length;i++){
            System.out.printf("%5d%8d\n",i,arreglo[i]);
        }
    }
}
