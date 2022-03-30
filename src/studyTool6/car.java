package studyTool6;
class vehiculo{
    protected String marca="Mazda";
    public void audios(){
        System.out.println("¡¡¡Piiiii, piiii!!!");
    }
}
public class car extends vehiculo{
    private String modelName="Muztang";

    public static void main(String[] args) {
        car myCar=new car();

        myCar.audios();
        System.out.println(myCar.marca+" "+myCar.modelName);
    }
}
