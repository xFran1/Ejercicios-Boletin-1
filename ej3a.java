public class ej3a {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Fran");
        cuenta1.ingresar(300);
        cuenta1.retirar(2500);
        System.out.println(cuenta1.toString());
    }

}

class Cuenta {

    private String titular;
    private Double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public void ingresar(double dinero_ingresar) {
        if (dinero_ingresar > 0) {
            this.cantidad += dinero_ingresar;
            System.out.println("Se ha introducido " + this.cantidad);
        }

    }

    public void retirar(double dinero_retirar) {
        if (cantidad - dinero_retirar > 0) {
            this.cantidad = cantidad - dinero_retirar;
            System.out.println("Se ha retirado " + dinero_retirar);
        } else {
            this.cantidad = 0.0;
            System.out.println("Se ha retirado " + dinero_retirar + " y la cuenta se ha quedado a cero");
        }
    }

    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

}
