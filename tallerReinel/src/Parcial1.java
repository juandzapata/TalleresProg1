import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Declaramos las constantes
        final int AHORROS = 2000000;
        final int REGALO = 1000000;

        int saldo_total = AHORROS;
        
        int tipo_visa = 0;
        String visa = "";

        // Pedimos el tipo de visa
        System.out.println("¿Qué tipo de visa tiene? (1/2/3): " + "\n1. Turista" + "\n2. Estudiante" + "\n3. Permanente");
        tipo_visa = leer.nextInt();
 
        if(tipo_visa == 1){
            visa = "Turista";
        }else if(tipo_visa == 2){
            visa = "Estudiante";
        }else if(tipo_visa == 3){
            visa = "Permanente";
        }else{
            System.out.println("Tipo de visa no válido");
        }

        // Pedimos los datos
        System.out.print("¿Participo el en el concurso del dado? (1/0): ");
        int concurso = leer.nextInt();

        if (concurso == 1) {
            
            // Generamos un numero aleatorio entre 1 y 6
            int dado = (int) (Math.random() * 6) + 1;
            System.out.println("El dado cayó en: " + dado + " y ganó: " + (dado * 1000000));
            saldo_total += dado * 1000000;

        } else {

            System.out.print("¿Su madre le regaló dinero? (1/0): ");
            int regalo = leer.nextInt();

            System.out.print("Ingrese la cantidad de monitorias realizadas: ");
            int cantidad_monitorias = leer.nextInt();

            saldo_total += (cantidad_monitorias * 50000);

            // Si la mamá le regaló plata, se suma al saldo total
            if (regalo == 1) {

                saldo_total += REGALO;
            }

        }

        // Cerramos el Scanner después de tomar los datos
        leer.close();

        // Mostramos el saldo total
        System.out.println("Su saldo total es: " + saldo_total);

        // Declaramos las variables para la impresión de la tabla
        String ida_vuelta = "";
        int numero_escalas = 0;
        String escala_en = "";
        int precio_vuelo = 0;

        // Creamos una "bandera" para saber si puede viajar y mostrar o no los datos de los vuelos. 
        Boolean puede_viajar = true;


        if (saldo_total < 2500000) {
            System.out.println("No tiene suficiente dinero para viajar");
            puede_viajar = false;

        } else if (saldo_total >= 2500000 && saldo_total < 3000000) {

            ida_vuelta = "Ida";
            numero_escalas = 2;
            escala_en = "Brasil, México DF, Madrid";
            precio_vuelo = 2500000;

        } else if (saldo_total >= 3000000 && saldo_total < 3500000) {
            ida_vuelta = "Ida";
            numero_escalas = 1;
            escala_en = "Brasil, Madrid";
            precio_vuelo = 3000000;

        } else if (saldo_total >= 3500000 && saldo_total < 4200000) {
            ida_vuelta = "Ida";
            numero_escalas = 0;
            escala_en = "Madrid";
            precio_vuelo = 3500000;

        } else if (saldo_total >= 4200000 && saldo_total < 5000000) {
            ida_vuelta = "Ida y vuelta";
            numero_escalas = 2;
            escala_en = "Miami, Lima, Madrid";
            precio_vuelo = 4200000;

        } else if (saldo_total >= 5000000 && saldo_total < 6000000) {
            ida_vuelta = "Ida y vuelta";
            numero_escalas = 1;
            escala_en = "Miami, Madrid";
            precio_vuelo = 5000000;

        } else if (saldo_total >= 6000000) {

            ida_vuelta = "Ida y vuelta";
            numero_escalas = 0;
            escala_en = "Madrid";
            precio_vuelo = 6000000;
        }


        if (puede_viajar) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("| %-14s | %-17s | %-13s | %-15s |\n", "Ida y vuelta", "Numero de escalas", "Escala en",
                    "Precio");
            System.out.println("---------------------------------------------------------------------------");
            System.out.printf("| %-14s | %-17s | %-13s | %-15s |\n", ida_vuelta, numero_escalas, escala_en,
                    precio_vuelo);
        }

        if((visa == "Turista" || visa == "Estudiante" ) && ida_vuelta == "Ida"){
            System.out.println("\n¡¡¡Advertencia!!!! \nNo es recomendable tomar este viaje, ya que es solo de ida y su visa es de " + visa);
            System.out.println("Se recomienda tomar un vuelo que sea de ida y vuelta");
        }
    }
}
