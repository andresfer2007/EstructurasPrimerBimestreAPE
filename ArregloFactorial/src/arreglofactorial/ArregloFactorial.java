package arreglofactorial;

public class ArregloFactorial {

    public static void main(String[] args) {
        int opc;
        Metodos obj = new Metodos();
        do {            
            opc = obj.menu();
                    
            switch (opc) {
                case 1 -> obj.leerArr();
                case 2 -> {
                    obj.guardarFactorial();
                    obj.mostrarArr(obj.myFac);
                }
                                                   
            }
        } while (opc != 0);
    }
    
}
