package studyTool;

public class LibroDeCalificaciones2 {
    private String nombreDelCurso;//Se instancia la variable del nombre del curso

    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;//Se guarda el nombre del curso
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;//Se retorna el nombre del curso
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido a libro de calificaciones de: \n%s!\n",obtenerNombreDelCurso());
        //Se muestra en consola el nombre con un mensaje
    }
}
