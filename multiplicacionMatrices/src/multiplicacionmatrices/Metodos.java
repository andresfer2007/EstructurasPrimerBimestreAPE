package multiplicacionmatrices;

import java.util.Scanner;
import java.util.Random;

public class Metodos {

    int[][] matrizA, matrizB, matrizC;
    int filasA, colsA, filasB, colsB;
    Scanner e;

    public Metodos() {
        this.e = new Scanner(System.in);
    }

    public void pedirDimensiones() {
        System.out.print("Filas    de A: ");  filasA = e.nextInt();
        System.out.print("Columnas de A: ");  colsA  = e.nextInt();
        System.out.print("Filas    de B: ");  filasB = e.nextInt();
        System.out.print("Columnas de B: ");  colsB  = e.nextInt();

        if (colsA != filasB) {
            System.out.println("Columnas de A (" + colsA +
                               ") deben ser iguales a filas de B (" + filasB + ").");
            matrizA = matrizB = matrizC = null;
        } else {
            matrizA = new int[filasA][colsA];
            matrizB = new int[filasB][colsB];
            matrizC = new int[filasA][colsB];
            System.out.println("Valido");
        }
    }

    public void cargarTeclado() {
        if (!listo()) return;
        System.out.println("Matriz A");
        for (int i = 0; i < filasA; i++)
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = e.nextInt();
            }
        System.out.println("Matriz B");
        for (int i = 0; i < filasB; i++)
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = e.nextInt();
            }
    }

    public void multiplicar() {
        if (!listo()) return;
        for (int i = 0; i < filasA; i++)
            for (int j = 0; j < colsB; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < colsA; k++)
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
            }
        System.out.println("Multiplicación realizada.");
    }

    public void mostrarMatrices() {
        if (!listo()) return;
        mostrarMatriz(matrizA, "Matriz A (" + filasA + "x" + colsA + ")");
        mostrarMatriz(matrizB, "Matriz B (" + filasB + "x" + colsB + ")");
        mostrarMatriz(matrizC, "Resultado C (" + filasA + "x" + colsB + ")");
    }

    private void mostrarMatriz(int[][] mat, String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++)
                System.out.printf("%4d ", mat[i][j]);
            System.out.println("|");
        }
    }

    private boolean listo() {
        if (matrizA == null) {
            System.out.println("Primero defina dimensiones válidas (opción 1).");
            return false;
        }
        return true;
    }
}