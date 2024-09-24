import java.util.Scanner;

public class ej2a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Cuantas columnas quiere");
        int n = s.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                int numRandom = numAleatorio();
                System.out.print(numRandom + " ");
            }
            System.out.println();
        }

    }

    public static int numAleatorio() {

        int num = (int) (Math.random() * 10);
        return num;
    }
}