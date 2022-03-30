package studyTool5;

public class ArrayBi {
    public static void main(String[] args) {
        int arreglo1[][]={{1,2,3},{4,5,6}};
        int arreglo2[][]={{1,2},{3},{4,5,6}};

        System.out.println("Los vales en la fila1 por filas son: ");
        imprimirArreglo(arreglo1);

        System.out.println("\nLos vales en la fila2 por filas son: ");
        imprimirArreglo(arreglo2);
    }
    public static void imprimirArreglo(int arreglo[][]){
        for (int i=0;i<arreglo.length;i++){ //i=filas
            for(int j=0;j<arreglo[i].length;j++){ //j=columnas
                System.out.print(arreglo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
