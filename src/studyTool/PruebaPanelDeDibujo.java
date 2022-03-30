package studyTool;
import javax.swing.JFrame;

public class PruebaPanelDeDibujo {
    public static void main(String[] args) {
        PanelDeDibujo Panel=new PanelDeDibujo();

        JFrame Aplicacion=new JFrame();

        Aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Aplicacion.add(Panel);
        Aplicacion.setSize(230,250);
        Aplicacion.setVisible(true);
    }
}
