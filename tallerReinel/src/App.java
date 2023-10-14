import java.util.Scanner;
import java.util.Random;

public class App {    
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        
        
        Random aleatorio = new Random();
        int aleatorio_entero = aleatorio.nextInt(10);
        leer.close();

        int v0 = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;

        
        for (int i = 0; i < aleatorio_entero; i++) {
            int aleatorio_entero_2 = aleatorio.nextInt(5);
            
            if (aleatorio_entero_2 == 0) {
                v0++;
            } else if (aleatorio_entero_2 == 1) {
                v1++;
            } else if (aleatorio_entero_2 == 2) {
                v2++;
            } else if (aleatorio_entero_2 == 3) {
                v3++;
            } else if (aleatorio_entero_2 == 4) {
                v4++;
            }else if(aleatorio_entero_2 == 5){
                v5++;
            }
    
        }
        
        // Arreglo
        
        String[] nombres = {"Pedro", "Juan", "Jose", "Maria", "Juan", "Gabriel"};
        
        System.out.println("Nombre 1: " + nombres[0]);
        System.out.println("Nombre 2: " + nombres[1]);
        System.out.println("Nombre 3: " + nombres[2]);
        System.out.println("Nombre 4: " + nombres[3]);
        System.out.println("Nombre 5: " + nombres[4]);
        System.out.println("Nombre 6: " + nombres[5]);



        System.out.println("La longitud del arreglo es: " + nombres.length);


        
        

    }
    
}
