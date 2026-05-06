package AutoMG;

import java.util.Scanner;

public class Motor {
   private int kilometrosRecorridos;
   private double cilindradas;
   private int caballosFuerza;
   private int km_max= 100000;

    public Motor() {
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
   
    
   
   
   public boolean requiereCambioAceite(){
      
       return kilometrosRecorridos>km_max;
   }
   
   public void pedirDatosMotor(){
        Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese cilindrada: ");
    this.cilindradas = sc.nextDouble();

    System.out.print("Ingrese caballos de fuerza: ");
    this.caballosFuerza = sc.nextInt();

    System.out.print("Ingrese km recorridos: ");
    this.kilometrosRecorridos =  sc.nextInt();
   }
}
