public class Arreglos {
    public static void main(String[] args) {
        
        String[] nombres = {"Pedro", "Juan", "Jose", "Maria", "Juan", "Gabriel"};
        int[] frecuencia = {0, 0, 0, 0, 0};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + (i+1) + ": " + nombres[i]);
            if(nombres[i] == "Juan"){
                frecuencia[1]++;
            }
        }

    
        
        
    }
}
