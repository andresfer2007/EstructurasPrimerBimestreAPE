package matriztranspuesta;
import java.util.Scanner;
import java.util.Random;

public class Metodos {
    Scanner e;
    int[][] matriz;
    int n;
    public Metodos(){
        this.e = new Scanner(System.in);
        System.out.println("Ingrese el tamaño:");
        this.n=e.nextInt();
        this.matriz = new int[n][n];
        
    }
    public int valorAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
    public void llenarMatriz(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j]=valorAleatorio(1,99);
            }
        }
    }
    public void mostrarMatriz(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
    public void transponerDiagonalSecundaria() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {  // triángulo inferior de la secundaria
                int temp = matriz[i][j];
                matriz[i][j] = matriz[n-1-j][n-1-i];
                matriz[n-1-j][n-1-i] = temp;
            }
        }
    }
}
