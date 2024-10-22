package datos;

public class Tutores{

    public static void getListaTutores(int mat){
        switch (mat){
            case 1:
                System.out.println("1.Juan\n2.Pedro:");
                break;
            case 2:
                System.out.println("1.Arnold\n2.Gasparin\n3.Pablo");
                break;
            case 3:
                System.out.println("1.Jose\n2.María:");
                break;
        }
    }

    public static void getFechasTutor(int mat, int tutor) {
        System.out.println("\nFechas disponibles para tutorias:");
        switch (mat) {
            case 1:
                if (tutor == 1) {
                    System.out.println("\n23/02/2025\n02/06/202516/11/2025");
                } else if (tutor == 2) {
                    System.out.println("\n22/10/2024\n23/10/2024\n01/11/2024");
                }
                break;
            case 2:
                if (tutor == 1) {
                    System.out.println("\n20/10/2024\n21/10/2024\n22/10/2024");
                } else if (tutor == 2) {
                    System.out.println("\n29/10/2024\n30/10/2024\n31/10/2024");
                } else if (tutor == 3) {
                    System.out.println("\n02/11/2024\n05/11/2024\n05/11/2024");
                }
                break;
            case 3:
                if (tutor == 1) {
                    System.out.println("\n19/10/2024\n20/10/2024\n21/10/2024");
                } else if (tutor == 2) {
                    System.out.println("\n22/10/2024\n23/10/2024\n24/10/2024");
                }
                break;
        }
    }
}
