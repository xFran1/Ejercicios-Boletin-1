import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ej5 {
    public static void main(String[] args) {
        ArrayList<Supermercado> array_supermercado = new ArrayList<>();

        array_supermercado.add(new Vino("MarcaVino1", "tinto", 12.0, 8.0, 120, 7.6, 700, "Botella_de_cristal",
                LocalDate.of(2025, 7, 1)));

    }

}

interface EsLiquido {
    void setVolumen(int v);

    int getVolumen();

    void setTipoEnvase(String env);

    String getTipoEnvase();
}

interface EsAlimento {
    void setCaducidad(LocalDate fc);

    LocalDate getCaducidad();

    int getCalorias();
}

interface ConDescuento {
    void setDescuento(double des);

    double getDescuento();

    double getPrecioDescuento();
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

class Vino extends Supermercado implements ConDescuento, EsLiquido {

    private String tipo;
    private double grado_alcohol;
    private double precio;
    private double calorias;
    private double descuento;
    private int volumen;
    private String tipo_envase;
    private LocalDate caducidad;
    private double precio_con_descuento;

    public Vino(String marca, String tipo, double grado_alcohol, double precio, double calorias, double descuento,
            int volumen, String tipo_envase, LocalDate caducidad) {
        super(marca);
        this.tipo = tipo;
        this.grado_alcohol = grado_alcohol;
        this.precio = precio;
        this.descuento = descuento;
        this.calorias = grado_alcohol * 10;

        if (descuento != 0) {
            this.precio_con_descuento = precio - ((precio * descuento) / 100);
        } else {
            this.precio_con_descuento = precio;
        }
        this.volumen = volumen;
        this.tipo_envase = tipo_envase;
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGrado_alcohol() {
        return grado_alcohol;
    }

    public void setGrado_alcohol(double grado_alcohol) {
        this.grado_alcohol = grado_alcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    // Metodos interface ConDescuento

    public double getPrecioDescuento() { //
        return precio - descuento;
    }

    public double getDescuento() { //
        return descuento;
    }

    public void setDescuento(double des) { //
        this.descuento = des;
    }

    @Override
    public void setVolumen(int v) {
        this.volumen = v;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipo_envase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipo_envase;
    }

}

enum tipo_cereal {
    avena,
    maiz,
    trigo,
    otros_cereales
}

class Cereales extends Supermercado implements EsAlimento {
    private String marca;
    private Double precio;
    private tipo_cereal tipo;
    private LocalDate caducidad;
    private int calorias;
    private double descuento;
    private double precio_con_descuento;

    public Cereales(String marca, Double precio, tipo_cereal tipo, LocalDate caducidad) {
        super(marca);
        this.precio = precio;
        this.tipo = tipo;
        if (tipo == tipo_cereal.avena) {
            calorias = 5;
        } else if (tipo == tipo_cereal.maiz) {
            calorias = 8;
        } else if (tipo == tipo_cereal.trigo) {
            calorias = 12;
        } else {
            calorias = 15;
        }
        this.descuento = descuento;
        if (descuento != 0) {
            this.precio_con_descuento = precio - ((precio * descuento) / 100);
        } else {
            this.precio_con_descuento = precio;
        }
        this.caducidad = caducidad;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Cereales [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + ", caducidad=" + caducidad
                + ", calorias=" + calorias + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public tipo_cereal getTipo() {
        return tipo;
    }

    public void setTipo(tipo_cereal tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc; // "dd,MM,yyyy"
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }

}

class Detergente extends Supermercado implements ConDescuento {
    private String marca;
    private Double precio;
    private Double descuento;
    private Double precio_con_descuento;
    private int volumen;
    private String tipo;

    public Detergente(String marca, Double precio, Double descuento, int volumen, String tipo) {
        super(marca);
        this.volumen = volumen;
        this.precio = precio;
        this.descuento = descuento;
        this.tipo = tipo;

        if (descuento != 0) {
            this.precio_con_descuento = precio - ((precio * descuento) / 100);
        } else {
            this.precio_con_descuento = precio;
        }
    }

    @Override
    public String toString() {
        return "Detergente [marca=" + marca + ", precio=" + precio + ", descuento=" + descuento
                + ", precio_con_descuento=" + precio_con_descuento + ", volumen=" + volumen + ", tipo=" + tipo
                + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public double getPrecioDescuento() { //
        return precio - descuento;
    }

    public double getDescuento() { //
        return descuento;
    }

    public void setDescuento(double des) { //
        this.descuento = des;
    }

}
