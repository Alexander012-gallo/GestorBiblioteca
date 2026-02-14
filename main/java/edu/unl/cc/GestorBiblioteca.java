package edu.unl.cc;

import java.util.ArrayList;

public class GestorBiblioteca {
    ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void eliminarLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                libros.remove(libro);
                break;
            }
        }
    }

    public void buscarLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                System.out.println(libro.getAutor());
            }
        }
    }
}