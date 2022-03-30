package studyTool;
import javax.swing.JFrame;
public class PruebaGrafica {
    public static void main(String[] args) {
        Grafica Panel=new Grafica();

        JFrame Aplicacion=new JFrame();

        Aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Aplicacion.add(Panel);
        Aplicacion.setSize(240,260);
        Aplicacion.setVisible(true);
    }
}
