package studyTool5;

import javax.swing.JFrame;

public class PruebaEspirales {
    public static void main(String[] args) {

        Espirales panel=new Espirales();
        JFrame app=new JFrame();

        panel.pedirOpcion();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250,250);
        app.setVisible(true);
    }
}
