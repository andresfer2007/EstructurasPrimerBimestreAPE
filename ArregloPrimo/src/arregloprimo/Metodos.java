package arregloprimo;
import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int cant;
    int[] myPrimo;
    
    public Metodos(){
        entrada = new Scanner(System.in);
        myPrimo = new int[100];
    }
    //leer el tamaño del vector
    public void leerTam(){
        do{
            System.out.println("Ingrese la cantidad de números primos:");
            cant = entrada.nextInt();
            if(cant<=0 || cant >100){
                System.out.println("Cantidad no valida debe ser mayor a 0 y menor a 100");
            }
        }while(cant<=0 || cant >100);
        
    }
    //divide el número entre varios valores hasta encontrar un divisor (no primo) o llegar al límite(es primo)
    public boolean esPrimo(int num, int divisor){
        if(num < 2){
            return false;
        }
        if(divisor > Math.sqrt(num)){
            return true;
        }
        if(num % divisor == 0){
            return false;
        }
        return esPrimo(num, divisor + 1);
    }

    // generar primos recursivo y los guarda en el arreglo
    public void generarPrimos(int numero, int contador){
        if(contador == cant){
            return;
        }

        if(esPrimo(numero, 2)){
            myPrimo[contador] = numero;
            generarPrimos(numero + 1, contador + 1);
        }else{
            generarPrimos(numero + 1, contador);
        }
    }
    //llamado de la funcion generar primos
    public void guardarPrimo(){
        generarPrimos(2, 0);
    }

    //metodo para mostrar un arreglo
    public void mostrarArr(int[] arr ){
        for(int i=0; i<cant; i++){
            System.out.print("["+arr[i]+"] ");
        }
        System.out.println("");
    }
}
