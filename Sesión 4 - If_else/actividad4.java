// En este ejercicio, escribirás un programa que pida al usuario una contraseña 
//y verificará si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, 
// se mostrará un mensaje de "Acceso concedido". 
// En caso contrario, se mostrará un mensaje de "Acceso denegado".

import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese su contraseña: ");
        String password=sc.nextLine();
        String passwordTrue="luna123";
        if(password.equals(passwordTrue)){// el metodo equals permite comparar con strings 
            System.out.println("la contraseña coinside");
        }
        else{
            System.out.println("acceso denegado: " + password);
        }
    }
}
