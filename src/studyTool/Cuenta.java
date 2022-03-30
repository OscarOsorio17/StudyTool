package studyTool;

public class Cuenta {
    private double Saldo;

    //Metodo Constructor
    public Cuenta(double Saldo){
        if(Saldo>=0.0){
            this.Saldo=Saldo;
        }
    }

    //Metodo para abonar
    public void abonar(double abono){
        this.Saldo=this.Saldo+abono;//Aumentar el saldo segun el abono
    }

    //Retorna el saldo total
    public double obtenerSaldo(){
        return this.Saldo;
    }
}
