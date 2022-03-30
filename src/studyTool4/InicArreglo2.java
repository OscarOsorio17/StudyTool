package studyTool4;

public class InicArreglo2 {
    public static void main(String[] args) {
        int arreglo[]={21,23,46,27,86,56,13,87,30,98};
        int total=0;

        for (int i=0;i<arreglo.length;i++){
            total+=arreglo[i];
        }
        System.out.println("El total de los elementos en el array es: "+total);
    }
}
