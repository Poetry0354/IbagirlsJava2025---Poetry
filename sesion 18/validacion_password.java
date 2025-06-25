/* Validación de contraseña: Basándote en el ejercicio que ya has 
realizado, crea un método "esSegura()" que reciba por parámetro un 
"String" y devuelva un booleano para comprobar que la contraseña cumple 
con los criterios establecidos. También, 
crea los métodos: "tieneLongitudCorrecta()", 
"tieneMayuscula()", "tieneMinuscula()", "tieneNumero()" y 
"tieneCaracterEspecial()", 
que reciban por parámetro un "String" y devuelvan un "booleano".
 */

import java.util.Scanner;

public class validacion_password {
    public static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.println("Ingrese una contraseña segura: ");
        String password = sc.nextLine();
       try {

        // System.out.println("es " + !tieneCaracterEspecial(password) +" " + tieneLongitudCorrecta(password) +" " +  !tieneMayuscula(password) +" " +  !tieneMinuscula(password) +" " +  !tieneNumero(password));
        System.out.println("La contraseña " + (esSegura(password)?"Es segura" : "No es segura"));
       } catch (Exception e) {
        
        System.out.println("Existe un error");
       }
      
        
    }

    public static boolean esSegura( String password){
      
        return (!tieneCaracterEspecial(password) && tieneLongitudCorrecta(password) && !tieneMayuscula(password) && !tieneMinuscula(password) && !tieneNumero(password))? true: false;
    }
    public static boolean tieneLongitudCorrecta(String password)
    {
        return password.length()>8? true:false;
    }

      public static boolean tieneMayuscula(String password)
    {
            return !password.matches(".*[A-Z].*");
    }
       public static boolean tieneMinuscula(String password)
    {
        return !password.matches(".*[a-z].*");
    }
       public static boolean tieneNumero(String password)
    {
         return !password.chars().anyMatch(Character::isDigit);
  
    }
        public static boolean tieneCaracterEspecial(String password)
        {
            return !password.matches(".*[^a-zA-Z0-9 ].*");
        }
}
