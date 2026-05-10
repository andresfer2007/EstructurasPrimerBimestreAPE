package gimnasio;

import java.util.Scanner;

public class Metodos {

    String[] clientes;
    boolean[][] asistencia;   
    String[] descuento;  
    String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    int numClientes;
    int totalDescuento;
    Scanner e;

    public Metodos() {
        this.e = new Scanner(System.in);
    }

    public void cargarClientes() {
        System.out.print("Numero de clientes inscritos: ");
        numClientes = e.nextInt();
        e.nextLine();
        clientes    = new String[numClientes];
        asistencia  = new boolean[numClientes][6]; 
        descuento   = new String[numClientes];

        for (int i = 0; i < numClientes; i++) {
            System.out.print("Nombre cliente " + (i + 1) + ": ");
            clientes[i] = e.nextLine();
        }
        System.out.println("Clientes registrados correctamente.");
    }

    // ---- Registrar asistencia por día ----
    public void registrarAsistencia() {
        if (!listo()) return;
        System.out.println("\nRegistrar asistencia (1=Asistió / 0=No asistió)");

        for (int j = 0; j < 6; j++) {
            System.out.println("\n " + dias[j]);
            for (int i = 0; i < numClientes; i++) {
                int valor = -1;
                while (valor != 0 && valor != 1) {
                    System.out.print("  " + clientes[i] + ": ");
                    valor = e.nextInt();
                    if (valor != 0 && valor != 1)
                        System.out.println("Ingrese solo 1 o 0.");
                }
                asistencia[i][j] = (valor == 1);
            }
        }
        System.out.println("Asistencia registrada.");
    }

    public void mostrarAsistencia() {
        if (!listo()) return;
        System.out.println("\n========== ASISTENCIA SEMANAL ==========");
        System.out.printf("%-18s", "Cliente");
        for (String dia : dias)
            System.out.printf("%-11s", dia);
        System.out.println("Total");
        System.out.println("-".repeat(18 + 11 * 6 + 5));

        for (int i = 0; i < numClientes; i++) {
            System.out.printf("%-18s", clientes[i]);
            int total = 0;
            for (int j = 0; j < 6; j++) {
                System.out.printf("%-11s", asistencia[i][j] ? "✔" : "-");
                if (asistencia[i][j]) total++;
            }
            System.out.println(total);
        }
        System.out.println("=========================================\n");
    }

    public void calcularDescuento() {
        if (!listo()) return;
        totalDescuento = 0;

        System.out.println("\n===== CLIENTES CON 20% DE DESCUENTO =====");
        System.out.println("  (Asistieron al menos 3 días en la semana)");
        System.out.println("-".repeat(42));

        for (int i = 0; i < numClientes; i++) {
            int diasAsistidos = 0;
            for (int j = 0; j < 6; j++)
                if (asistencia[i][j]) diasAsistidos++;

            if (diasAsistidos >= 3) {
                descuento[totalDescuento++] = clientes[i];
                System.out.printf("  ✔ %-20s → %d días asistidos%n",
                                  clientes[i], diasAsistidos);
            }
        }

        if (totalDescuento == 0)
            System.out.println("  Ningún cliente califica para el descuento.");

        System.out.println("-".repeat(42));
        System.out.println("  Total con descuento: " + totalDescuento +" de " + numClientes + " clientes.");
        System.out.println("==========================================\n");
    }

    public void mostrarListaDescuento() {
        if (descuento == null || totalDescuento == 0) {
            System.out.println("Primero calcule los descuentos (opción 4).");
            return;
        }
        System.out.println("\nLista de clientes con 20% descuento ---");
        for (int i = 0; i < totalDescuento; i++)
            System.out.println("  " + (i + 1) + ". " + descuento[i]);
        System.out.println();
    }

    private boolean listo() {
        if (clientes == null) {
            System.out.println("Primero cargue los clientes (opción 1).");
            return false;
        }
        return true;
    }
}