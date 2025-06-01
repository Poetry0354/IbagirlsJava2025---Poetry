import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int tamanioAlumnos=1;
        String nombreAlumno;
        int seleccion = 0;
        System.out.println("REGISTRO DE ESTUDIANTES");
        System.out.println("------------------------");
        try {
            System.out.println("¿Cuántos alumnos desea registrar?");
            tamanioAlumnos = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException ex) {            
            System.out.println("Hubo un error: "+ex.getMessage()); 
        }catch (Exception e) {
            System.out.println("Hubo un error: "+e.getMessage());
        }

        String[] alumnos = new String[tamanioAlumnos];
        Double[] notas = new Double[tamanioAlumnos];
        try {
            do {            
                System.out.println("""
                Menú:
                1. Registrar alumno
                2. Mostrar todos los alumnos
                3. Mostrar promedio de notas
                4. Buscar alumno por nombre
                5. Modificar nota por nombre
                6. Eliminar alumno por nombre
                7. Salir
                    """);
                opcion = sc.nextInt();
                sc.nextLine();
                
                    switch (opcion) {
                        case 1 -> {// Probado OK
                            System.out.println("Registrar alumnos");
                            for (int i = 0; i < alumnos.length; i++) {
                                do {
                                System.out.println("Ingresa el nombre del alumno "+(i+1));  
                                alumnos[i] = sc.nextLine().trim().toLowerCase();
                                } while (alumnos[i].isBlank());

                            do {
                                System.out.println("Ingresa la nota del alumno "+(i+1));
                                notas[i] = sc.nextDouble();
                                sc.nextLine(); 
                            } while (notas[i]<0 || notas[i]>10);                       

                            }
                        }
                        case 2 -> { // probado OK
                            System.out.println("Mostrar alumnos");
                            System.out.println(" ");
                            for (int i = 0; i < alumnos.length; i++) {
                                System.out.println("Alumno: "+alumnos[i]+" - Nota: "+notas[i]);                                
                            }
                        }
                        case 3 -> { // OK
                            System.out.println("Mostrar promedio de notas");
                                   double sumaNotas = 0.0;
                                   for (int i = 0; i < notas.length; i++) {
                                       if (notas[i] != null) {
                                           sumaNotas += notas[i];
                                       } else {
                                           System.out.println("En la posición "+(i+1)+" no hay nota para calcular el promedio.");                                           
                                       }
                                   }
                                   double promedio = sumaNotas / notas.length;

                                   System.out.printf("El promedio de las notas es: %.2f%n", promedio);

                        }
                        case 4 -> {System.out.println("Buscar alumno"); // OK
                            System.out.println("Ingrese el Nombre del Alumno a buscar");
                            nombreAlumno = sc.nextLine().trim().toLowerCase();
                            seleccion = -1;

                            for (int i = 0; i < alumnos.length; i++) {

                                if (alumnos[i].contains(nombreAlumno)) {
                                    seleccion = i;
                                    System.out.println("Se encontro al alumno: " + alumnos[seleccion] + " Con nota: "
                                            + notas[seleccion]);
                                }
                            }

                            if (seleccion <= -1)
                                System.out.println("No se encontro Alumno");

                            System.out.println("------------------------");

                        }
                        case 5 -> {         // Probado OK                   
                            System.out.println("Modificar nota");
                            System.out.println("Ingresa el nombre del alumno cuya nota quieres modificar: ");
                            nombreAlumno = sc.nextLine().toLowerCase();
                            boolean alumnoExiste=false;
                            for (int i = 0; i < alumnos.length; i++) {
                                if (alumnos[i].contains(nombreAlumno)) {
                                    System.out.println("Alumno: "+alumnos[i]+" - Nota: "+notas[i]);
                                    System.out.println("Ingresa la nueva nota");
                                    double nuevaNota = sc.nextDouble();
                                    notas[i] = nuevaNota;
                                    System.out.println("La nueva nota fue modificada con éxito");
                                    sc.nextLine();
                                    alumnoExiste = true;
                                }else alumnoExiste = false;
                            }

                            if(!alumnoExiste){
                                System.out.println("El alumno no está registrado.");
                            }                             
                        }
                        case 6 -> {
                            System.out.println("Eliminar alumno");
                            System.out.println("Ingrese el Nombre del Alumno para eliminar");
                            nombreAlumno = sc.nextLine();
                            seleccion = -1;

                            for (int i = 0; i < alumnos.length; i++) {                               

                                if (alumnos[i].contains(nombreAlumno)) {
                                    seleccion = i;
                                    System.out.println("Se encontro al alumno: " + alumnos[seleccion] + " Con nota: "
                                            + notas[seleccion]);
                                    alumnos[seleccion] = null;
                                    notas[seleccion] = null;
                                    System.out.println("Alumno eliminado.");
                                }
                            }

                            if (seleccion <= -1)
                                System.out.println("No se encontro Alumno");

                            System.out.println("------------------------");
                        }
                        case 7 -> System.out.println("Gracias por utilizar el sistema.");
                    }

                } while (opcion != 7);

            } catch (InputMismatchException ex) {
                System.out.println("Hubo un error: "+ex.getMessage());
            } catch (Exception e) {
                System.out.println("Hubo un error: "+e.getMessage());
            }           

    }
}