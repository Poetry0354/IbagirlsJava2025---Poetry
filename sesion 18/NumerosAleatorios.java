/*Basándote en el ejercicio que ya has realizado, crea un método "numeroAleatorio()" que no requiera parámetros y devuelva un "int" dentro del rango especificado.
Ejercicio anterior: “Generando números aleatorios” Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println(numeroAleatorio());
    }

    public static int numeroAleatorio(){
        int num = (int) ((Math.random() * 355) + 1);
        return num;
    }
}
