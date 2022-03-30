package studyTool2;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.color.*;

public class Figuras2 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int cont1=130;
        int cont2=120;
        int cont3=10;

        for (int i=0; i<15;i++){
            g.drawOval(cont1,cont2,cont3,cont3);
            cont1-=5;
            cont2-=5;
            cont3+=10;
        }
    }
}
