package AutoMG;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] opciones = {25000, 30000, 50000};

        final int CANT_AUTOS = 3;
        
        ArrayList<Auto> autos = new ArrayList<>();

        for (int i = 0; i < CANT_AUTOS; i++) {
            int  aux_kmrecorridos= 0;
            System.out.println("\nAuto nro." + (i + 1));
            Auto auto = new Auto();
            
            for (int j = 0; j < 3; j++) {
                aux_kmrecorridos += opciones[(int) (Math.random() * 3)];
            }
            
            auto.avanzanKm(aux_kmrecorridos);
            autos.add(auto);
            
        }
        
        
        for (int i = 0; i < CANT_AUTOS; i++) {
            
            System.out.println("\n------------------------");
            System.out.println("Auto nro." + (i + 1));
            System.out.println(autos.get(i));
            
        }
    }
}
