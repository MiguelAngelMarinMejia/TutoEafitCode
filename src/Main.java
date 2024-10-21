import java.util.Scanner;
import static datos.Materias.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, en este sistema puedes ver las fechas disponibles de los tutores de cada materia.");

        System.out.println("Elige la materia de la que deseas tener información:");
        getMateriasDisponibles();
        while(true){
          int opMateria = sc.nextInt();
          if (opMateria < 1 || opMateria > getCantidadMaterias()) {
              System.out.println("Opción inválida\nElige una opción válida");
          } else {
              System.out.println("¿Qué deseas hacer?");
              getOpcionesMaterias();
              while (true){
                  int opAccion = sc.nextInt();
                  if (opAccion < 1 || opAccion > 2) {
                      System.out.println("Opción inválida\nElige una opción válida");
                  } else {
                      if (opAccion == 1) {
                          getFechasParciales(opMateria);
                      } else {

                      }
                      break;
                  }
              }
              break;
          }
        }


    }
    /*
    public static void mostrarDatos(int mat, int tutor){
        if(tutor == 1 && mat == 1){
            System.out.println("\nEl tutor Juan tiene disponibles los siguientes días:");
        } else if(tutor == 2 && mat == 1){
            System.out.println("\nEl tutor Pedro tiene disponibles los siguientes días:");
        } else if(tutor == 1 && mat == 2){
            System.out.println("\nEl tutor Arnold tiene disponibles los siguientes días:");
        } else if(tutor == 2 && mat == 2){
            System.out.println("\nEl tutor Gasparin tiene disponibles los siguientes días:");
        } else if(tutor == 3 && mat == 2){
            System.out.println("\nEl tutor Pablo tiene disponibles los siguientes días:");
        } else if(tutor == 1 && mat == 3){
            System.out.println("\nEl tutor Jose tiene disponibles los siguientes días:");
        } else if(tutor == 2 && mat == 3){
            System.out.println("\nLa tutora María tiene disponibles los siguientes días:");
        }
    }

    public static void elegirTutor(int matEleg, Scanner s) {
        int tutorElegido;
        System.out.println("Elije el tutor que deseas");
        switch (matEleg) {
            case 1:
                System.out.println("1. Juan");
                System.out.println("2. Pedro");
                tutorElegido = s.nextInt();
                mostrarDatos(matEleg, tutorElegido);
                break;
            case 2:
                System.out.println("1. Arnold");
                System.out.println("2. Gasparin");
                System.out.println("3. Pablo");
                tutorElegido = s.nextInt();
                mostrarDatos(matEleg, tutorElegido);
                break;
            case 3:
                System.out.println("1. José");
                System.out.println("2. María");
                tutorElegido = s.nextInt();
                mostrarDatos(matEleg, tutorElegido);
                break;
        }
    }
    */
}