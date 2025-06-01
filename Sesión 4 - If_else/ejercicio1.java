// deberás escribir un programa que solicite al usuario un número 
// y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.

//System.out.printf("El número %d es positivo", numero);

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero=scanner.nextInt();
        if (numero>0){
            System.out.printf("el numero %d es positivo", numero);//concatenacion de valores con strings 
        }else if (numero<0) {
            System.out.printf("el numero %d es negativo", numero);
        } else {
            System.out.println("el numero es: " + numero);
        }
    }
}