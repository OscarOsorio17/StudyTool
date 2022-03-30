package studyTool8.Peliculas2;

import javax.swing.*;

public class Cartelera {
    public static void main(String[] args) {
        Accion Pelicula1= new Accion();
        Animacion Pelicula2=new Animacion();
        Terror Pelicula3=new Terror();

        JOptionPane.showMessageDialog(null,"Cartelera");

        Pelicula1.Datos("Batman",2022);
        Pelicula1.Genero("Accion",14);

        Pelicula2.Datos("Sing 2",2022);
        Pelicula2.Genero("Animacion","Infantil",5);

        Pelicula3.Datos("It 2",2019);
        Pelicula3.Genero("Terror",18);
    }
}
