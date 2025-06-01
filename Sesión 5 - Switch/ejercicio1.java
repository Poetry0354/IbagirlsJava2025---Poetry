
/*En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, 
que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre 
correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa. */

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 7: ");
        int opcion = sc.nextInt();       

        switch(opcion) {
            case 1 -> System.out.println("Es lunes");
            case 2 -> System.out.println("Es martes");
            case 3 -> System.out.println("Es miércoles");
            case 4 -> System.out.println("Es jueves");
            case 5 -> System.out.println("Es viernes");
            case 6 -> System.out.println("Es sábado");
            case 7 -> System.out.println("Es domingo");
            default -> System.out.println("Opción no válida");
        }
        sc.close();

    }
}
