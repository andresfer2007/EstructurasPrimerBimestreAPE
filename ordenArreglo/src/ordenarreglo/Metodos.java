package ordenarreglo;
import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int[] arr;
    int ev;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.arr = new int[100];
        this.ev =0;
    }
    public void ingresarArreglo(){
        do{
            System.out.print("Ingrese la cantidad de elementos del arreglo:");
            ev= entrada.nextInt();
            if(ev<=0 || ev>100){
                System.out.println("La cantidad de elementos debe ser mayor a cero y menor a 100");
            }
        }while(ev<=0 || ev>100);
  
        for(int i=0;i<ev;i++){
            System.out.print("Ingrese el valor "+(i+1)+":");
            arr[i]=entrada.nextInt();
        }
    }
    public void validarOrdenArr(){
        boolean val=true;
        for(int i=0;i<ev-1;i++){
            if(arr[i] > arr[i+1]){       
                val = false;
                break;
            }
        }
        if(val){
            System.out.println("El arreglo esta ordenado de forma ascendente");
        }else{
            System.out.println("El arreglo no esta ordenado de forma ascendente");
        }
    }
    
}
