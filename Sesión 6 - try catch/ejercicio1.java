/*Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        int num1, num2;
        int resultado;
        Scanner kali = new Scanner(System.in);
        
        try {
        System.out.println("Ingrese un número:");
        num1 = kali.nextInt();

        System.out.println("Ingrese otro número:");
        num2 = kali.nextInt();

        
        resultado = num1 - num2;
        System.out.println("El resultado es:" + resultado);

        } catch (InputMismatchException e) {
            System.out.println("No ingreso un número");
        
        }catch (Exception e) {
            System.out.println("Se detecto un error");
        } finally {
            kali.close();
        }
    
    }
}
