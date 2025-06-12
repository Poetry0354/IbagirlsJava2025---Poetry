/*Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" que no reciba ningún parámetro y se encargue de generar la lógica de mostrar el menú de opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos números al usuario y realiza la operación matemática seleccionada, teniendo en cuenta las validaciones necesarias como la división por cero. */

import java.util.Scanner;

public class CalculadoraMetodos{

    public static Scanner sc = new Scanner(System.in);
    public static double num1 = 0;
    public static double num2 = 0;
    public static int opcion = 0;
    public static double resultado = 0;
    public static boolean salir = false;
    
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        try {
            System.out.println("-------------CALCULADORA-------------");
            System.out.println("Ingresa el primer número: ");
            num1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingresa el segundo número: ");
            num2 = sc.nextInt();
            sc.nextLine();
            do {
                System.out.println("""
                    
                        Ingresa la operación que deseas realizar:
                        1. Suma
                        2. Resta
                        3. Multiplicación
                        4. División
                        5. Módulo
                        6. Salir
                        """);
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1 -> {
                        resultado = num1+num2;
                        System.out.println("El resultado de la suma es: "+resultado);
                    }
                    case 2 -> {
                       resultado = num1-num2;
                       System.out.println("El resultado de la resta es: "+resultado); 
                    }
                    case 3 -> {
                        resultado = num1 * num2;
                        System.out.println("El resultado de la multiplicación es: " + resultado);
                    }
                    case 4 -> {
                        if (num2==0) {
                            System.out.println("No se puede dividir por cero."); 
                        }else{
                            resultado = num1 / num2;
                            System.out.println("El resultado de la división es: " + resultado);
                        }
                    }
                    case 5 -> {
                        resultado = num1 % num2;
                        System.out.println("El resultado del módulo es: " + resultado);
                    }
                    case 6 -> {
                        System.out.println("Gracias por utilizar la calculadora.");
                        salir = true;
                    }
                }
            } while (salir == false);
            
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero: "+e.getMessage());
            // TODO: handle exception
        } catch (Exception e){
            System.out.println("Hubo un error: "+e.getMessage());
        }         
        
    }
}