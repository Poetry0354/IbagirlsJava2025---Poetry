import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa una palabra");
        String cadena = sc.nextLine();
        Boolean allLetters = true;

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isLetter(cadena.charAt(i))){
                allLetters = false;
            }
        }
        sc.close();

        if (allLetters) { 
            System.out.println("Son todas letras");         
        }else System.out.println("No son todas letras");
    }
}

