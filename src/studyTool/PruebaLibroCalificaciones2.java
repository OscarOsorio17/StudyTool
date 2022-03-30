package studyTool;
import java.util.Scanner;
public class PruebaLibroCalificaciones2 {
    public static void main(String[] args) {
        //Se crea los objetos de scanner y libroDeCalificaciones
        Scanner Scan=new Scanner(System.in);
        LibroDeCalificaciones2 Libro2=new LibroDeCalificaciones2();

        //Muestra lo que esta guardado en nombre del curso
        System.out.printf("El nombre inicial del curso es: %s\n\n",Libro2.obtenerNombreDelCurso());

        //Lee y pide el nombre del curso
        System.out.println("Escriba el nombre del curso:");
        String NombreCurso=Scan.nextLine();
        Libro2.establecerNombreDelCurso(NombreCurso);


        Libro2.mostrarMensaje();
    }
}
