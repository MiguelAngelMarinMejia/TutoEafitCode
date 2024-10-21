package datos;

public class Tutores{

    public void darListaTutores(int mat){
        switch (mat){
            case 1:
                System.out.println("1.Juan\n2.Pedro:");
                break;
            case 2:
                System.out.println("1.Arnold\n2.Gasparin:\n3.Pablo");
                break;
            case 3:
                System.out.println("1.Jose\n2.María:");
                break;
        }
    }
}
