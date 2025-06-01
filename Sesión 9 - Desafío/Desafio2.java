import java.util.Scanner;

public class Desafio2 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean esContrasenaSegura = true;
        String symbols = "";
        try {
            while (esContrasenaSegura) { 
                System.out.println("Ingrese su password: ");
                String password=sc.nextLine();
                if (password.length() >= 8 && password.chars().anyMatch(Character::isDigit) && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")  && password.matches(".*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/].*")){
                    System.out.println("Contraseña segura, cumple con todos los criterios.");
                    esContrasenaSegura=false;
                }else if(!(password.length() >= 8)){
                    System.out.println("La contraseña no tiene 8 caracteres.");
                }else if(!password.chars().anyMatch(Character::isDigit)){
                    System.out.println("La contraseña no tiene un número.");
                }else if(!password.matches(".*[A-Z].*")){
                    System.out.println("la contraseña no tiene mayúsculas.");
                }else if( !password.matches(".*[a-z].*")){
                    System.out.println("la contraseña no tiene minusculas.");
                }else if(!password.chars().anyMatch((c) -> symbols.indexOf(c) >= 0)){
                    System.out.println("No tiene caracteres especiales.");
                }
            }
            
        }catch(Exception e){
            System.out.println("Hubo un error " + e.getMessage());
        }finally{
            sc.close();
        }        
    }
}

