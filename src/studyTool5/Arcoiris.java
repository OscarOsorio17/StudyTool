package studyTool5;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Arcoiris extends JPanel{

    final Color violeta=new Color(128,0,128);
    final Color indigo=new Color(75,0,130);

    private Color colores[]={
            Color.white, Color.white, violeta, indigo, Color.blue, Color.green, Color.yellow, Color.orange, Color.red
    };

    public Arcoiris(){
        setBackground(Color.white);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int radio=20;

        int centroX=getWidth()/2;
        int centroY=getHeight()-10;

        for (int i=colores.length; i>0; i--){
            g.setColor(colores[i-1]);

            g.fillArc(centroX-i*radio,centroY-i*radio,i*radio*2,i*radio*2,40,100);
        }
    }
}
