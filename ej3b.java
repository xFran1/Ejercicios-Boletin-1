public class ej3b {
    public static void main(String[] args) {
        Empresa factura = new Empresa(1, 5, 25);
        Empresa factura1 = new Empresa(2, 6, 23);
        Empresa factura2 = new Empresa(3, 200, 20);
        Empresa factura3 = new Empresa(4, 6, 3);
        Empresa factura4 = new Empresa(5, 200, 4);

        factura.cantidad_vendida_en_litros();
        factura.cantidad_facturada_total();
        factura.facturas_mayor_600();
    }

}

class Empresa {
    private int id_articulo;
    private int cantidad_vendida;
    private double precio_litro;

    private static double facturacion_total;
    private static double facturacion_mayor_600;

    public Empresa(int id_articulo, int cantidad_vendida, double precio_litro) {
        this.id_articulo = id_articulo;
        this.cantidad_vendida = cantidad_vendida;
        this.precio_litro = precio_litro;

        facturacion_total += cantidad_vendida * precio_litro;
        if (cantidad_vendida * precio_litro > 600) {
            facturacion_mayor_600++;
        }
    }

    public void cantidad_vendida_en_litros() {
        System.out.println("La cantidad vendida en litros es: " + this.cantidad_vendida * this.precio_litro);
    }

    public void cantidad_facturada_total() {
        System.out.println("La cantidad facturada total es: " + facturacion_total);
    }

    public void facturas_mayor_600() {
        System.out.println(facturacion_mayor_600 + " facturas son mayores que 600 euros");
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public double getPrecio_litro() {
        return precio_litro;
    }

    public void setPrecio_litro(double precio_litro) {
        this.precio_litro = precio_litro;
    }

    public static double getFacturacion_total() {
        return facturacion_total;
    }

    public static void setFacturacion_total(double facturacion_total) {
        Empresa.facturacion_total = facturacion_total;
    }

}
