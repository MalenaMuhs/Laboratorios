package AutoMG;

import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor extends Empleado {

    private int cantidadVentas = 0;
    final int COMISION_VENTAS = 10000;

    public Vendedor() {
    }

    public Vendedor(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public Vendedor(int cantidadVentas, String nombre, String apellido, String dni, String email, String codigoEmpleado, double sueldoBasico) {
        super(nombre, apellido, dni, email, codigoEmpleado, sueldoBasico);
        this.cantidadVentas = cantidadVentas;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    @Override
    public double calcularSueldo() {
        return super.getSueldoBasico() + (cantidadVentas * COMISION_VENTAS);
    }

    public void venderAuto(ArrayList<Auto> stock,
            ArrayList<Auto> vendidos) {

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

        boolean encontradoStock = false;

        int i = 0;

        while (i < stock.size() && !encontradoStock) {

            boolean tipoCorrecto = false;

            switch (opcion) {

                case 1:

                    if (stock.get(i) instanceof AutoDeportivo) {
                        tipoCorrecto = true;
                    }

                    break;

                case 2:

                    if (stock.get(i) instanceof AutoFamiliar) {
                        tipoCorrecto = true;
                    }

                    break;

                case 3:

                    if (stock.get(i) instanceof AutoUtilitario) {
                        tipoCorrecto = true;
                    }

                    break;
            }

            if (tipoCorrecto && stock.get(i).getMarca().equalsIgnoreCase(marca) && stock.get(i).getModelo().equalsIgnoreCase(modelo)) {

                vendidos.add(stock.get(i));

                stock.remove(i);

                cantidadVentas++;

                System.out.println("Auto vendido correctamente");

                encontradoStock = true;
            }

            i++;
        }

        if (!encontradoStock) {

            boolean encontradoVendido = false;

            int j = 0;

            while (j < vendidos.size() && !encontradoVendido) {

                boolean tipoCorrecto = false;

                switch (opcion) {

                    case 1:

                        if (vendidos.get(j) instanceof AutoDeportivo) {
                            tipoCorrecto = true;
                        }

                        break;

                    case 2:

                        if (vendidos.get(j) instanceof AutoFamiliar) {
                            tipoCorrecto = true;
                        }

                        break;

                    case 3:

                        if (vendidos.get(j) instanceof AutoUtilitario) {
                            tipoCorrecto = true;
                        }

                        break;
                }

                if (tipoCorrecto && vendidos.get(j).getMarca().equalsIgnoreCase(marca)&& vendidos.get(j).getModelo().equalsIgnoreCase(modelo)) {

                    System.out.println("Ese auto ya fue vendido");

                    encontradoVendido = true;
                }

                j++;
            }

            if (!encontradoVendido) {

                System.out.println("Ese auto no existe");
            }
        }
    }

  @Override
  public void mostrarInformacion(){
      super.mostrarInformacion();
      System.out.println("cantidad de ventas: " + cantidadVentas);
      System.out.println("comisio:" + COMISION_VENTAS);
  }
}
