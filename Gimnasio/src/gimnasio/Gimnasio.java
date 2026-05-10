// ==================== Gimnasio.java ====================
package gimnasio;

import java.util.Scanner;

public class Gimnasio {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.println("SISTEMA DE ASISTENCIA");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nMENU");
            System.out.println("1. Registrar clientes");
            System.out.println("2. Registrar asistencia semanal");
            System.out.println("3. Mostrar matriz de asistencia");
            System.out.println("4. Calcular clientes con descuento");
            System.out.println("5. Ver lista de descuento");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = e.nextInt();

            switch (opcion) {
                case 1 -> m.cargarClientes();
                case 2 -> m.registrarAsistencia();
                case 3 -> m.mostrarAsistencia();
                case 4 -> m.calcularDescuento();
                case 5 -> m.mostrarListaDescuento();
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Opción no válida.");
            }
        }
        e.close();
    }
}