package studyTool8_1;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

@SuppressWarnings({ "unused", "serial" })
public class MarcoLista extends JFrame 
{
@SuppressWarnings("rawtypes")
private JList listaJListColores;
private final String nombreColores [ ] = {"Negro","Azul","Cyan",
		"Gris oscuro","Gris","Verde","Gris claro","Magenta","Naraja","Rosa","Rojo","Blanco","amarillo"};
private final Color colores1[] = { Color.black,Color.BLUE,Color.CYAN,
		Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,
		Color.YELLOW};
private final Color colores[] = {Color.BLACK,Color.BLUE,Color.CYAN,
		Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,
		Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,
		Color.YELLOW};

public  MarcoLista()
{
	super( "prueba de JList");
	setLayout(new FlowLayout());
	
	listaJListColores = new JList( nombreColores );
	listaJListColores.setVisibleRowCount(5);
	listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	add(new JScrollPane (listaJListColores));
	listaJListColores.addListSelectionListener(
	new ListSelectionListener()
	{
		public void valueChanged(ListSelectionEvent evento)
		{
			getContentPane().setBackground(
					colores [listaJListColores.getSelectedIndex()]);
		}
	}
  );
}
}





