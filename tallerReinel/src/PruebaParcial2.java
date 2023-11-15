public class PruebaParcial2 {

    public static void main(String[] args) {
        System.out.println(getDigit(34567, 2));
    }


    // Devuelve el dígito de num ubicado en la posición p
    public static int getDigit(int num, int p) {
        int digit = -1;
        for (int i = 0; i < p; i++) {
            digit = num % 10;
            num = num / 10;
        }
        return digit;
    }

}
