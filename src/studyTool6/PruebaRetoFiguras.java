package studyTool6;

import javax.swing.*;

public class PruebaRetoFiguras{
    public static void main(String[] args) {
        RetoFiguras Juego=new RetoFiguras();
        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(Juego.label);
        app.add(Juego);
        app.setSize(250,250);
        app.setVisible(true);
    }
}
