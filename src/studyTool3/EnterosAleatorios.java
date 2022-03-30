package studyTool3;
import java.util.Random;

public class EnterosAleatorios {
    public static void main(String[] args) {
        Random ramdons=new Random();
        int cara;

        for (int i=1; i<=20; i++){
            cara=1+ramdons.nextInt(6);

            System.out.printf("%d",cara);

            if (i%5==0){
                System.out.println();
            }
        }
    }
}
