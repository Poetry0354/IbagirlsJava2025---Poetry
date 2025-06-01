/*Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras de números negativos. */


import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int contador =0;
        System.out.println("Ingresa un numero");
        valor = sc.nextInt();
        do {
            valor = valor/10;
            contador++;
        } while (valor!=0);
        System.out.println("cifras: "+ contador);
    }
}
