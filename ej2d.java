import java.util.Scanner;

public class ej2d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe el número " + i);
            array[i] = s.nextInt();
        }

        System.out.println("Escribe un número");
        int num = s.nextInt();

        int posicion = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                posicion = i;

                i = array.length;
            }

        }
        System.out.println("La posicion es " + posicion);
        int num_ultimo = array[array.length - 1];

        for (int i = array.length - 2; i > 0; i--) {
            if (i == posicion) {
                array[i] = num;
            } else {
                array[i] = array[i - 1];

            }
        }
        if (posicion == 0) {
            array[0] = num;
        }
        System.out.println("El array queda asi");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
