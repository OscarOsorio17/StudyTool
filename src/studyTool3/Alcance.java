package studyTool3;

public class Alcance {
    private int x=1;

    public void iniciar(){
        int x=5;

        System.out.println("La x local en el metodo Iniciar es: "+x);

        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();

        System.out.println("La x local en el metodo Iniciar es: "+x);
    }

    public void usarVariableLocal(){
        int x=25;

        System.out.println("La x local al entrar en usarVariableLocal es: "+x);
        x++;
        System.out.println("La x local antes de salir en usarVariableLocal es: "+x);
    }
    public void usarCampo(){
        System.out.println("La x local al entrar en usarCampo es: "+x);
        x*=10;
        System.out.println("La x local antes de salir en usarCampo es: "+x);
    }
}