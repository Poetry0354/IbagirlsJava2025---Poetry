/*Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número decimal usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido. */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String cadena;
        try {
            System.out.println("Introduce una cadena:");
            cadena = sc.nextLine();
            Double.valueOf(cadena);
            System.out.println(cadena+" ahora es un Double.");
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("La entrada no es un número válido: "+e.getMessage());
        }


    }
}