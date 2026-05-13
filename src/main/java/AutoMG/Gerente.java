package AutoMG;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Empleado {

    private double bono;

    public Gerente() {
    }

    public Gerente(double bono) {
        this.bono = bono;
    }

    public Gerente(double bono, String nombre, String apellido, String dni, String email, String codigoEmpleado, double sueldoBasico) {
        super(nombre, apellido, dni, email, codigoEmpleado, sueldoBasico);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return super.getSueldoBasico() + bono;
    }

    public void agregarEmpleado(ArrayList<Administrativo> admins,ArrayList<Vendedor> vends) {

        Scanner leer = new Scanner(System.in);

        System.out.println("1 - Agregar Administrativo");
        System.out.println("2 - Agregar Vendedor");
        int opcion = leer.nextInt();
        leer.nextLine();

        System.out.print("Nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Apellido: ");
        String apellido = leer.nextLine();

        System.out.print("DNI: ");
        String dni = leer.nextLine();

        System.out.print("Email: ");
        String email = leer.nextLine();

        System.out.print("Codigo: ");
        String codigo = leer.nextLine();

        System.out.print("Sueldo basico: ");
        double sueldo = leer.nextDouble();

        if (opcion == 1) {

            System.out.print("Horas extra: ");
            int horas = leer.nextInt();

            Administrativo admin = new Administrativo(horas,
                    nombre, apellido, dni,
                    email, codigo, sueldo);

            admins.add(admin);

            System.out.println("Administrativo agregado.");

        } else if (opcion == 2) {

            System.out.print("Cantidad ventas: ");
            int ventas = leer.nextInt();

            Vendedor vendedor = new Vendedor(ventas, nombre, apellido, dni, email, codigo, sueldo);

            vends.add(vendedor);

            System.out.println("Vendedor agregado.");
        }

    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("bonificacion: " + bono);
    }
}
