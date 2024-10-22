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
                          System.out.println("Ingresa el número del tutor para ver las fechas disponibles");
                          getListaTutores(opMateria);
                          int opTutor = sc.nextInt();
                          getFechasTutor(opMateria, opTutor);
                      }
                      break;
                  }
              }
              break;
          }
        }


    }
}