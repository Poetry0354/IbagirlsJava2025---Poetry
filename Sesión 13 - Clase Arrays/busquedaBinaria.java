/*La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo. */

import java.util.Arrays;
import java.util.Scanner;

public class busquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,5,3,7,8,23,9}; 
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Ingrese el número cuyo índice desea buscar: ");
        int num = sc.nextInt();
        int index = Arrays.binarySearch(arr, num);
        if (index < 0) {
            System.out.println("El número no se encuentra en el arreglo.");
        } else {
            System.out.println("El número "+num+" está en el índice: "+index);
        }
        sc.close();     

    }
}
