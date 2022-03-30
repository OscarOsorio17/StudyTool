package studyTool3;
import javax.swing.JFrame;
public class PruebaGraficasRandom {
    public static void main(String[] args) {
        GraficasRandom Dibujo=new GraficasRandom();
        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(Dibujo);
        app.setSize(240,260);
        app.setVisible(true);
    }
}
