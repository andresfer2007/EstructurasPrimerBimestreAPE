package pkg20estudiantes;

public class Main {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int op;
        metodos.ingresarNotas();
        metodos.mediaAlumno();
        do{
            System.out.println("Menu");
            System.out.println("1)Mostrar notas");
            System.out.println("2)Media Alumno:");
            System.out.println("3)Media Asignatura:");
            System.out.println("4)Media Clase:");
            System.out.println("0)Salir");
            op= metodos.e.nextInt();
            switch(op){
                case 1:
                    metodos.mostrarNotas();
                    break;
                case 2:
                    metodos.mostrarMedia();
                    break;
                case 3:
                    metodos.mediaAsignatura();
                    break;
                case 4:
                    metodos.mediaClase();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(op!=0);
        
        
    }
    
}
