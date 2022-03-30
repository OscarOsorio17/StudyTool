package studyTool2;

public class Suma {
    public static void main(String[] args) {
        int total=0;

        for (int i=2; i<=10; i+=2){
            total+=i;

            System.out.printf("%d ",total);
        }

        System.out.println("\n");
        int contador=2;
        total=2;
        do {
            System.out.printf("%d ",total);
            contador+=2;
            total+=contador;
        }while (contador<=10);
    }
}
