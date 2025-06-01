/*El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso. */

import java.util.Scanner;

public class BuscarElemento{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {3,9,7};
        System.out.println("Ingresa el número a buscar en el array: ");
        int numUsuario = sc.nextInt();
        sc.close();
        if (numUsuario == numeros[0]) {
            System.out.println("Número encontrado en la posición 1.");
        }
        else if(numUsuario == numeros[1]){
            System.out.println("Número encontrado en la posición 2.");
        }
        else if(numUsuario == numeros[2]){
            System.out.println("Número encontrado en la posición 3.");
        }
        else System.out.println("El número no se encuentra en el array");

    }
}