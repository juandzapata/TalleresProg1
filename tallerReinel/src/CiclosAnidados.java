import java.util.Scanner;

public class CiclosAnidados {
    public static void main(String[] args) {
        
        // Declaramos el scanner para recibir inputs del usuario
        Scanner scanner = new Scanner(System.in);

        // Vamos a imprimir un rectangulo
        System.out.println("Dame el alto: ");
        int alto = scanner.nextInt();
        
        System.out.println("Dame el ancho: ");
        int ancho = scanner.nextInt();
    
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
