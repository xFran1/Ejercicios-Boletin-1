import java.util.Scanner;

public class ej2b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un tamaño");
        // int tamano = s.nextInt();
        int tamano = 2;
        int contador = 0;

        int[][] matriz1 = new int[tamano][tamano];
        int[][] matriz2 = new int[tamano][tamano];

        do {

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    System.out.println(
                            "Escriba el valor para la fila " + i + " y columna " + j + " de la matriz " + contador);
                    int respuesta = s.nextInt();
                    if (contador == 1) {
                        matriz1[i][j] = respuesta;

                    } else {
                        matriz2[i][j] = respuesta;

                    }
                }
                System.out.println("");
            }

            contador++;
        } while (contador != 2);

        contador = 0;
        int primera_vez = 0;
        int segunda_vez = 0;

        do {

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    if (contador == 0) {
                        if (primera_vez == 0) {
                            System.out.println("Matriz 1:");
                            System.out.println("");
                            primera_vez++;
                        }
                        System.out.print(matriz1[i][j]);

                    } else {
                        if (segunda_vez == 0) {
                            System.out.println("Matriz 2:");
                            System.out.println("");
                            segunda_vez++;
                        }
                        System.out.print(matriz2[i][j]);

                    }
                }
                System.out.println("");
            }

            contador++;
        } while (contador != 2);

    }
}
