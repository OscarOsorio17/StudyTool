package studyTool7;

import javax.swing.*;

public class AdministradorDB {
    public void Sueldo(double Pago) {
        JOptionPane.showMessageDialog(null,"El pago es: "+Pago);
    }

    public void Datos(String Nombre,String Apellido,String Direccion) {
        JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+" Apellido: "+Apellido+" Direccion: "+Direccion);
    }

    public void Labores(String Labor) {
        JOptionPane.showMessageDialog(null,"Soy programador y me dedico a: "+Labor);
    }
}
