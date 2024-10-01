import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ej3f {

    public static void main(String[] args) {
        Boli boli1 = new Boli("Pilot SuperGrip", 1.0);
        Boli boli2 = new Boli("Pilot G2", 1.3);
        Boli boli3 = new Boli("Bic Cristal", 0.5);
        Boli boli4 = new Boli("Pilot G2", 1.3);

        System.out.println(
                (boli1.equals(boli2)) ? "El boli 1 es igual que el boli 2 " : "El boli 1 no es igual que el boli 2");
        System.out.println(
                (boli2.equals(boli4)) ? "El boli 2 es igual que el boli 4 " : "El boli 2 no es igual que el boli 4");

        List<Boli> lista = Arrays.asList(boli1, boli2, boli3, boli4);
        Collections.sort(lista, Boli.comparadorMarca());
        System.out.println(lista.toString());

    }

}

class Boli {
    private String Titulo;
    private Double Precio;

    public Boli(String titulo, Double precio) {
        Titulo = titulo;
        Precio = precio;
    }

    public static Comparator<Boli> comparadorMarca() {
        return Comparator.comparing(Boli::getTitulo);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Titulo == null) ? 0 : Titulo.hashCode());
        result = prime * result + ((Precio == null) ? 0 : Precio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Boli other = (Boli) obj;
        if (Titulo == null) {
            if (other.Titulo != null)
                return false;
        } else if (!Titulo.equals(other.Titulo))
            return false;
        if (Precio == null) {
            if (other.Precio != null)
                return false;
        } else if (!Precio.equals(other.Precio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Boli [Titulo=" + Titulo + ", Precio=" + Precio + "]\n";
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

}
