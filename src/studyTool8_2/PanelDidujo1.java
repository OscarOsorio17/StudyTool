package studyTool8_2;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

 @SuppressWarnings("serial")
class PanelDidujo1  extends JPanel{
	 private int cuentaPuntos=0;
	 private Point puntos[]= new Point [10000];
	 
	 public PanelDidujo1() {
		 addMouseMotionListener(
				 new MouseMotionAdapter()
				 {
					 public void mouseDragged(MouseEvent evento)
					 {
						if (cuentaPuntos <puntos.length)
						{
							puntos[cuentaPuntos]= evento.getPoint();
							cuentaPuntos++;
							repaint();
						}
					 }
				 }
		   );
	 }
 
 public void paintComponent(Graphics g) {
	 super.paintComponent(g);
	 
	 for(int i=0; i< cuentaPuntos; i++)
		 g.fillOval(puntos[i].x, puntos[i].y, 4, 4);
	 
 }
 }
