package edu.unl.cc;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrecio() {
        return precio;
    }

    public double setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        return 0.0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
