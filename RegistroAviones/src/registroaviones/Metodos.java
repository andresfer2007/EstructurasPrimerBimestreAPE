package registroaviones;
import java.util.Scanner;

public class Metodos {

    boolean[][] asientos;
    int n, m;
    Scanner e;

    // true = ocupado, false = vacío
    public Metodos(int n, int m) {
        this.n = n;
        this.m = m;
        this.e = new Scanner(System.in);
        this.asientos = new boolean[n][m]; 
    }

    public void mostrarAsientos() {
        System.out.println("\n========== MAPA DE ASIENTOS ==========");
        System.out.print("      ");
        for (int j = 0; j < m; j++)
            System.out.printf("Col%-3d", j + 1);
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("Fila %d  ", i + 1);
            for (int j = 0; j < m; j++) {
                if (asientos[i][j])
                    System.out.print("[O]   ");
                else
                    System.out.print("[V]   ");
            }
            System.out.println();
        }
        System.out.println("  [V]=Vacío  [O]=Ocupado");
        System.out.println("======================================\n");
    }

    public void ocuparAsiento() {
        int fila = pedirFila();
        int col  = pedirColumna();

        if (asientos[fila][col]) {
            System.out.println("El asiento ya está ocupado.");
        } else {
            asientos[fila][col] = true;
            System.out.println("Asiento [" + (fila+1) + "][" + (col+1) + "] ocupado con exito.");
        }
    }

    public void liberarAsiento() {
        int fila = pedirFila();
        int col  = pedirColumna();

        if (!asientos[fila][col]) {
            System.out.println("El asiento ya está vacio.");
        } else {
            asientos[fila][col] = false;
            System.out.println("Asiento [" + (fila+1) + "][" + (col+1) + "] liberado con exito.");
        }
    }

    public void contarDisponibles() {
        int libres = 0, ocupados = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (asientos[i][j]) ocupados++;
                else libres++;

        System.out.println("Asientos libres  : " + libres);
        System.out.println("Asientos ocupados: " + ocupados);
        System.out.println("Total            : " + (libres + ocupados));
    }

    private int pedirFila() {
        int fila = -1;
        while (fila < 0 || fila >= n) {
            System.out.print("Ingrese fila (1-" + n + "): ");
            fila = e.nextInt() - 1;
            if (fila < 0 || fila >= n)
                System.out.println("Fila invalida, intente de nuevo.");
        }
        return fila;
    }

    private int pedirColumna() {
        int col = -1;
        while (col < 0 || col >= m) {
            System.out.print("Ingrese columna (1-" + m + "): ");
            col = e.nextInt() - 1;
            if (col < 0 || col >= m)
                System.out.println("Columna invalida, intente de nuevo.");
        }
        return col;
    }
}