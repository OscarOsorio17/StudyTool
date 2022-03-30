package studyTool6;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class DemoLabel {
    public static void main(String[] args) {
        JLabel etiquetaNorte = new JLabel ( "Norte" );

        ImageIcon etiquetaIcono = new ImageIcon("C:\\Users\\OSCAR\\Documents\\StudyTool\\src\\studyTool6\\GUItip.gif");

        JLabel etiquetaCentro = new JLabel (etiquetaIcono);

        JLabel etiquetaSur = new JLabel ( etiquetaIcono );

        etiquetaSur.setText("Sur");

        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(etiquetaNorte, BorderLayout.NORTH);
        aplicacion.add(etiquetaCentro, BorderLayout.CENTER);
        aplicacion.add(etiquetaSur, BorderLayout.SOUTH);

        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);

    }

}