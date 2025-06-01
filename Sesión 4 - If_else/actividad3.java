/*En esta actividad, escribirás un programa que solicite al usuario un número y determine si es 
divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla. */

import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        if(numero % 5 == 0 && numero % 3 == 0){
            System.out.println("El número es divisible por 5 y por 3.");
        }else if (numero % 5 == 0){
            System.out.println("El número es divisible solo por 5.");

        }else if (numero % 3 == 0){
            System.out.println("El número es divisible solo por 3.");
        }else{
            System.out.println("El número no es divisible por ninguno.");
        }

        sc.close();

    }   
}
