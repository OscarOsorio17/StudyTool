package GlobantBackend;
import java.util.LinkedList;

public class OrdenarNumeros{
    private String numero;

    int numeros1;
    int numeros2;

    public OrdenarNumeros(String numero){
        this.numero=numero;
    }


    public void MayorAMenor(){
        char[] digitos=this.numero.toCharArray();

        for (int i=0; i< digitos.length;i++){
            switch (digitos[i]){
                case '0':
                    numeros1=0;
                    break;
                case '1':
                    numeros1=1;
                    break;
                case '2':
                    numeros1=2;
                    break;
                case '3':
                    numeros1=3;
                    break;
                case '4':
                    numeros1=4;
                    break;
                case '5':
                    numeros1=5;
                    break;
                case '6':
                    numeros1=6;
                    break;
                case '7':
                    numeros1=7;
                    break;
                case '8':
                    numeros1=8;
                    break;
                case '9':
                    numeros1=9;
                    break;
            }

            for(int j=0; j<digitos.length;i++){
                switch (digitos[j]){
                    case '0':
                        numeros2=0;
                        break;
                    case '1':
                        numeros2=1;
                        break;
                    case '2':
                        numeros2=2;
                        break;
                    case '3':
                        numeros2=3;
                        break;
                    case '4':
                        numeros2=4;
                        break;
                    case '5':
                        numeros2=5;
                        break;
                    case '6':
                        numeros2=6;
                        break;
                    case '7':
                        numeros2=7;
                        break;
                    case '8':
                        numeros2=8;
                        break;
                    case '9':
                        numeros2=9;
                        break;
                }

                 if (numeros1<numeros2){

                 }
            }
            System.out.println(digitos[i]);
        }
    }

    /*public void MenorAMayor(){
        while(this.numero>0){
            stack2.push(this.numero);
            this.numero=this.numero/10;
        }
        while ((!stack2.isEmpty())){
            System.out.print(stack2.pop());
        }
        System.out.println();
    }*/
}
