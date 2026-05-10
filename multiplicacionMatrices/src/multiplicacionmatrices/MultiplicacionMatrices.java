package multiplicacionmatrices;

import java.util.Scanner;

public class MultiplicacionMatrices {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.println("MULTIPLICACIÓN DE MATRICES");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nMENU");
            System.out.println("1)Definir dimensiones");
            System.out.println("2)Ingresar matrices");
            System.out.println("3)Multiplicar y mostrar");
            System.out.println("0)Salir");
            System.out.print("Opción: ");
            opcion = e.nextInt();

            switch (opcion) {
                case 1:
                    m.pedirDimensiones();
                    break;
                case 2:
                    m.cargarTeclado();
                    break;
                case 3:
                    m.multiplicar(); 
                    m.mostrarMatrices(); 
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        e.close();
    }
}