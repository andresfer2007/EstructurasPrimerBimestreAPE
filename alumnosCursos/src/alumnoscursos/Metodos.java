package alumnoscursos;

import java.util.Scanner;
import java.util.Random;

public class Metodos {

    int[][] notas;
    int alumnos, cursos;
    Scanner e;

    public Metodos(int alumnos, int cursos) {
        this.alumnos = alumnos;
        this.cursos = cursos;
        this.e = new Scanner(System.in);
        this.notas = new int[alumnos][cursos];
    }

    public void cargarNotasAleatorias() {
        Random random = new Random();
        for (int i = 0; i < alumnos; i++)
            for (int j = 0; j < cursos; j++)
                notas[i][j] = random.nextInt(11); // 0 a 10
    }

    public void cargarNotasTeclado() {
        for (int i = 0; i < alumnos; i++)
            for (int j = 0; j < cursos; j++) {
                System.out.print("Nota alumno " + i + ", curso " + j + ": ");
                notas[i][j] = e.nextInt();
            }
    }

    public void mostrarNotas() {
        System.out.println("\n========== NOTAS ==========");

        System.out.print("          ");
        for (int j = 0; j < cursos; j++)
            System.out.printf("C%-3d", j);
        System.out.println("\n          " + "----".repeat(cursos));

        for (int i = 0; i < alumnos; i++) {
            System.out.printf("Alumno %-3d|", i);
            for (int j = 0; j < cursos; j++)
                System.out.printf("%-4d", notas[i][j]);
            System.out.println();
        }
        System.out.println("===========================\n");
    }

    public void mediaAlumnos() {
        System.out.println("Media por alumno");
        for (int i = 0; i < alumnos; i++) {
            double suma = 0;
            for (int j = 0; j < cursos; j++)
                suma += notas[i][j];
            System.out.printf("Alumno %d: %.2f%n", i, suma / cursos);
        }
    }

    public void mediaCursos() {
        System.out.println("Media por curso");
        for (int j = 0; j < cursos; j++) {
            double suma = 0;
            for (int i = 0; i < alumnos; i++)
                suma += notas[i][j];
            System.out.printf("Curso %d: %.2f%n", j, suma / alumnos);
        }
    }

    public void mediaGeneral() {
        double suma = 0;
        for (int i = 0; i < alumnos; i++)
            for (int j = 0; j < cursos; j++)
                suma += notas[i][j];
        System.out.printf("Media general: %.2f%n", suma / (alumnos * cursos));
    }
}