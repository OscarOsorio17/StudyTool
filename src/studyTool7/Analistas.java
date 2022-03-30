package studyTool7;

import javax.swing.*;

public class Analistas extends Informaticos{

    public void Sueldo(int Horas, double PagoH, double Incentivo) {
        JOptionPane.showMessageDialog(null,"El pago es: "+(Horas*PagoH)+(Incentivo));
    }

    public void Datos(String Nombre, String Apellido) {
        JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+" Apellido: "+Apellido);
    }

    public void Labores(String Labor, int Horas) {
        JOptionPane.showMessageDialog(null,"Soy Administrador y me dedico a: "+Labor+" horas: "+Horas);
    }
}
