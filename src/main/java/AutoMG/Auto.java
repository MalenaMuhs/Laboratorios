package AutoMG;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Auto {

    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private Motor motor;

    public Auto() {
        pedirDatosAuto();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void avanzanKm(int km) {
        //incrementar mas de una vez
        int aux = motor.getKilometrosRecorridos();
        motor.setKilometrosRecorridos(aux + km);

        if (motor.requiereCambioAceite()) {

             JOptionPane.showMessageDialog(null, "El auto " + marca + " necesita cambio de aceite");
        }

    }

    private void pedirDatosAuto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese marca: ");
        this.marca = sc.nextLine();

        System.out.print("Ingrese modelo: ");
        this.modelo = sc.nextLine();

        System.out.print("Ingrese color: ");
        this.color = sc.nextLine();

        System.out.print("Ingrese precio: ");
        this.precio = sc.nextDouble();

        motor = new Motor();
        motor.pedirDatosMotor();
    }

    @Override
    public String toString() {
        return  "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nColor: " + color
                + "\nPrecio: $" + precio
                + "\nKilometros: " + motor.getKilometrosRecorridos()
                + "\nCilindrada: " + motor.getCilindradas()
                + "\nCaballos: " + motor.getCaballosFuerza();
    }
    
    
}
