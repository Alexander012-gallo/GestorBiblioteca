package edu.unl.cc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(12, "Heroes del Cenepa", "Alexander Gallo", 67.80);
        Libro libro2 = new Libro(2, "Pedro Picapiedras", "Juan Pablo", 67.80);
        GestorBiblioteca gestorBiblioteca = new GestorBiblioteca();
        gestorBiblioteca.agregarLibro(libro1);
        gestorBiblioteca.agregarLibro(libro2);
        gestorBiblioteca.mostrarLibros();
        System.out.println("----------------------------");
        gestorBiblioteca.eliminarLibro(2);
        gestorBiblioteca.mostrarLibros();
        System.out.println("----------------------------");
        gestorBiblioteca.agregarLibro(libro2);
        gestorBiblioteca.buscarLibro(12);



    }
}