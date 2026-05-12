
package AutoMG;

import java.util.Scanner;

public class AutoDeportivo extends Auto {

    private double velocidadMaxima;
    private double aceleracion0a100;

    public AutoDeportivo() {
    }

    public AutoDeportivo(double velocidadMaxima, double aceleracion0a100, String marca, String modelo, String color, double precio, Motor motor) {
        super(marca, modelo, color, precio, motor);
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion0a100 = aceleracion0a100;
    }

    @Override
    public String toString() {

        return super.toString() +
               "\nVelocidad maxima: " + velocidadMaxima +
               "\nAceleracion de 0 a 100: " + aceleracion0a100;
    }

    @Override
    protected void pedirDatosAuto() {
        super.pedirDatosAuto();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la velocidad maxima: ");
        this.velocidadMaxima = sc.nextDouble();
        
        System.out.print("Ingrese la aceleracion: ");
        this.aceleracion0a100 = sc.nextDouble();
    }
    
    
}
