import java.util.ArrayList;
import java.util.Scanner;

public class ej3g {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Persona> array = new ArrayList<>();

        System.out.println("Nombre:");
        String nombre = s.next();

        System.out.println("Edad");
        int edad = s.nextInt();

        System.out.println("Sexo 1.Hombre 2.Mujer");
        int respuesta = s.nextInt();

        String genero = "Hombre";
        if (respuesta == 2) {
            genero = "Mujer";
        }

        System.out.println("Peso:");
        double peso = s.nextDouble();

        System.out.println("Altura en cm");
        int altura = s.nextInt();
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        if (genero.equals("Mujer")) {
            p1 = new Persona(nombre, edad, sexo.Mujer, peso, altura);
            p2 = new Persona(nombre, edad, sexo.Mujer);

        } else {
            p1 = new Persona(nombre, edad, sexo.Hombre, peso, altura);
            p2 = new Persona(nombre, edad, sexo.Hombre);

        }

        p2.setPeso(85);
        p2.setAltura(177);

        Persona p3 = new Persona();
        p3.setNombre("Felipe");
        p3.setEdad(25);
        p3.setAltura(183);
        p3.setPeso(83);
        p3.setSexo_elegir(sexo.Hombre);

        System.out.println(p1.esMayorDeEdad());
        System.out.println(p2.esMayorDeEdad());
        System.out.println(p3.esMayorDeEdad());

        System.out.println(p1.calcularIMC());

    }

}

enum sexo {
    Hombre,
    Mujer
}

class Persona {
    private String nombre = "Juan";
    private int edad = 20;
    private String dni;
    private sexo sexo_elegir = sexo.Hombre;
    private double peso = 70;
    private int altura = 175;

    public Persona() {
    }

    public Persona(String nombre, int edad, sexo sexo_elegir) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo_elegir = sexo_elegir;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, sexo sexo_elegir, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo_elegir = sexo_elegir;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double calculo = (peso / (altura * altura));
        if (calculo < 20) {
            return -1;
        } else if (calculo >= 20 && calculo <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad > 18) {
            return true;
        }
        return false;
    }

    private String generaDNI() {
        int num_random = (int) (Math.random() * 89999999) + 10000000;

        String dni = num_random + "";

        int modulo = num_random % 23;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        dni = dni + "" + letras.charAt(modulo - 1);

        return dni;

    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo_elegir + ", peso=" + peso + ", altura="
                + altura + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public sexo getSexo_elegir() {
        return sexo_elegir;
    }

    public void setSexo_elegir(sexo sexo_elegir) {
        this.sexo_elegir = sexo_elegir;
    }

}
