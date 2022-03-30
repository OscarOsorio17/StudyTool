package studyTool8_2;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("unused")
public class Pintor {
	public static void main (String args []) {
		JFrame aplicacion = new JFrame ("un progrma simple de dibujo");
		
		PanelDidujo1 panelDibujo1 =new PanelDidujo1();
		aplicacion.add(panelDibujo1,BorderLayout.CENTER);
		
		aplicacion.add(new JLabel("Arrastre el rator para dibujar"),
				BorderLayout.SOUTH);
		
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.setSize(400,200);
		aplicacion.setVisible(true);
		
	}
	

}
