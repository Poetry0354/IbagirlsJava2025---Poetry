/*1. Declara dos variables, y asígnales un valor a cada una de ellas.
2. Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. 
Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, 
Ej: La suma de las 2 variables es : “[resultado]”;
3. Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente 
declaradas, realiza la suma de los números y muestra el resultado en la consola.
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int num1 = 6;
        int num2 = 8;
        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        double division = num1/num2;
        double modulo = num1%num2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multipliccion es: "+multiplicacion);
        System.out.println("La divison es: "+division);
        System.out.println("El módulo es: "+modulo);

        System.out.println("Ingrese dos números enteros: ");
        int numUsuario1 = sc.nextInt();        
        int numUsuario2 = sc.nextInt();
        System.out.println("La suma de los números es: "+(numUsuario1+numUsuario2));

        sc.close();

    }
}
