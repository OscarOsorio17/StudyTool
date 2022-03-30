package studyTool6;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class RetoFiguras extends JLabel{

    private int numero1;
    private int numero2;
    private int color1;
    public int circulo=0;
    public int rectangulo=0;

    Label label=new Label();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Random aleatorio=new Random();
        for (int i=1; i<=10; i++){
            int numerosAleatorios=aleatorio.nextInt(2);
            if(numerosAleatorios==1){
                circulo++;
                color1=1+aleatorio.nextInt(12323453);
                numero1 = aleatorio.nextInt(200);
                numero2 = aleatorio.nextInt(150);

                Color newColor1=new Color(color1);

                g.setColor(newColor1);
                g.fillOval(numero1, numero2, numero1,numero2);
            }else if(numerosAleatorios==0){
                rectangulo++;
                color1 = 1 + aleatorio.nextInt(23459757);
                numero1 = aleatorio.nextInt(100);
                numero2 = aleatorio.nextInt(150);

                Color newColor2 = new Color(color1);
                g.setColor(newColor2);
                g.fillRect(numero2, numero1, numero2, numero1);

            }
            label.setBounds(0, 0, 250, 10);
            label.setText("Circulos:"+circulo/2+" Rectangulos:"+rectangulo/2);
        }
    }

}
