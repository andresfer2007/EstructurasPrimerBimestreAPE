package alumnoscursos2;

import java.util.Scanner;

public class AlumnosCursos2 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Metodos m = new Metodos();

        System.out.println("NOTAS DE ALUMNOS POR CURSO");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nMENU");
            System.out.println("1. Cargar alumnos");
            System.out.println("2. Cargar cursos");
            System.out.println("3. Cargar notas aleatorias");
            System.out.println("4. Cargar notas por teclado");
            System.out.println("5. Mostrar matriz de notas");
            System.out.println("6. Consultar nota (por índice)");
            System.out.println("7. Consultar nota (por nombre)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = e.nextInt();

            switch (opcion) {
                case 1 -> m.cargarAlumnos();
                case 2 -> m.cargarCursos();
                case 3 -> m.cargarNotasAleatorias();
                case 4 -> m.cargarNotasTeclado();
                case 5 -> m.mostrarNotas();
                case 6 -> m.consultarNota();
                case 7 -> m.consultarNotaPorNombre();
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Opción no válida.");
            }
        }
        e.close();
    }
}