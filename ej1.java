import java.util.Scanner;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.lang.NumberFormatException;

public class ej1 {
    public static void main(String[] args) {
        cambiaStrings("aeiou r", "eo z w");

        // entreDosFechas();

    }

    public static void cambiaStrings(String a, String b) {
        System.out.println("entra");
        String primero = "";
        String segundo = "";

        for (int i = 0; i < a.length(); i++) {
            boolean valido = true;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    valido = false;
                }
            }
            if (valido == true) {
                primero = primero + a.charAt(i);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            boolean valido = true;
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    valido = false;
                }
            }
            if (valido == true) {
                segundo = segundo + b.charAt(i);
            }
        }

        System.out.println(primero + " primero");
        System.out.println(segundo + " segundo");

    }

    public static void entreDosFechas() {
        Scanner s = new Scanner(System.in);
        // Comprobamos el primer string

        try {

            System.out.println("Introduzca la primera fecha");
            String a = s.next();

            System.out.println("Introduzca la segunda fecha");
            String b = s.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate fecha1 = LocalDate.parse(a, formatter);
            LocalDate fecha2 = LocalDate.parse(b, formatter);

            int dias = 0;

            String fechaPrimera = "";
            String fechaSegunda = "";

            System.out.println("¿Cuál de las 2 fechas será la primera? (Elija 1 o 2)");
            int answer = s.nextInt();

            if (answer == 1) {
                System.out.println("La primera fecha sera " + a);
                System.out.println("La segunda fecha sera " + b);
            } else {
                System.out.println("La primera fecha sera " + b);
                System.out.println("La segunda fecha sera " + a);
            }

            if (fecha1.isBefore(fecha2)) { // Cual es mas vieja
                fechaPrimera = b;
                fechaSegunda = a;
            } else if (fecha2.isBefore(fecha1)) {
                fechaPrimera = a;
                fechaSegunda = b;
            }

            String[] primera = fechaPrimera.split("/");
            String[] segunda = fechaSegunda.split("/");

            int primNum = Integer.parseInt(primera[0]);
            int segNum = Integer.parseInt(segunda[0]);

            dias = primNum - segNum; // Diferencia de dias

            primNum = Integer.parseInt(primera[1]);
            segNum = Integer.parseInt(segunda[1]);

            dias = dias + ((primNum - segNum) * 30); // Diferencia de meses

            primNum = Integer.parseInt(primera[2]);
            segNum = Integer.parseInt(segunda[2]);

            dias = dias + ((primNum - segNum) * 365); // Diferencia de años

            System.out.println(dias);

        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha inválido. Debe ser dd/MM/yyyy");

        }

    }

}
