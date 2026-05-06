package AutoMG;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //int[] opciones = {25000, 30000, 50000};
        
        final int CANT_AUTOS = 3;
        Auto[] autos = new Auto[CANT_AUTOS];
        
        for (int i = 0; i < CANT_AUTOS; i++) {
            
            //int incremento_km = opciones[(int)(Math.random() * 3)];
            autos[i]= new Auto();
            autos[i].pedirDatosAuto();
            autos[i].avanzanKm(80000);
        }
        
    }
}
