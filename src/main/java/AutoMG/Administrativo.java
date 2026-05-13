package AutoMG;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrativo extends Empleado {

    private int horasExtra;
    final int VALOR_HORA_EXTRA = 1500;

    public Administrativo() {
    }

    public Administrativo(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Administrativo(int horasExtra, String nombre, String apellido, String dni, String email, String codigoEmpleado, double sueldoBasico) {
        super(nombre, apellido, dni, email, codigoEmpleado, sueldoBasico);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (horasExtra * VALOR_HORA_EXTRA);
    }

    public void cargarAuto(ArrayList<Auto> stock) {

        Scanner sc = new Scanner(System.in);

        System.out.println("TIPO DE AUTO");
        System.out.println("1- Deportivo");
        System.out.println("2- Familiar");
        System.out.println("3- Utilitario");

        System.out.print("Ingrese opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese marca: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese modelo: ");
        String modelo = sc.nextLine();

        switch (opcion) {

            case 1:

                stock.add(new AutoDeportivo(marca, modelo));

                System.out.println("Auto deportivo agregado");

                break;

            case 2:

                stock.add(new AutoFamiliar(marca, modelo));

                System.out.println("Auto familiar agregado");

                break;

            case 3:

                stock.add(new AutoUtilitario(marca, modelo));

                System.out.println("Auto utilitario agregado");

                break;

            default:

                System.out.println("Opcion invalida");
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas Extras: " + horasExtra);
        
    }
}

