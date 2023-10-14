public class ModaCalculator {

    public static void main(String[] args) {
        
        int totalNumbers = 50;  // Número inicial de datos aleatorios
        boolean modaFound = false;  // Bandera para verificar si se encontró la moda
        int moda = 0;  // Variable para almacenar la moda

        // Variables para contar las ocurrencias de cada número
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        int count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0;
        int maxCount = 0;  // Variable para llevar la cuenta máxima
        
        // Generar números aleatorios y contar las ocurrencias de cada número
        for (int i = 0; i < totalNumbers; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            switch (randomNumber) {
                case 1: count1++; break;
                case 2: count2++; break;
                case 3: count3++; break;
                case 4: count4++; break;
                case 5: count5++; break;
                case 6: count6++; break;
                case 7: count7++; break;
                case 8: count8++; break;
                case 9: count9++; break;
                case 10: count10++; break;
            }
        }
        
        while (!modaFound) {  // Mientras no se haya encontrado la moda
            
            
            
            // Determinar el número con la mayor cantidad de ocurrencias
            if (count1 > maxCount) { maxCount = count1; moda = 1; }
            if (count2 > maxCount) { maxCount = count2; moda = 2; }
            if (count3 > maxCount) { maxCount = count3; moda = 3; }
            if (count4 > maxCount) { maxCount = count4; moda = 4; }
            if (count5 > maxCount) { maxCount = count5; moda = 5; }
            if (count6 > maxCount) { maxCount = count6; moda = 6; }
            if (count7 > maxCount) { maxCount = count7; moda = 7; }
            if (count8 > maxCount) { maxCount = count8; moda = 8; }
            if (count9 > maxCount) { maxCount = count9; moda = 9; }
            if (count10 > maxCount) { maxCount = count10; moda = 10; }
            
            // Verificar si hay más de una moda
            int modaCount = 0;

            // Verificar cada contador individualmente
            if (count1 == maxCount) modaCount++;
            if (count2 == maxCount) modaCount++;
            if (count3 == maxCount) modaCount++;
            if (count4 == maxCount) modaCount++;
            if (count5 == maxCount) modaCount++;
            if (count6 == maxCount) modaCount++;
            if (count7 == maxCount) modaCount++;
            if (count8 == maxCount) modaCount++;
            if (count9 == maxCount) modaCount++;
            if (count10 == maxCount) modaCount++;
            
            if (modaCount > 1) {

                System.out.println(". Debe haber otra forma de almacenar datos en vez de usar 50 variables.");

                

                for (int i = 0; i < 3; i++) {
                    int randomNumber = (int) (Math.random() * 10) + 1;
                    switch (randomNumber) {
                        case 1: count1++; break;
                        case 2: count2++; break;
                        case 3: count3++; break;
                        case 4: count4++; break;
                        case 5: count5++; break;
                        case 6: count6++; break;
                        case 7: count7++; break;
                        case 8: count8++; break;
                        case 9: count9++; break;
                        case 10: count10++; break;
                    }
                }

            } else {
                // Si se encuentra una moda única, establecer la bandera a true para salir del bucle
                modaFound = true;
            }
        }
        
        // Mostrar la moda
        System.out.println("La moda es " + moda);
    }
}