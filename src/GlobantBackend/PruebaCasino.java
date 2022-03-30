package GlobantBackend;
import javax.swing.JFrame;

public class PruebaCasino {
    public static void main(String[] args) {
        Casino Juego=new Casino();
        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(Juego);
        app.setSize(250,250);
        app.setVisible(true);

    }
}
