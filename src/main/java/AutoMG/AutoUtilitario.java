
package AutoMG;

import java.util.Scanner;

public class AutoUtilitario extends Auto{
    
    private double capacidadCarga;
    private double volumenCarga;

    public AutoUtilitario() {
    }

    public AutoUtilitario(String marca, String modelo) {
        super(marca, modelo);
    }
    
    
    public AutoUtilitario(double capacidadCarga, double volumenCarga, String marca, String modelo, String color, double precio, Motor motor) {
        super(marca, modelo, color, precio, motor);
        this.capacidadCarga = capacidadCarga;
        this.volumenCarga = volumenCarga;
    }

    @Override
    public String toString() {

        return super.toString() +
               "\nCapacidad: " + capacidadCarga +
               "\nVolumen: " + volumenCarga;
    }

    @Override
    protected void pedirDatosAuto() {
        super.pedirDatosAuto(); 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese capacidad de carga: ");
        this.capacidadCarga = sc.nextDouble();
        
        System.out.print("Ingrese volumen de la carga: ");
        this.volumenCarga = sc.nextDouble();
    }
    
    
}
