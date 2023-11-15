public class Funciones {
    
    public static boolean esTrianguloRectangulo(int lado1, int lado2, int lado3) {
        // Ordenar los lados de menor a mayor utilizando comparaciones
        int ladoMenor1, ladoMenor2, ladoMayor;

        if (lado1 <= lado2 && lado1 <= lado3) {
            ladoMenor1 = lado1;
            if (lado2 <= lado3) {
                ladoMenor2 = lado2;
                ladoMayor = lado3;
            } else {
                ladoMenor2 = lado3;
                ladoMayor = lado2;
            }
        } else if (lado2 <= lado1 && lado2 <= lado3) {
            ladoMenor1 = lado2;
            if (lado1 <= lado3) {
                ladoMenor2 = lado1;
                ladoMayor = lado3;
            } else {
                ladoMenor2 = lado3;
                ladoMayor = lado1;
            }
        } else {
            ladoMenor1 = lado3;
            if (lado1 <= lado2) {
                ladoMenor2 = lado1;
                ladoMayor = lado2;
            } else {
                ladoMenor2 = lado2;
                ladoMayor = lado1;
            }
        }

        // Comprobar el Teorema de Pitágoras
        boolean esRectangulo = (ladoMenor1 * ladoMenor1 + ladoMenor2 * ladoMenor2 == ladoMayor * ladoMayor);

        return esRectangulo;
    }
    
}
