package arreglofibonacci;
import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int cant;
    int[] myFib;
    
    public Metodos(){
        entrada = new Scanner(System.in);
        myFib = new int[100];
    }
    //leer el tamaño del vector
    public void leerTam(){
        do{
            System.out.println("Ingrese la cantidad de elementos que desea de la serie de fibonacci:");
            cant = entrada.nextInt();
            if(cant<=0 || cant >100){
                System.out.println("Cantidad no valida debe ser mayor a 0 y menor a 100");
            }
        }while(cant<=0 || cant >100);
        
    }
    //metodo para sacar el elemento n de la serie con recursividad
    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //metodo para guardar en el vector los elementos de la serie
    public void guardarFibonacci(){
        for(int i = 0; i < cant; i++){
        myFib[i] = fibonacci(i);
    }
    }
    //metodo para mostrar un arreglo
    public void mostrarArr(int[] arr ){
        for(int i=0; i<cant; i++){
            System.out.print("["+arr[i]+"] ");
        }
        System.out.println("");
    }
}
