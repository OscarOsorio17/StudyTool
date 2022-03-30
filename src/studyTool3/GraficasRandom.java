package studyTool3;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class GraficasRandom extends JPanel{
    Random aleatorio=new Random();
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i=1; i<=5;i++){
            int random1=1+aleatorio.nextInt(120);
            int random2=1+aleatorio.nextInt(120);
            int randoma=aleatorio.nextInt(5);
            int randomb=aleatorio.nextInt(5);
            switch (randoma){
                case 0:
                    g.setColor(Color.green);
                    break;
                case 1:
                    g.setColor(Color.yellow);
                    break;
                case 2:
                    g.setColor(Color.red);
                    break;
                case 3:
                    g.setColor(Color.blue);
                    break;
                case 4:
                    g.setColor(Color.black);
                    break;
                case 5:
                    g.setColor(Color.orange);
                    break;
            }
            g.fillOval(random1,random2,random1,random2);
                switch (randomb){
                    case 0:
                        g.setColor(Color.green);
                        break;
                    case 1:
                        g.setColor(Color.yellow);
                        break;
                    case 2:
                        g.setColor(Color.red);
                        break;
                    case 3:
                        g.setColor(Color.blue);
                        break;
                    case 4:
                        g.setColor(Color.black);
                        break;
                    case 5:
                        g.setColor(Color.orange);
                        break;
                }
            g.fillRect(random2,random1,random2,random1);
        }
    }
}
