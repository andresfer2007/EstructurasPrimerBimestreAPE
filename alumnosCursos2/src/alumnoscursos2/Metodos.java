
package alumnoscursos2;

import java.util.Scanner;
import java.util.Random;

public class Metodos {

    int[][]  notas;
    String[] alumnos;
    String[] cursos;
    int numAlumnos, numCursos;
    Scanner e;

    public Metodos() {
        this.e = new Scanner(System.in);
    }

    public void cargarAlumnos() {
        System.out.print("Numero de alumnos: ");
        numAlumnos = e.nextInt();
        alumnos = new String[numAlumnos];
        e.nextLine();
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Nombre alumno " + i + ": ");
            alumnos[i] = e.nextLine();
        }
    }

    public void cargarCursos() {
        System.out.print("Numero de cursos: ");
        numCursos = e.nextInt();
        cursos = new String[numCursos];
        e.nextLine(); 
        for (int i = 0; i < numCursos; i++) {
            System.out.print("Nombre curso " + i + ": ");
            cursos[i] = e.nextLine();
        }
        notas = new int[numAlumnos][numCursos];
    }

    public void cargarNotasAleatorias() {
        if (!inicializado()) return;
        Random r = new Random();
        for (int i = 0; i < numAlumnos; i++)
            for (int j = 0; j < numCursos; j++)
                notas[i][j] = r.nextInt(11);
        System.out.println("Notas cargadas aleatoriamente.");
    }

    public void cargarNotasTeclado() {
        if (!inicializado()) return;
        for (int i = 0; i < numAlumnos; i++)
            for (int j = 0; j < numCursos; j++) {
                System.out.print("Nota de " + alumnos[i] +" en " + cursos[j] + ": ");
                notas[i][j] = e.nextInt();
            }
    }

    public void mostrarAlumnos() {
        if (!inicializado()) return;
        System.out.println("\nAlumnos");
        for (int i = 0; i < numAlumnos; i++)
            System.out.printf("  [%d] %s%n", i, alumnos[i]);
    }

    public void mostrarCursos() {
        if (!inicializado()) return;
        System.out.println("\nCursos");
        for (int j = 0; j < numCursos; j++)
            System.out.printf("  [%d] %s%n", j, cursos[j]);
    }

    public void mostrarNotas() {
        if (!inicializado()) return;
        System.out.println("\nMATRIZ DE NOTAS");

        System.out.printf("%-15s", "");
        for (int j = 0; j < numCursos; j++)
            System.out.printf("%-14s", cursos[j]);
        System.out.println();
        System.out.println("-".repeat(15 + 14 * numCursos));

        for (int i = 0; i < numAlumnos; i++) {
            System.out.printf("%-15s", alumnos[i]);
            for (int j = 0; j < numCursos; j++)
                System.out.printf("%-14d", notas[i][j]);
            System.out.println();
        }
        System.out.println("=====================================\n");
    }

    public void consultarNota() {
        if (!inicializado()) return;
        mostrarAlumnos();
        System.out.print("Ingrese indice del alumno: ");
        int idxAlumno = e.nextInt();

        mostrarCursos();
        System.out.print("Ingrese indice del curso : ");
        int idxCurso = e.nextInt();

        if (idxAlumno < 0 || idxAlumno >= numAlumnos ||
            idxCurso  < 0 || idxCurso  >= numCursos) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        System.out.println("\n " + alumnos[idxAlumno] +
                           " tiene " + notas[idxAlumno][idxCurso] +
                           " en "    + cursos[idxCurso]);
    }

    public void consultarNotaPorNombre() {
        if (!inicializado()) return;
        e.nextLine();
        System.out.print("Nombre del alumno: ");
        String nombreAlumno = e.nextLine();
        System.out.print("Nombre del curso : ");
        String nombreCurso = e.nextLine();

        int idxAlumno = buscarAlumno(nombreAlumno);
        int idxCurso  = buscarCurso(nombreCurso);

        if (idxAlumno == -1) {
            System.out.println("Alumno '" + nombreAlumno + "' no encontrado.");
            return;
        }
        if (idxCurso == -1) {
            System.out.println("Curso '" + nombreCurso + "' no encontrado.");
            return;
        }

        System.out.println("\n" + alumnos[idxAlumno] +
                           " tiene " + notas[idxAlumno][idxCurso] +
                           " en "    + cursos[idxCurso]);
    }

    private int buscarAlumno(String nombre) {
        for (int i = 0; i < numAlumnos; i++)
            if (alumnos[i].equalsIgnoreCase(nombre)) return i;
        return -1;
    }

    private int buscarCurso(String nombre) {
        for (int j = 0; j < numCursos; j++)
            if (cursos[j].equalsIgnoreCase(nombre)) return j;
        return -1;
    }

    private boolean inicializado() {
        if (alumnos == null || cursos == null) {
            System.out.println("Primero cargue alumnos y cursos (opciones 1 y 2).");
            return false;
        }
        return true;
    }
}