package studyTool5;
import javax.swing.JFrame;
public class PruebaArcoiris {
    public static void main(String[] args) {
        Arcoiris panel=new Arcoiris();
        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400,250);
        app.setVisible(true);
    }
}
