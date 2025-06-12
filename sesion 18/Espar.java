/*Reemplaza la lógica de pedir un número por un método 
llamado "solicitarNumero()" que no reciba parámetros y devuelva un entero. 
También reemplaza la condición del if 
por un método llamado "esPar()" que reciba 
por parámetro un entero y devuelva un booleano. */

import java.util.Scanner;

public class Espar {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int numero=solicitarNumero();
        System.out.println("el numero " + numero + (esPar(numero) == true ? " es par" : " no es par"));
        
    }

    public static int solicitarNumero () {
        System.out.println("ingrese un numero: ");
        Integer numero=null;
        do {
            try {
            numero=sc.nextInt();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("no ingreso un numero intente nuevamente: ");
        }
        } while (numero==null);
        return numero;

    }

    public static boolean esPar(int numero ) {
        return numero % 2 == 0 ? true : false; 
    }
}
