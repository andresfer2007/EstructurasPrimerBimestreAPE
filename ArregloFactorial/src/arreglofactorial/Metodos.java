package arreglofactorial;
import java.util.Scanner;
public class Metodos {
    Scanner entrada;
    int[] myVec;
    int[] myFac;
    public Metodos(){
        entrada = new Scanner(System.in);
        myVec = new int[10];
        myFac = new int[10];
    }
    
    public int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("[1] Ingresar datos al arreglo: ");
        System.out.println("[2] Mostrar el factorial de cada elemento del arreglo: ");
        System.out.println("[0] Terminar el proceso : ");
        return entrada.nextInt();
    }
    
    //metodo para ingresar datos a un vector
    public void leerArr(){
        for(int i=0; i<myVec.length; i++){
            System.out.println("Ingrese el dato "+(i+1)+": ");
            myVec[i] = entrada.nextInt();
        }
    }
    //calcular el factorial con recursividad
    public int factorial(int num){
        if(num < 0){
            System.out.println("No existe factorial de negativos");
            return 0;
        }
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num - 1);
        
    }
    //metodo para guardar el factorail en otro vector
    public void guardarFactorial(){
        for(int i=0;i<myVec.length; i++){
            myFac[i] = factorial(myVec[i]);
        }
    }
    //metodo para mostrar un arreglo
    public void mostrarArr(int[] arr ){
        for(int i=0; i<arr.length; i++){
            System.out.print("["+arr[i]+"] ");
        }
        System.out.println("");
    }
    
}
