package registroaviones;
import java.util.Scanner;

public class RegistroAviones {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n,m,op;
        System.out.println("SISTEMA DE ASIENTOS");
        System.out.print("Ingrese numero de filas: ");
        n = e.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        m = e.nextInt();

        Metodos avion = new Metodos(n, m);

        op = -1;
        while (op != 0) {
            System.out.println("MENU");
            System.out.println("1) Ver mapa de asientos");
            System.out.println("2) Ocupar asiento");
            System.out.println("3) Liberar asiento");
            System.out.println("4) Ver disponibilidad");
            System.out.println("0) Salir");
            
            op = e.nextInt();
            switch (op) {
                case 1:
                    avion.mostrarAsientos();
                    break;
                case 2:
                    avion.ocuparAsiento();  
                    avion.mostrarAsientos(); 
                    break;
                case 3: 
                    avion.liberarAsiento(); 
                    avion.mostrarAsientos(); 
                    break;
                case 4:
                    avion.contarDisponibles();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

    }
}
   
