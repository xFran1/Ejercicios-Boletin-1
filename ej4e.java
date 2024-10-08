import java.util.ArrayList;

public class ej4e {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("aawd");
        array.add("aa23");
        array.add("aa235353");
        reemplazar_segundo_elemento(array, "pena");
        for (String name : array) {
            System.out.println(name);
        }
    }

    public static void reemplazar_segundo_elemento(ArrayList a, String b) {
        a.set(1, b);
    }
}
