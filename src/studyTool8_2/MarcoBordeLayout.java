package studyTool8_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarcoBordeLayout extends JFrame implements ActionListener{

    private JButton botones[];
    private final String nombres[]={"Ocultar Norte","Ocultar Sur","Ocultar Este","Ocultar Oeste","Ocultar Centro"};
    private BorderLayout esquema;

    public MarcoBordeLayout(){
        super("Demostracion de BorderLayout");

        esquema=new BorderLayout(5,5);
        setLayout(esquema);
        botones=new JButton[nombres.length];

        for (int i=0; i< nombres.length;i++){
            botones[i]=new JButton(nombres[i]);
            botones[i].addActionListener(this);
        }
        add(botones[0],BorderLayout.NORTH);
        add(botones[1],BorderLayout.SOUTH);
        add(botones[2],BorderLayout.EAST);
        add(botones[3],BorderLayout.WEST);
        add(botones[4],BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent evento){
        for (JButton boton:botones) {
            if (evento.getSource()==boton){
                boton.setVisible(false);
            }else{
                boton.setVisible(true);
            }
        }
    }
}
