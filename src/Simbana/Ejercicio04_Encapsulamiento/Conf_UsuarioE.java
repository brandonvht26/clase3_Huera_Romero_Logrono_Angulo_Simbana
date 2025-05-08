package Simbana.Ejercicio04_Encapsulamiento;

public class Conf_UsuarioE {

    //Atributos
    private String idioma;
    private  String[] idiomas_validos={"Español","Ingles","Francés"};
    private boolean notificacion;


    //metodos
    public void cambiar_idioma(String nuevo_idioma){

        boolean esvalido=false;
        idioma=nuevo_idioma;

        //valida el cambio de idioma
        for(int i=0; i<idiomas_validos.length; i++){
            if (idiomas_validos[i].equalsIgnoreCase(nuevo_idioma)) {
                esvalido = true;
                break;
            }
        }

        if(esvalido){
            System.out.println("Idioma cambiado a: " +nuevo_idioma);
        }else {
            System.out.println("No se puede cambiar de idioma! : Idioma no es valido en esta app");
        }
    }

    public void activar_notificacion(boolean activar){

        this.notificacion=activar;

        String estado = activar ? "activadas" : "desactivadas";
        System.out.println("Notificaciones " + estado + ".");
    }

}
