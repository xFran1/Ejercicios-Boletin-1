public class ej3d {

    public static void main(String[] args) {
        Libro libro1 = new Libro(123145436, "La sombra de Juan", "Juana", 325);
        Libro libro2 = new Libro(1234247436, "El mito de la gallina", "Alejandro", 247);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        libro1.mayor_que(libro2);
    }

}

class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int n_paginas;

    public Libro(int isbn, String titulo, String autor, int n_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
    }

    @Override
    public String toString() {
        return "<<El libro " + titulo + " con ISBN " + isbn + " por el autor " + autor + " tiene " + n_paginas
                + " páginas >>";
    }

    public void mayor_que(Libro b) {
        if (this.n_paginas > b.n_paginas) {
            System.out.println(
                    "El libro " + this.titulo + " tiene más páginas");
        } else {
            System.out.println(
                    "El libro " + b.titulo + " tiene más páginas");
        }
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

}