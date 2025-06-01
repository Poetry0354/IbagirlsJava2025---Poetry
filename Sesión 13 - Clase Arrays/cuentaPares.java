/*Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro */

import java.util.Arrays;
import java.util.Scanner;

public class cuentaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = {2,5,3,7,8,23,9};
    
        System.out.println("Arreglo 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Índice %d = %d\n", i, arr1[i]);
        }

        System.out.println("Ingresa 2 índices (inicial y final): ");
        int indiceInicial = sc.nextInt();
        int indiceFinal = sc.nextInt();

         while (indiceInicial>=indiceFinal || indiceFinal<0 || indiceInicial>arr1.length  || indiceFinal>arr1.length){
            System.out.println("Indices inválidos. Ingrésalos de nuevo: ");
            indiceInicial = sc.nextInt();
            indiceFinal = sc.nextInt();
         }

        int[] parteDelArray = Arrays.copyOfRange(arr1, indiceInicial, indiceFinal+1);

        System.out.println("Su nuevo arreglo es: "+Arrays.toString(parteDelArray));
        sc.close();
    }
}
