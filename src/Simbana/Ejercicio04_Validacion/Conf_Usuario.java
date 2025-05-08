package Simbana.Ejercicio04_Validacion;

public class Conf_Usuario {

      String[] idiomas_validos={"Español","Ingles","Frances"};
      String idioma;
      String validar_notificaciones;


    // creamos los metodos
    public void validacion_idioma(String idioma){

        boolean esvalido=false;
        this.idioma=idioma;

        // valida si el idioma esta en el arreglo

        for(int i =0; i < idiomas_validos.length; i++){

            if(idiomas_validos[i].equalsIgnoreCase(idioma)){
                esvalido=true;
                break;
            }
        }

        //valida el idioma

        if(esvalido){
            System.out.println("Idioma configurado a: " +idioma);
        }else{
            System.out.println("Error: este idioma no esta permitido en esta app.");
        }

    }

    public void validacion_notificacion(String validar_notificaciones){

        this.validar_notificaciones=validar_notificaciones;

        if(validar_notificaciones.equalsIgnoreCase("Si")){
            System.out.println("Notificaciones Activadas");

        } else if(validar_notificaciones.equalsIgnoreCase("No")) {
            System.out.println("Notificaciones  desactivadas");
        }else{
            System.out.println("Error! : Debe ingresar Si o No");
        }
    }
}
