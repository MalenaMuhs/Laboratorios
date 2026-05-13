/*
Tener al menos un atributo propio (por ejemplo: cantidad de puertas, capacidad de carga, velocidad máxima, si tiene turbo, capacidad de carga, si es 4x4, etc.).
Escribir al menos un método propio.
Sobrescribir algún método (por ejemplo, toString() o avanzar() si se desea comportamiento específico).
 */
package AutoMG;

import java.util.Scanner;

public class AutoFamiliar extends Auto{
    
    private int cantidadPuertas;
    private int cantidadAsientos;

    public AutoFamiliar() {
    }

    public AutoFamiliar(String marca, String modelo) {
        super(marca, modelo);
    }
    
    
    public AutoFamiliar(int cantidadPuertas, int cantidadAsientos, String marca, String modelo, String color, double precio, Motor motor) {
        super(marca, modelo, color, precio, motor);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPuertas: " + cantidadPuertas +
               "\nAsientos: " + cantidadAsientos;
    }

    @Override
    protected void pedirDatosAuto() {
        super.pedirDatosAuto();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de puertas: ");
        this.cantidadPuertas = sc.nextInt();
        
        System.out.print("Ingrese cantidad de asientos: ");
        this.cantidadPuertas = sc.nextInt();
    }   
}
