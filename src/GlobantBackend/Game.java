package GlobantBackend;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {

    int x1 = 1000;
    int x2 = 10;
    int y = 0;

    private void moveBall() {
        x1 =x1+1;
        x2 =x2-1;
        y =y+1;
        /*if(x<=500){
            x=x+1000;
            y=y-800;
        }*/
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Color newColor=new Color(252341);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(newColor);
        g2d.fillOval(x1, 100,50, 50);
        g2d.fillOval(x2, 100,50, 50);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Mini Tennis");
        Game game = new Game();
        frame.add(game);
        frame.setSize(1860,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}
