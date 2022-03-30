package studyTool5;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Scanner;
public class Espirales extends JPanel {
    public int opcion;
    Scanner Scan=new Scanner(System.in);

    public void pedirOpcion(){
        System.out.println("Ingrese un numero para elegir la figura \n1.Espiral Circular\n2.Espiral Rectangular");
        this.opcion=Scan.nextInt();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(this.opcion<=1) {
            int aumento1 = 110;
            int aumento2 = 110;
            int aumento3 = 180;
            int aumento4 = 10;

            for (int i = 1; i <= 15; i++) {
                if (aumento3 == 180) {
                    g.drawArc(aumento1, aumento1, aumento4, aumento4, aumento3, 180);
                    aumento1 -= 10;
                    aumento2 -= 8;
                    aumento3 = 0;
                    aumento4 += 10;
                } else {
                    g.drawArc(aumento1, aumento2, aumento4, aumento4, aumento3, 180);
                    aumento3 = 180;
                    aumento4 += 10;
                }
            }
        }else{
            int x = getWidth() / 2;
            int y = getHeight() / 2;

            for (int i = 0; i < 5; i++) {

                int t = i * 20;

                g.drawLine(x + t, y + t, x + t, y + 20 + t);
                g.drawLine(x + t, y + 20 + t, x - 20 - t, y + 20 + t);
                g.drawLine(x - 20 - t, y + 20 + t, x - 20 - t, y - 20 - t);
                g.drawLine(x - 20 - t, y - 20 - t, x + 20 + t, y - 20 - t);
                g.drawLine(x + 20 + t, y - 20 - t, x + 20 + t, y + 20 + t);
            }
    }
}
}
