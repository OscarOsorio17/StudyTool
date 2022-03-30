package studyTool7;

import javax.swing.JOptionPane;

public class ProgramadoresOverride extends InformaticosOverride{

    public void sueldo(double pago) {
        JOptionPane.showMessageDialog(null,"El pago de un programador es: $"+pago );
    }

    public void datos(String nom) {
        JOptionPane.showMessageDialog(null,"El nombre del programador es: " +nom);
    }

    public void labores(String lab) {
        JOptionPane.showMessageDialog(null,"Las labores del programador es: "+lab);
    }


}
