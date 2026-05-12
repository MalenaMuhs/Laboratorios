package AutoMG;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int CANT_AUTOS = 3;
        final int CANT_AUTO_FAMILIAR = 1;
        final int CANT_AUTO_UTILITARIO = 1;
        final int CANT_AUTO_DEPORTIVO = 1;
        int j=0;
        Scanner sc = new Scanner(System.in);
        
        int[] opciones = {25000, 30000, 50000};
        ArrayList<Auto> autos = new ArrayList<>();

        // AUTOS FAMILIARES
        for (int i = 0; i < CANT_AUTO_FAMILIAR; i++) {
            System.out.println("Auto nro. " + (j + 1));
            

            Auto auto = new AutoFamiliar();
            auto.pedirDatosAuto();
            int km = opciones[(int)(Math.random() * 3)];
            auto.avanzarKm(km);
            autos.add(auto);
            j++;
        }
        // AUTOS UTILITARIOS
        for (int i = 0; i < CANT_AUTO_UTILITARIO; i++) {
            System.out.println("Auto nro. " + (j + 1));

            Auto auto = new AutoUtilitario();
            auto.pedirDatosAuto();
            int km = opciones[(int)(Math.random() * 3)];
            auto.avanzarKm(km);
            autos.add(auto);
            j++;
        }

        // AUTOS DEPORTIVOS
        for (int i = 0; i < CANT_AUTO_DEPORTIVO; i++) {
            System.out.println("Auto nro. " + (j + 1));

            Auto auto = new AutoDeportivo();
            auto.pedirDatosAuto();
            int km = opciones[(int)(Math.random() * 3)];
            auto.avanzarKm(km);
            autos.add(auto);
            j++;
        }
        
        for (int i = 0; i < CANT_AUTOS; i++) {
            
            System.out.println("\n------------------------");
            System.out.println("Auto nro." + (i + 1));
            System.out.println(autos.get(i));
            
        }
    }
}
