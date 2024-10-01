import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ej3e {
    public static void main(String[] args) {
        Movil m1 = new Movil("iPhone 12 Pro Max", 1259);
        Movil m2 = new Movil("Xiaomi Mi 10 Pro", 999);
        Movil m3 = new Movil("Huawei P40 Pro+", 1399);
        Movil m4 = new Movil("Samsung Z Flip 5G", 1550);
        Movil m5 = new Movil("Samsung S20", 1500);
        Movil m6 = new Movil("LG V50 ", 899);
        Movil m7 = new Movil("Xiaomi Mi 10 Pro", 999);
        Movil m8 = new Movil("Huawei P40 Pro+", 1399);
        Movil m9 = new Movil("Samsung Z Flip 5G", 1550);
        Movil m10 = new Movil("Samsung S30", 1300);
        Movil m11 = new Movil("Huawei P50 Pro+", 1399);
        Movil m12 = new Movil("Samsung Z Flip 5G", 1550);

        List<Movil> lista = Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12);

        System.out.println(lista.toString());
        System.out.println("Comparando por precio");
        Collections.sort(lista, Movil.comparadorPrecios());
        System.out.println(lista.toString());

        System.out.println("Comparando por precio y marca");
        Collections.sort(lista, Movil.comparadorPreciosyMarca());
        System.out.println(lista.toString());

    }

}

class Movil {
    private String nombre;
    private int precio;

    public Movil(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public static Comparator<Movil> comparadorPrecios() {
        return Comparator.comparing(Movil::getPrecio);
    }

    public static Comparator<Movil> comparadorPreciosyMarca() {
        return Comparator.comparing(Movil::getPrecio).thenComparing(Movil::getNombre);
    }

    @Override
    public String toString() {
        return nombre + "(" + precio + " euros)\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}