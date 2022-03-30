package studyTool;

public class PruebaLibroCalificaciones3 {
    public static void main(String[] args) {
        //Invoca al nombre constructor
        LibroDeCalificaciones3 Libro1=new LibroDeCalificaciones3("ADSI");
        LibroDeCalificaciones3 Libro2=new LibroDeCalificaciones3("JAVA");

        //Mostrara el nombre de los cursos
        System.out.println("El nombre del curso de Libro1 es: "+Libro1.obtenerNombreCurso());
        System.out.println("El nombre del curso de Libro2 es: "+Libro2.obtenerNombreCurso());
    }
}
