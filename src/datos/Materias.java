package datos;

import java.util.Scanner;

public class Materias extends Tutores{
    private static String[] materias = {"FDP", "Cálculo", "PDS"};

    public static int getCantidadMaterias(){
        return materias.length;
    }
    public static void getMateriasDisponibles() {
        for (int i = 0; i < materias.length; i++) {
            System.out.println((i+1) + ": " + materias[i]);
        }
    }
    public static void getOpcionesMaterias(){
        System.out.println("1: Ver fechas de parciales\n2: Ver tutores");
    }
    public static void getFechasParciales(int o) {
        switch (o) {
            case 1:
                System.out.println("\nParciales:");
                System.out.println("21/10/2024");
                System.out.println("31/10/2024");
                System.out.println("14/11/2024\n");
                break;
            case 2:
                System.out.println("\nParciales:");
                System.out.println("25/10/2024");
                System.out.println("02/11/2024\n");
                break;
            case 3:
                System.out.println("\nParciales:");
                System.out.println("8/11/2024");
                System.out.println("15/11/2024\n");
                break;
        }

    }

}
