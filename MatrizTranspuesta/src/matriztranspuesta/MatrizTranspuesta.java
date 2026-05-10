package matriztranspuesta;

public class MatrizTranspuesta {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.llenarMatriz();
        System.out.println("Metriz cuadrada:");
        metodos.mostrarMatriz();
        metodos.transponerDiagonalSecundaria();
        System.out.println("Matriz transpuesta");
        metodos.mostrarMatriz();
        
    }
    
}
