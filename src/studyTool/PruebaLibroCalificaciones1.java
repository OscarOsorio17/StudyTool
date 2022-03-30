package studyTool;
import java.util.Scanner;
public class PruebaLibroCalificaciones1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        LibroDeCalificaciones1 Libro1=new LibroDeCalificaciones1();

        System.out.println("Ingrese el nombre del curso");
        String nombreCurso=Scan.nextLine();
        System.out.println("");

        Libro1.mostrarMensaje(nombreCurso);
    }
}
