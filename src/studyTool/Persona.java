package studyTool;

public class Persona {
    //Atributos
    String nombre;
    int edad;


    //Metodo Constructor
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //Metodos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
