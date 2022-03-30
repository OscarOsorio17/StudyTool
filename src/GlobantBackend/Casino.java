package GlobantBackend;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class Casino extends JPanel{

    private int numero1;
    private int numero2;
    private int color1;
    private int color2;
    private int color3;


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Random aleatorio=new Random();

        for (int i=1; i<=5; i++){
            color1=1+aleatorio.nextInt(200);
            color2=1+aleatorio.nextInt(155);
            color3=1+aleatorio.nextInt(50);
            numero1=aleatorio.nextInt(100);
            numero2=aleatorio.nextInt(150);

            Color newColor1=new Color(color1,color2, color3);

            g.setColor(newColor1);
            g.fillOval(numero1, numero2, numero1,numero2);

            color1=1+aleatorio.nextInt(200);
            color2=1+aleatorio.nextInt(155);
            color3=1+aleatorio.nextInt(50);
            numero1=aleatorio.nextInt(100);
            numero2=aleatorio.nextInt(150);

            Color newColor2=new Color(color1,color2, color3);
            g.setColor(newColor2);
            g.fillRect(numero2, numero1, numero2,numero1);
        }
    }
}
