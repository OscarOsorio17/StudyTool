package studyTool8.Peliculas2;

import javax.swing.JOptionPane;

public class Accion extends Peliculas{

    public void Datos(String Nombre, Integer FechaLanzamiento) {
        JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+"\nFecha de Lanzamiento: "+FechaLanzamiento);
    }

    public void Genero(String Genero1, Integer EdadPermitida) {
        JOptionPane.showMessageDialog(null,"Genero: "+Genero1+"\nPublico: +"+EdadPermitida);
    }
}
