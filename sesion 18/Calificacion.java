/*
 * Basándote en el siguiente ejercicio que ya has realizado,
 *  crea un método "obtenerNota()" que reciba por parámetro un "int" y devuelva un 
 * "String". El método debe utilizar la estructura de control "switch expression".
 */

import java.util.Scanner;

public class Calificacion {
    public static int numero;
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int pasar=capturaNum();
        System.out.println("la nota fue de: " + obtenerNota(pasar));
    }
    public static int capturaNum() {
        System.out.println("ingrese un numero del 0 al 100");
        numero=sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("numero invalido ingreselo nuevamente: ");
            numero=sc.nextInt();
        } while (numero < 0 || numero > 100);
        return numero;
    }
    public static String obtenerNota(int pasar) {
        
        String nota=switch (pasar/10) {
        case 10,9 -> "A";
        case 8 -> "B";
        case 7 -> "C";
        case 6 -> "D";
        default -> "F";
        };
        return nota;
    }
}
