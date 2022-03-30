package studyTool7;
import javax.swing.JOptionPane;
public class Programadores extends Informaticos{
    public void Sueldo(int Horas, double PagoH) {
       JOptionPane.showMessageDialog(null,"El pago es: "+(Horas*PagoH));
    }

    public void Datos(String Nombre,String Apellido) {
        JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+" Apellido: "+Apellido);
    }

    public void Labores(String Labor) {
        JOptionPane.showMessageDialog(null,"Soy programador y me dedico a: "+Labor);
    }
}
