/*Actividad: Rellenando un arreglo
El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y
devuelve el arreglo modificado. Vamos a escribir un programa que solicite al
usuario el tamaño para un arreglo y un número entero con el que quiera rellenarlo.
Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.
*/

import java.util.Arrays;
import java.util.Scanner;

public class rellenaArreglo {
    public static void main(String[] args) {
         int tamaño = 0;
        int valor=0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el tamaño para un arreglo");
        tamaño = sc.nextInt();


        System.out.println("Ingrese el valor para rellenar");
        valor = sc.nextInt();
       
        int[] arreglo = new int[tamaño];
        Arrays.fill(arreglo, valor);


        System.out.println("El arreglo es: "+ Arrays.toString(arreglo));


        sc.close();

    }
}
