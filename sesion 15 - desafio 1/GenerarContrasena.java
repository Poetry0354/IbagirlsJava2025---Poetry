import java.util.Scanner;

public class GenerarContrasena {
    public static void main(String[] args) {

        Scanner miScaner = new Scanner(System.in);

        int size=0;
        boolean mayusFlag;
        boolean minusFlag;
        boolean digitFlag;
        boolean special;

        do{
            System.out.print("Ingrese el tamaño de la contraseña: ");
            size = miScaner.nextInt();
        }while(size < 3 );

        System.out.println("---------------------");

        char[] password = new char[size];
        do {
            mayusFlag = false;
            minusFlag = false;
            digitFlag = false;
            special = false;

            for (int i = 0; i < password.length; i++) {
                password[i] = (char) (Math.random() * (122 - 48) + 48);
                //System.out.println(password[i]); //debug
                if (Character.isUpperCase(password[i])) {
                    mayusFlag = true;
                }
                if (Character.isLowerCase(password[i])) {
                    minusFlag = true;
                }
                if (Character.isDigit(password[i])) {
                    digitFlag = true;
                }
                if (!Character.isLetterOrDigit(password[i])) {
                    special = true;
                }
            }
        } while (!mayusFlag || !minusFlag || !digitFlag || special);

        String resultado = new String(password);
        System.out.println("La clave es: " + resultado);
        miScaner.close();
    }
}