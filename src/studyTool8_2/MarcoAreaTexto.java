package studyTool8_2;
import javax.swing.*;
import java.awt.event.*;

public class MarcoAreaTexto extends JFrame{
    private JTextArea areaTexto1;
    private JTextArea areaTexto2;
    private JButton botonCopiar;

    public MarcoAreaTexto(){
        super("Demostracion de JTextArea");
        Box cuadro=Box.createHorizontalBox();
        String Demo="Esta es una cadena de\ndemostracion para \nilustrar como copiar\ntexto de un area de texto a otra \nusando un evento externo";

        areaTexto1=new JTextArea(Demo,10,15);
        cuadro.add(areaTexto1);

        botonCopiar=new JButton("Copiar>>>");
        cuadro.add(botonCopiar);
        botonCopiar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    areaTexto2.setText(areaTexto1.getSelectedText());
                }
            }
        );
        areaTexto2=new JTextArea(10,15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2));

        add(cuadro);
    }
}
