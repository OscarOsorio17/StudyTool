package studyTool7;
import javax.swing.JOptionPane;

public class AnalistaOverride  extends InformaticosOverride   {

    public void sueldo(double pago) {
        JOptionPane.showMessageDialog(null,"El pago de un analista es: $"+pago );
    }

    public void datos(String nom) {
        JOptionPane.showMessageDialog(null,"El nombre del analista es: "+nom );
    }

    public void labores(String lab) {
        JOptionPane.showMessageDialog(null,"Las labores de analista so: "+lab);
    }

}
