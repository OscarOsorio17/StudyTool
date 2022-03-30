package studyTool2;
import javax.swing.JFrame;

public class DibujosOvalos {
    public static void main(String[] args) {
        Figuras2 panel=new Figuras2();

        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }
}
