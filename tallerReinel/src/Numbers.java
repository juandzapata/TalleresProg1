import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor mínimo del rango: ");
        int min = sc.nextInt();

        System.out.print("Ingrese el valor máximo del rango: ");
        int max = sc.nextInt();

        System.out.println("Números sin dígitos repetidos en el rango [" + min + ", " + max + "]:");
        for (int num = min; num <= max; num++) {
            if (tieneDigitosRepetidos(num)) {
                continue; // -> Salta a la siguiente iteración
            }
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static boolean tieneDigitosRepetidos(int num) {
        int numCopy = num; 
        while (numCopy > 0) {
            int lastDigit = getDigit(numCopy, 0);
            numCopy /= 10; 
            if (contieneDigito(numCopy, lastDigit)) {
                return true;
            }
        }
        return false;
    }

    public static int getDigit(int num, int p) {
        int digit = -1;
        for (int i = 0; i <= p; i++) {
            digit = num % 10;
            num = num / 10;
        }
        return digit;
    }

    public static boolean contieneDigito(int num, int d) {
        while (num > 0) {
            int ultimoDigito = num % 10;
            if (ultimoDigito == d) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
