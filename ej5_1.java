public class ej5_1 {
    public static void main(String[] args) {
        Supermercado s1 = new Supermercado("taw");
    }

}

class Supermercado {
    private static int descuentos;
    private static double dinero_ahorrado;
    private String marca;

    @Override
    public String toString() {
        return "Supermercado [marca=" + marca + "]";
    }

    public Supermercado(String marca) {
        this.marca = marca;
    }

    public static int getDescuentos() {
        return descuentos;
    }

    public static void setDescuentos(int descuentos) {
        Supermercado.descuentos = descuentos;
    }

    public static double getDinero_ahorrado() {
        return dinero_ahorrado;
    }

    public static void setDinero_ahorrado(double dinero_ahorrado) {
        Supermercado.dinero_ahorrado = dinero_ahorrado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
