package AutoMG;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] opciones = {25000, 30000, 50000};
        int incremento_km;

        final int CANT_AUTOS = 3;
        Auto[] autos = new Auto[CANT_AUTOS];

        for (int i = 0; i < CANT_AUTOS; i++) {
            System.out.println("\nAuto nro." + (i+1));
            autos[i] = new Auto();
            int aux_kmrecorridos= autos[i].getMotor().getKilometrosRecorridos();
               for (int j = 0; j < 3; j++) {
               aux_kmrecorridos +=opciones[(int)(Math.random() * 3)];
            }
            incremento_km = 0;
            //autos[i].pedirDatosAuto();
            autos[i].avanzanKm(aux_kmrecorridos);
        }

    }
}
