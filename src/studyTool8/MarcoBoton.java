package studyTool8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MarcoBoton extends JFrame {

    private JButton botonJButtonSimple;
    private JButton botonJButtonElegante;

    public MarcoBoton() {
        super("Prueba de botones");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton simple");
        add(botonJButtonSimple);

        Icon insecto1 =new ImageIcon(getClass().getResource("insecto1.jpeg"));
        Icon insecto2 =new ImageIcon(getClass().getResource("insecto4.jpeg"));
        botonJButtonElegante = new JButton("Boton elegante", insecto1);
        botonJButtonElegante.setRolloverIcon(insecto2);
        add(botonJButtonElegante);

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    private class ManejadorBoton implements ActionListener{
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", evento.getActionCommand()));
        }
    }
}
