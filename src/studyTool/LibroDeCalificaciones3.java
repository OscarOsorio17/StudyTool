package studyTool;

public class LibroDeCalificaciones3 {

    //Atributos
    private String nombreCurso;

    //Metodo Constructor
    public LibroDeCalificaciones3(String nombre){
        nombreCurso=nombre;
    }

    //Metodos
    public void establecerNombreCurso(String nombre){
        nombreCurso=nombre;//Almacena el nombre del curso
    }
    public String obtenerNombreCurso(){
        return nombreCurso;
    }
    public void mostrarMensaje(){
        System.out.println("Bienvenido al curso \n%s!\n"+obtenerNombreCurso());
    }
}
