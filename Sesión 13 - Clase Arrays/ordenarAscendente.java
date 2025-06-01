/*Ordenar en forma ascendente
Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego ordénalo en forma ascendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola. */

import java.util.Arrays;

public class ordenarAscendente{
    public static void main(String[] args) {
        int [] arr = new int[10]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(100)+1); 
        }
        
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}