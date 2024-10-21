package datos;

public class DatosTutores {
    private String tutor;
    private String materia;

    public DatosTutores(String tutor, String materia) {
        this.tutor = tutor;
        this.materia = materia;
    }

    public void fechasPorTutor(){
        switch (materia){
            case "FDP":
                if(tutor.equals("Juan")){
                    System.out.println("23/02/2025");
                    System.out.println("02/06/2025");
                    System.out.println("16/11/2025\n");
                } else if (tutor.equals("Pedro")){
                    System.out.println("22/10/2024");
                    System.out.println("23/10/2024");
                    System.out.println("01/11/2024\n");
                }
                break;
            case "PDS":
                if(tutor.equals("Arnold")){
                    System.out.println("20/10/2024");
                    System.out.println("21/10/2024");
                    System.out.println("22/10/2024\n");
                } else if (tutor.equals("Gasparin")){
                    System.out.println("29/10/2024");
                    System.out.println("30/10/2024");
                    System.out.println("31/10/2024\n");
                } else if (tutor.equals("Pablo")){
                    System.out.println("02/11/2024");
                    System.out.println("05/11/2024");
                    System.out.println("06/11/2024\n");
                }
                break;
            case "Cálculo":
                if(tutor.equals("Jose")){
                    System.out.println("19/10/2024");
                    System.out.println("20/10/2024");
                    System.out.println("21/10/2024\n");
                } else if (tutor.equals("Maria")){
                    System.out.println("22/10/2024");
                    System.out.println("23/10/2024");
                    System.out.println("24/10/2024\n");
                }
                break;
        }
    };
}
