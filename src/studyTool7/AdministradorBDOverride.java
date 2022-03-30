package studyTool7;
import javax.swing.JOptionPane;

public class AdministradorBDOverride extends InformaticosOverride  {


    public void sueldo ( double pago) {// metodo
        JOptionPane.showMessageDialog(null,"el pago de un administradorBD es : " +pago);
    }

    public void datos (String nom) {
        JOptionPane.showMessageDialog(null,"El Nombre de un administradorBD es : " + nom);
    }

    public void labores (String lab) {
        JOptionPane.showMessageDialog(null,"Las labores del  administradorBD son : "+ lab);
    }

}
