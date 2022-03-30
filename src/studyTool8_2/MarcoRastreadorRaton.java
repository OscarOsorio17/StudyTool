package studyTool8_2;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class MarcoRastreadorRaton extends JFrame{
    private JPanel panelRaton;
    private JLabel barraEstado;

    Color newColor=new Color(1234567);
    public MarcoRastreadorRaton(){
        super("Demostracion de los eventos");

        panelRaton=new JPanel();
        panelRaton.setBackground(Color.white);
        add(panelRaton,BorderLayout.CENTER);

        barraEstado=new JLabel("Raton fuera del panel");
        add(barraEstado,BorderLayout.SOUTH);

        ManejadorRaton manejador=new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Se hizo click en [%d, %d]",evento.getX(),evento.getY()));
        }

        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("Se oprimio en [%d, %d]",evento.getX(),evento.getY()));
        }

        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Se solto en [%d, %d]",evento.getX(),evento.getY()));
        }

        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("El raton entro en [%d, %d]",evento.getX(),evento.getY()));
            panelRaton.setBackground(newColor);
        }

        public void mouseExited(MouseEvent evento) {
            barraEstado.setText(String.format("Raton fuera del JPanel"));
            panelRaton.setBackground(Color.white);
        }

        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Se arrastro en [%d, %d]",evento.getX(),evento.getY()));
        }

        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Se movio en [%d, %d]",evento.getX(),evento.getY()));
        }
    }
}
