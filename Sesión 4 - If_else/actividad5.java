/*En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto
 y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, se aplicará 
 un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el 
 precio original sin descuento. */

import java.util.Scanner;

public class actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        int precioInicial = sc.nextInt();
        double precioFinal;
        if(precioInicial >= 100){
            precioFinal = precioInicial*0.9;
        }else{
            precioFinal = precioInicial;
        }
        System.out.println("El precio será: $"+precioFinal);
        sc.close();
        
    }
}
