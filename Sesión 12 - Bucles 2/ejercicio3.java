/*Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta. */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        String intento="";
        
        Scanner sc = new Scanner(System.in);
        String password = "secreto";

        System.out.println("Ingrese la contraseña:");
        do {
            intento = sc.nextLine();
            if (!password.equals(intento)){
                System.out.println("Contraseña errada. Intente nuevamente:");
            }else System.out.println("¡Contraseña correcta!");
        } while (!password.equals(intento));

        sc.close();
    }
}
