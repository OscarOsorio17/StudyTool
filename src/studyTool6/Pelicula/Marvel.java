package studyTool6.Pelicula;

public class Marvel {
    String Nombre;
    int Fecha;
    String Director;
    protected String Estudio="Marvel";
    protected String Creador="Stan Lee";
    protected String Propietario="The Walt Disney Company";
    protected String Streaming="Disney+";

    protected void verPelicula(){
        System.out.println("Estoy viendo "+Nombre+" la cual es una pelicula dirigida por "+Director+
                " presentada en el año "+Fecha+" del estudio "
                +Estudio+" que pertenece a "+Propietario+"," +
                " basado en Comics de "+Creador+
                " y se puede ver en "+Streaming);
    }
}
