public class ej2c {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0) {
                    System.out.print("1 ");
                } else if (j == 0) {
                    System.out.print("1 ");
                } else if (j == 5) {
                    System.out.print("1 ");
                } else if (i == 7) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }
    }
}
