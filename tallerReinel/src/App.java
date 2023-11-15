import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        //Variables para almacenar los datos del triangulo
        int lado1, lado2, lado3;

        //Variable para indicar si es el triangulo es rectangulo o no gracias a la formula de pitagoras
        boolean esRectangulo;

        //Pedir los datos del triangulo
        System.out.println("Ingrese el lado 1 del triangulo: ");
        lado1 = sc.nextInt();

        System.out.println("Ingrese el lado 2 del triangulo: ");
        lado2 = sc.nextInt();

        System.out.println("Ingrese el lado 3 del triangulo: ");
        lado3 = sc.nextInt();

        //Llamar a la funcion que determina si el triangulo es rectangulo o no
        esRectangulo = Funciones.esTrianguloRectangulo(lado1, lado2, lado3);

        if (esRectangulo) {
            System.out.println("El triangulo es rectangulo");
        } else {
            System.out.println("El triangulo no es rectangulo");
        }

    }

}
