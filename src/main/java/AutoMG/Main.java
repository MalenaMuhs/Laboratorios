package AutoMG;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // LISTAS DE AUTOS
        ArrayList<Auto> autosStock = new ArrayList<>();
        ArrayList<Auto> autosVendidos = new ArrayList<>();

// LISTAS DE EMPLEADOS
        ArrayList<Administrativo> administrativos = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

// GERENTE
        Gerente gerente = new Gerente(150000.0, "Carlos", "Gomez", "123", "gerente@gmail.com", "G1", 500000);

// AGREGAR EMPLEADOS
        String seguir = "s";

        while (seguir.equalsIgnoreCase("s")) {

            gerente.agregarEmpleado(administrativos, vendedores);

            System.out.print("Desea agregar otro empleado? s/n: ");
            seguir = sc.nextLine();
        }

// CARGAR AUTOS
        seguir = "s";

        while (seguir.equalsIgnoreCase("s")) {
            int posAdmin = -1;

            while (posAdmin == -1) {

                System.out.print("Ingrese código de administrativo: ");
                String codigo = sc.nextLine();

                for (int i = 0; i < administrativos.size(); i++) {
                    if (administrativos.get(i).getCodigoEmpleado().equalsIgnoreCase(codigo)) {
                        posAdmin = i;
                    }
                }

                if (posAdmin == -1) {
                    System.out.println("Código inválido. Intente nuevamente.");
                }
            }

            administrativos.get(posAdmin).cargarAuto(autosStock);

            System.out.print("Desea agregar otro auto? s/n: ");
            seguir = sc.nextLine();
        }

// VENDER AUTOS
        seguir = "s";

        while (seguir.equalsIgnoreCase("s")) {

            int posVendedor = -1;

            while (posVendedor == -1) {

                System.out.print("Ingrese código de vendedor: ");
                String codigo = sc.nextLine();

                for (int i = 0; i < vendedores.size(); i++) {
                    if (vendedores.get(i).getCodigoEmpleado().equalsIgnoreCase(codigo)) {
                        posVendedor = i;
                        break;
                    }
                }

                if (posVendedor == -1) {
                    System.out.println("Código inválido. Intente nuevamente.");
                }
            }

            vendedores.get(posVendedor).venderAuto(autosStock, autosVendidos);

            System.out.print("Desea vender otro auto? s/n: ");
            seguir = sc.nextLine();
        }

        int[] kms = {10000, 20000, 50000};

// AVANZAR AUTOS EN STOCK
        int i = 0;

        while (i < autosStock.size()) {

            int kmRandom = kms[(int) (Math.random() * 3)];

            autosStock.get(i).avanzarKm(kmRandom);

            i++;
        }

// AVANZAR AUTOS VENDIDOS
        int j = 0;

        while (j < autosVendidos.size()) {

            int kmRandom = kms[(int) (Math.random() * 3)];

            autosVendidos.get(j).avanzarKm(kmRandom);

            j++;
        }
        System.out.println("=== AUTOS EN STOCK ===");
        for (int k = 0; k < autosStock.size(); k++) {
            System.out.println(autosStock.get(k));
        }
         System.out.println("=== AUTOS VENDIDOS ===");
        for (int m = 0; m < autosVendidos.size(); m++) {
            System.out.println(autosStock.get(m));
        }
         System.out.println("=== ADMINISTRATIVOS ===");
        for (int n = 0; n < administrativos.size(); n++) {
            administrativos.get(n).mostrarInformacion();
        }
        System.out.println("=== VENDEDORES ===");
        for (int l = 0; l < vendedores.size(); l++) {
            vendedores.get(l).mostrarInformacion();
        }
        System.out.println("=== GERENTE ===");
        gerente.mostrarInformacion();

    }
}
