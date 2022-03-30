package studyTool3;
import javax.swing.*;

public class DibujoHappy {
    public static void main(String[] args) {
        DibujarCaraHappy Dibujo=new DibujarCaraHappy();
        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(Dibujo);
        app.setSize(240,260);
        app.setVisible(true);
    }
}
