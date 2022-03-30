package studyTool3;
import javax.swing.JFrame;

public class TiroBlanco {
    public static void main(String[] args) {
        TiroAlBlanco Dibujo=new TiroAlBlanco();
        JFrame app=new JFrame("Tiro Al Blanco");

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(Dibujo);
        app.setSize(240,260);
        app.setVisible(true);
    }
}
