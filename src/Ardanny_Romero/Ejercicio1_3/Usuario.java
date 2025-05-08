package Ardanny_Romero.Ejercicio1_3;

public class Usuario {
    String nombre_de_usuario;

    public Usuario(String nombre_de_usuario) {
        this.nombre_de_usuario = nombre_de_usuario;
    }

    public String saludos(String nombre_de_usuario){
        return String.format("Saludos %s! Te saluda Ardanny :D",nombre_de_usuario);
        //Existe esta opcion sin el format <return "Saludos " + nombre_de_usuario + "! Te saluda Ardanny :D";> Solo no uso el concatenar por comodidad
    }
}
