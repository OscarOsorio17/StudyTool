package studyTool8_1;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class MarcoBotonOpcion extends JFrame{
    private JTextField campoTexto;
    private Font tipoLetraSimple;
    private Font tipoLetraNegrita;
    private Font tipoLetraCursiva;
    private Font tipoLetraNegritaCurisva;
    private JRadioButton simpleRadBoton;
    private JRadioButton negritaRadBoton;
    private JRadioButton cursivaRadBoton;
    private JRadioButton negritaCursivaBoton;
    private ButtonGroup grupoOpciones;

    public MarcoBotonOpcion(){
        super("Prueba Radio Boton");
        setLayout(new FlowLayout());

        campoTexto=new JTextField("Observe el cambio en el estilo del tipo de letra",28);
        add(campoTexto);

        simpleRadBoton= new JRadioButton("Simple",true);
        negritaRadBoton= new JRadioButton("Negrita",true);
        cursivaRadBoton= new JRadioButton("Cursiva",true);
        negritaCursivaBoton=new JRadioButton("Negrita Cursiva",true);
        add(simpleRadBoton);
        add(negritaRadBoton);
        add(cursivaRadBoton);
        add(negritaCursivaBoton);

        grupoOpciones=new ButtonGroup();
        grupoOpciones.add(simpleRadBoton);
        grupoOpciones.add(negritaRadBoton);
        grupoOpciones.add(cursivaRadBoton);
        grupoOpciones.add(negritaCursivaBoton);

        tipoLetraSimple=new Font("Serif",Font.PLAIN, 14);
        tipoLetraNegrita=new Font("Serif",Font.BOLD,14);
        tipoLetraCursiva=new Font("Serif",Font.ITALIC,14);
        tipoLetraNegritaCurisva=new Font("Serif",Font.BOLD+Font.ITALIC,14);

        campoTexto.setFont(tipoLetraSimple);

        simpleRadBoton.addItemListener(new ManejadorBotonOpcion(tipoLetraSimple));
        negritaRadBoton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaRadBoton.addItemListener(new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaBoton.addItemListener(new ManejadorBotonOpcion(tipoLetraNegritaCurisva));
    }
    private class ManejadorBotonOpcion implements ItemListener{
        private Font tipoLetra;

        public ManejadorBotonOpcion(Font f){
            tipoLetra=f;
        }
        public void itemStateChanged(ItemEvent evento){
            campoTexto.setFont(tipoLetra);
        }
    }
}
