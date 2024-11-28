package Taller7.Ejercicio3;

public class Evitar {
    private String mensaje = "Mensaje original";

    /*public static void cambiarMensaje() {
        Esto causara un error porque no puede ser accedido desde un metodo estatico
        mensaje = "Nuevo mensaje";  // Error de compilacion
    }
    */

    
    public static void cambiarMensaje(Evitar obj) {
        obj.mensaje = "Nuevo mensaje";
    }

    public static void main(String[] args) {
        
        Evitar obj = new Evitar();  
        cambiarMensaje(obj);
        System.out.println("Mensaje: " + obj.mensaje);
    }
    }

