package alumnoscursos;

import java.util.Scanner;

public class AlumnosCursos {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int alumnos,cursos;
        System.out.println("GESTION DE NOTAS");
        System.out.print("Numero de alumnos por curso: ");
        alumnos = e.nextInt();
        System.out.print("Numero de cursos: ");
        cursos = e.nextInt();

        Metodos m = new Metodos(alumnos, cursos);

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nMENU");
            System.out.println("1)Cargar notas aleatorias");
            System.out.println("2)Cargar notas por teclado");
            System.out.println("3)Mostrar matriz de notas");
            System.out.println("4)Media por alumno");
            System.out.println("5)Media por curso");
            System.out.println("6)Media general");
            System.out.println("0)Salir");
            System.out.print("Opción: ");
            opcion = e.nextInt();

            switch (opcion) {
                case 1 :
                    m.cargarNotasAleatorias(); 
                    m.mostrarNotas(); 
                    break;
                case 2: 
                    m.cargarNotasTeclado();   
                    m.mostrarNotas(); 
                    break;
                case 3:  
                    m.mostrarNotas();
                    break;
                case 4:
                    m.mediaAlumnos();
                    break;
                case 5:
                    m.mediaCursos();
                    break;
                case 6:
                    m.mediaGeneral();
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