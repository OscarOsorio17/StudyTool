package studyTool3;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class TiroAlBlanco extends JPanel{
    Random aleatorio=new Random();

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int randoms=1+aleatorio.nextInt(2);

        if (randoms==1){
            g.setColor(Color.yellow);
            g.fillOval(10,10,200,200);

            g.setColor(Color.red);
            g.fillOval(35,35,150,150);

            g.setColor(Color.yellow);
            g.fillOval(60,60,100,100);

            g.setColor(Color.red);
            g.fillOval(85,85,50,50);
        }else{
            g.setColor(Color.red);
            g.fillOval(10,10,200,200);

            g.setColor(Color.white);
            g.fillOval(35,35,150,150);

            g.setColor(Color.red);
            g.fillOval(60,60,100,100);

            g.setColor(Color.white);
            g.fillOval(85,85,50,50);
        }

    }
}
