package studyTool;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDeDibujo extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int altura = getWidth();
        int anchura = getHeight();

        g.drawLine(0,0,altura,anchura);

        g.drawLine(0,altura,anchura,0);
    }
}
