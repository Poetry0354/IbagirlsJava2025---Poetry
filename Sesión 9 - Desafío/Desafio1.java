import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp, far, cel;
        String unidad;

        try {
            System.out.println("Ingresa la temperatura: ");
            temp = sc.nextDouble();            
            sc.nextLine(); // limpiar el búffer
            System.out.println("Ingrese la unidad de medida (C/F)");
            unidad = sc.nextLine().toUpperCase();

            switch (unidad) {
                case "C" ->  {
                    far = (temp * 9 / 5) + 32;
                    System.out.println(temp+" grados Celsius equivale a "
                                        +far+" grados Fahrenheit." );
                }
                case "F" -> {
                    cel = (temp - 32) * 5 /9;
                    System.out.println(temp+" grados Fahrenheit equivale a "
                                        +cel+" grados Celsius." );
                }
                default -> System.out.println("Error: Unidad de medida no válida. Ingresa C o F."); 
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica");
        } catch (Exception e) {
            System.out.println("Hubo un error" + e.getMessage());
        }finally {
            sc.close();
        }


    }
}
