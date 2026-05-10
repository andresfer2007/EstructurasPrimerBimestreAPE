package pkg20estudiantes;
import java.util.Scanner;
import java.util.Random;

public class Metodos {
    Scanner e;
    String[] estudiantes;
    int[][] notas;
    double[] media;
    

    public Metodos() {
        this.e = new Scanner(System.in);
        this.estudiantes = new String[20];
        this.notas = new int[20][4] ;
        this.media=new double[20];
    }

    
    public void ingresarNombres(){
        for(int i=0; i<20;i++){
            System.out.println("Ingresar nombre del alumno "+(i+1)+":");
            estudiantes[i] = e.nextLine();
        }
    }
    public int valorAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
    public void ingresarNotas(){
        for(int i=0; i<20;i++){
            notas[i][0]= valorAleatorio(0,10);
            notas[i][1]= valorAleatorio(0,10);
            notas[i][2]= valorAleatorio(0,10);
            notas[i][3]= valorAleatorio(0,10);
        }
    }
    public void mostrarNotas(){
        for(int i=0; i <20;i++){
            System.out.print("ESTUDIANTE "+(i+1)+": ");
            for(int j =0; j<4;j++){
                System.out.print("["+notas[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    public void mediaAlumno(){
        for(int i=0;i<20;i++){
            media[i]=0;
            for(int j=0; j<4;j++){
                media[i]+=notas[i][j];
            }
            media[i]= (double)media[i]/4;
        }
        
    }
    public void mostrarMedia(){
        for(int i=0;i<20;i++){
            System.out.println("Media Alumno "+(i+1)+":"+media[i]);
        }
    }
    public void mediaAsignatura(){
        double[] mediaAsignatura = new double[4];
        for(int i=0;i<4;i++){
            mediaAsignatura[i]=0;
            for(int j=0;j<20;j++){
                mediaAsignatura[i] += notas[j][i];
            }
            mediaAsignatura[i]= (double)mediaAsignatura[i]/20;
        }
        for(int i=0; i<4;i++){
            System.out.println("Media Asignatura "+(i+1)+":"+mediaAsignatura[i]);
        }
    }
    public void mediaClase(){
        double mediaClase=0;
        for(int i=0;i<20;i++){
            mediaClase += media[i];
        }
        mediaClase= (double)mediaClase/20;
        System.out.println("La media de la clase es "+ mediaClase);
    }
    
    
    
}
