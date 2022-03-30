package studyTool7;
import javax.swing.*;

public class PolimorfismoTotal {
    public static void main(String[] args) {
        Programadores Persona1=new Programadores();
        Analistas Analista1=new Analistas();
        AdministradorDB Adminitrador1=new AdministradorDB();

        JOptionPane.showMessageDialog(null,"Aqui comienza el polimorfismo Overload");

        Persona1.Datos("Andrea","Gonzalez");
        Persona1.Sueldo(5,100);
        Persona1.Labores("Programador en Java");

        Analista1.Datos("Isabela","Motealegre");
        Analista1.Sueldo(4,200,100);
        Analista1.Labores("Analizar Datos",9);

        Adminitrador1.Datos("Juanjo","MG","Iwoka");
        Adminitrador1.Sueldo(500);
        Adminitrador1.Labores("Administrar BD");

        ProgramadoresOverride p2 = new ProgramadoresOverride();
        AnalistaOverride an2 = new AnalistaOverride();
        AdministradorBDOverride adm2 = new AdministradorBDOverride();

        JOptionPane.showMessageDialog(null,"Aqui comienza el polimorfismo Override" );

        p2.datos("Yurani");
        p2.sueldo(800);
        p2.labores( "programas en oo");
        an2.datos(" Valentina");
        an2.sueldo(400);
        adm2.labores(" Analizar Datos");
        adm2.datos(" Andres");
        adm2.sueldo(300);
        adm2.labores(" Administrar BD");
    }
}
