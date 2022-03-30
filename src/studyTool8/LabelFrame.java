package studyTool8;

import java.awt.FlowLayout;// espesifica el orden de los componentes
import javax.swing.JFrame;//proporciona las caracteristicas basicas de una ventana
import javax.swing.JLabel;//muestra texto he imagenes
import javax.swing.SwingConstants;//constantes comunes
import javax.swing.Icon;//interfaz para manipular imagenes
import javax.swing.ImageIcon;//carga las imagenes

public class LabelFrame extends JFrame  {

    private JLabel etiqueta1;//solo texto
    private JLabel etiqueta2;//texto con icono
    private JLabel etiqueta3;//texto adicional e icono

    // el constructor LabelFrame agrega objetos JLabel a JFrame
    public LabelFrame() {

        super ("Prueba de Jlabel");
        setLayout(new FlowLayout());//establece el esquema del marco


        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1);

//constructor del jlabel con argumentos de cadena

        Icon insecto = new ImageIcon(getClass().getResource("Mosca1.jpeg"));
        etiqueta2= new JLabel("Etiqueta con texto e icono", insecto , SwingConstants.LEFT);

        etiqueta2.setToolTipText("Esta es etiqueta 2");
        add(etiqueta2);//agrega etiqueta 2

        etiqueta3= new JLabel();//constructor sin argumentos
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto);//agrega icono
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta 3");
        add(etiqueta3);
    }
}
