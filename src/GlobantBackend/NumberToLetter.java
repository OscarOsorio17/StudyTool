package GlobantBackend;
import java.text.DecimalFormat;
import java.util.Objects;

public class NumberToLetter {
    private int numero;
    private int longitud;

    DecimalFormat trunc=new DecimalFormat();

    public NumberToLetter(int numero,int longitud){
        this.numero=numero;
        this.longitud=longitud;
    }

    public String truncarNumero1(){
        String num1=trunc.format((this.numero/1)%10);

        return num1;
    }
    public String truncarNumero2(){
        String num2=trunc.format((this.numero/10)%10);

        return num2;
    }
    public String truncarNumero3(){
        String num3=trunc.format((this.numero/100)%10);

        return num3;
    }
    public String truncarNumero4(){
        String num4=trunc.format((this.numero/1000)%10);

        return num4;
    }
    public String truncarNumero5(){
        String num5=trunc.format((this.numero/10000)%10);

        return num5;
    }
    public String truncarNumero6(){
        String num6=trunc.format((this.numero/100000)%10);

        return num6;
    }
    public String truncarNumero7(){
        String num7=trunc.format((this.numero/1000000)%10);

        return num7;
    }
    public String truncarNumero8(){
        String num8=trunc.format((this.numero/10000000)%10);

        return num8;
    }
    public String truncarNumero9(){
        String num9=trunc.format((this.numero/100000000)%10);

        return num9;
    }


    public void calcularPalabra1Numero(){
        if(Objects.equals(truncarNumero2(), "1")){
            switch (truncarNumero1()) {
                case "0":
                    System.out.println("Ten");
                    break;
                case "1":
                    System.out.println("Eleven");
                    break;
                case "2":
                    System.out.println("Twelve");
                    break;
                case "3":
                    System.out.println("Thirteen");
                    break;
                case "4":
                    System.out.println("Fourteen");
                    break;
                case "5":
                    System.out.println("Fifteen");
                    break;
                case "6":
                    System.out.println("Sixteen");
                    break;
                case "7":
                    System.out.println("Seventeen");
                    break;
                case "8":
                    System.out.println("Eighteen");
                    break;
                case "9":
                    System.out.println("Nineteen");
                    break;
                default:
                    break;
            }
        } else if(!Objects.equals(truncarNumero1(), "0")){
            switch (truncarNumero1()) {
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
        }
    }

    public void calcularPalabra2Numero(){
        switch(truncarNumero2()){
            case "2":
                System.out.print("Twenty ");
                break;
            case "3":
                System.out.print("Thirty ");
                break;
            case "4":
                System.out.print("Fourty ");
                break;
            case "5":
                System.out.print("Fifty ");
                break;
            case "6":
                System.out.print("Sixty ");
                break;
            case "7":
                System.out.print("Seventy ");
                break;
            case "8":
                System.out.print("Eighthy ");
                break;
            case "9":
                System.out.print("Ninety ");
                break;
            default:
                break;
        }
    }

    public void calcularPalabra3Numero(){
        switch(truncarNumero3()){
            case "1":
                System.out.print("One Hundred ");
                break;
            case "2":
                System.out.print("Two Hundred ");
                break;
            case "3":
                System.out.print("Three Hundred ");
                break;
            case "4":
                System.out.print("Four Hundred ");
                break;
            case "5":
                System.out.print("Five Hundred ");
                break;
            case "6":
                System.out.print("Six Hundred ");
                break;
            case "7":
                System.out.print("Seven Hundred ");
                break;
            case "8":
                System.out.print("Eight Hundred ");
                break;
            case "9":
                System.out.print("Nine Hundred ");
                break;
            default:
                break;
        }
    }

    public void calcularPalabra4Numero(){
        switch(truncarNumero4()){
            case "1":
                System.out.print("One Thousand ");
                break;
            case "2":
                System.out.print("Two Thousand ");
                break;
            case "3":
                System.out.print("Three Thousand ");
                break;
            case "4":
                System.out.print("Four Thousand ");
                break;
            case "5":
                System.out.print("Five Thousand ");
                break;
            case "6":
                System.out.print("Six Thousand ");
                break;
            case "7":
                System.out.print("Seven Thousand ");
                break;
            case "8":
                System.out.print("Eight Thousand ");
                break;
            case "9":
                System.out.print("Nine Thousand ");
                break;
            default:
                break;
        }
    }

    public void calcularPalabra5Numero(){
        if (!Objects.equals(truncarNumero4(), "0")){
            switch(truncarNumero5()){
                case "1":
                    System.out.print("Ten ");
                    break;
                case "2":
                    System.out.print("Twenty ");
                    break;
                case "3":
                    System.out.print("Thirty ");
                    break;
                case "4":
                    System.out.print("Fourty ");
                    break;
                case "5":
                    System.out.print("Fifty ");
                    break;
                case "6":
                    System.out.print("Sixty ");
                    break;
                case "7":
                    System.out.print("Seventy ");
                    break;
                case "8":
                    System.out.print("Eighthy ");
                    break;
                case "9":
                    System.out.print("Ninety ");
                    break;
                default:
                    break;
            }
            if (Objects.equals(truncarNumero5(), "1")){
                switch (truncarNumero4()) {
                    case "1":
                        System.out.print("Eleven Thousand ");
                        break;
                    case "2":
                        System.out.print("Twelve Thousand ");
                        break;
                    case "3":
                        System.out.print("Thirteen Thousand ");
                        break;
                    case "4":
                        System.out.print("Fourteen Thousand ");
                        break;
                    case "5":
                        System.out.print("Fifteen Thousand ");
                        break;
                    case "6":
                        System.out.print("Sixteen Thousand ");
                        break;
                    case "7":
                        System.out.print("Seventeen Thousand ");
                        break;
                    case "8":
                        System.out.print("Eighteen Thousand ");
                        break;
                    case "9":
                        System.out.print("Nineteen Thousand ");
                        break;
                    default:
                        break;
                }
            }

        }else {
            switch(truncarNumero5()){
                case "1":
                    System.out.print("Ten Thousand ");
                    break;
                case "2":
                    System.out.print("Twenty Thousand ");
                    break;
                case "3":
                    System.out.print("Thirty Thousand ");
                    break;
                case "4":
                    System.out.print("Fourty Thousand ");
                    break;
                case "5":
                    System.out.print("Fifty Thousand ");
                    break;
                case "6":
                    System.out.print("Sixty Thousand ");
                    break;
                case "7":
                    System.out.print("Seventy Thousand ");
                    break;
                case "8":
                    System.out.print("Eighthy Thousand ");
                    break;
                case "9":
                    System.out.print("Ninety Thousand ");
                    break;
                default:
                    break;
            }
        }

    }

    public void calcularPalabra6Numero(){
        if (Objects.equals(truncarNumero5(), "0")) {
            switch(truncarNumero6()){
                case "1":
                    System.out.print("One Hundred Thousand ");
                    break;
                case "2":
                    System.out.print("Two Hundred Thousand ");
                    break;
                case "3":
                    System.out.print("Three Hundred Thousand ");
                    break;
                case "4":
                    System.out.print("Four Hundred Thousand ");
                    break;
                case "5":
                    System.out.print("Five Hundred Thousand ");
                    break;
                case "6":
                    System.out.print("Six Hundred Thousand ");
                    break;
                case "7":
                    System.out.print("Seven Hundred Thousand ");
                    break;
                case "8":
                    System.out.print("Eight Hundred Thousand ");
                    break;
                case "9":
                    System.out.print("Nine Hundred Thousand ");
                    break;
                default:
                    break;
            }
        }else{
            switch(truncarNumero6()){
                case "1":
                    System.out.print("One Hundred ");
                    break;
                case "2":
                    System.out.print("Two Hundred ");
                    break;
                case "3":
                    System.out.print("Three Hundred ");
                    break;
                case "4":
                    System.out.print("Four Hundred ");
                    break;
                case "5":
                    System.out.print("Five Hundred ");
                    break;
                case "6":
                    System.out.print("Six Hundred ");
                    break;
                case "7":
                    System.out.print("Seven Hundred ");
                    break;
                case "8":
                    System.out.print("Eight Hundred ");
                    break;
                case "9":
                    System.out.print("Nine Hundred ");
                    break;
                default:
                    break;
            }
        }

    }

    public void calcularPalabra7Numero(){
        if(Objects.equals(truncarNumero8(), "1")){
            switch (truncarNumero7()) {
                case "1":
                    System.out.print("Eleven Million ");
                    break;
                case "2":
                    System.out.print("Twelve Million ");
                    break;
                case "3":
                    System.out.print("Thirteen Million ");
                    break;
                case "4":
                    System.out.print("Fourteen Million ");
                    break;
                case "5":
                    System.out.print("Fifteen Million ");
                    break;
                case "6":
                    System.out.print("Sixteen Million ");
                    break;
                case "7":
                    System.out.print("Seventeen Million ");
                    break;
                case "8":
                    System.out.print("Eighteen Million ");
                    break;
                case "9":
                    System.out.print("Nineteen Million ");
                    break;
                default:
                    break;
            }
        } else if(!Objects.equals(truncarNumero7(), "0")){
            switch (truncarNumero7()) {
                case "1":
                    System.out.print("One Million ");
                    break;
                case "2":
                    System.out.print("Two Million ");
                    break;
                case "3":
                    System.out.print("Three Million ");
                    break;
                case "4":
                    System.out.print("Four Million ");
                    break;
                case "5":
                    System.out.print("Five Million ");
                    break;
                case "6":
                    System.out.print("Six Million ");
                    break;
                case "7":
                    System.out.print("Seven Million ");
                    break;
                case "8":
                    System.out.print("Eight Million ");
                    break;
                case "9":
                    System.out.print("Nine Million ");
                    break;
                default:
                    break;
            }
        }
    }

    public void calcularPalabra8Numero(){
        if (Objects.equals(truncarNumero7(), "0")){
            switch(truncarNumero8()){
                case "1":
                    System.out.print("Ten Million ");
                    break;
                case "2":
                    System.out.print("Twenty Million ");
                    break;
                case "3":
                    System.out.print("Thirty Million ");
                    break;
                case "4":
                    System.out.print("Fourty Million ");
                    break;
                case "5":
                    System.out.print("Fifty Million ");
                    break;
                case "6":
                    System.out.print("Sixty Million ");
                    break;
                case "7":
                    System.out.print("Seventy Million ");
                    break;
                case "8":
                    System.out.print("Eighthy Million ");
                    break;
                case "9":
                    System.out.print("Ninety Million ");
                    break;
                default:
                    break;
            }
            if (Objects.equals(truncarNumero8(), "1")){
                switch (truncarNumero7()) {
                    case "1":
                        System.out.print("Eleven Million ");
                        break;
                    case "2":
                        System.out.print("Twelve Million ");
                        break;
                    case "3":
                        System.out.print("Thirteen Million ");
                        break;
                    case "4":
                        System.out.print("Fourteen Million ");
                        break;
                    case "5":
                        System.out.print("Fifteen Million ");
                        break;
                    case "6":
                        System.out.print("Sixteen Million ");
                        break;
                    case "7":
                        System.out.print("Seventeen Million ");
                        break;
                    case "8":
                        System.out.print("Eighteen Million ");
                        break;
                    case "9":
                        System.out.print("Nineteen Million ");
                        break;
                    default:
                        break;
                }
            }

        }else if(truncarNumero7()!="0"){
            switch(truncarNumero8()){
                case "2":
                    System.out.print("Twenty ");
                    break;
                case "3":
                    System.out.print("Thirty ");
                    break;
                case "4":
                    System.out.print("Fourty ");
                    break;
                case "5":
                    System.out.print("Fifty ");
                    break;
                case "6":
                    System.out.print("Sixty ");
                    break;
                case "7":
                    System.out.print("Seventy ");
                    break;
                case "8":
                    System.out.print("Eighthy ");
                    break;
                case "9":
                    System.out.print("Ninety ");
                    break;
                default:
                    break;
            }
        }

    }

    public void calcularPalabra9Numero(){
        if (Objects.equals(truncarNumero8(), "0")) {
            switch(truncarNumero9()){
                case "1":
                    System.out.print("One Hundred Million ");
                    break;
                case "2":
                    System.out.print("Two Hundred Million ");
                    break;
                case "3":
                    System.out.print("Three Hundred Million ");
                    break;
                case "4":
                    System.out.print("Four Hundred Million ");
                    break;
                case "5":
                    System.out.print("Five Hundred Million ");
                    break;
                case "6":
                    System.out.print("Six Hundred Million ");
                    break;
                case "7":
                    System.out.print("Seven Hundred Million ");
                    break;
                case "8":
                    System.out.print("Eight Hundred Million ");
                    break;
                case "9":
                    System.out.print("Nine Hundred Million ");
                    break;
                default:
                    break;
            }
        }else{
            switch(truncarNumero9()){
                case "1":
                    System.out.print("One Hundred ");
                    break;
                case "2":
                    System.out.print("Two Hundred ");
                    break;
                case "3":
                    System.out.print("Three Hundred ");
                    break;
                case "4":
                    System.out.print("Four Hundred ");
                    break;
                case "5":
                    System.out.print("Five Hundred ");
                    break;
                case "6":
                    System.out.print("Six Hundred ");
                    break;
                case "7":
                    System.out.print("Seven Hundred ");
                    break;
                case "8":
                    System.out.print("Eight Hundred ");
                    break;
                case "9":
                    System.out.print("Nine Hundred ");
                    break;
                default:
                    break;
            }
        }

    }
}
