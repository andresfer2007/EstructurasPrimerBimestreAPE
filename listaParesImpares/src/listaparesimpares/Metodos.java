package listaparesimpares;
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
    public void sumarParesImpares(){
        int sumaP=0;
        int sumaI=0;
        for(int i=0;i<ev;i++){
            if(arr[i]%2==0){
                sumaP+=arr[i];
            }else{
                sumaI+=arr[i];
            }
        }
        System.out.println("La suma de los numeros pares es: "+sumaP);
        System.out.println("La suma de los numeros impares es: "+sumaI);
    }
    
    
}
