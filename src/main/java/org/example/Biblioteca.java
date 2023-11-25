package org.example;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

	Bibliotecario bibliotecario;
	Usuario usuario;
	List<Libro> libros;
	List<Prestamo> prestamos;

	public Biblioteca(Bibliotecario bibliotecario, Usuario usuario, List<Libro> libros) {
		this.bibliotecario = bibliotecario;
		this.usuario = usuario;
		this.libros = libros;
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	public Libro buscarLibro(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(titulo)) {
				return libro;
			}
		}
		return null;
	}
	public List<Libro> obtenerLibroPorAutor(String autor) {
		List<Libro> librosPorAutor = new ArrayList<>();
		for (Libro libro : libros) {
			if (libro.getAutor().equals(autor)) {
				librosPorAutor.add(libro);
			}
		}
		return librosPorAutor;
	}
	public void generarPrestamo(Libro libro, Usuario usuario, Bibliotecario bibliotecario) {

		if (libroExiste(libro.getTitulo())) {

			Prestamo prestamo = new Prestamo(libro,usuario,bibliotecario,"","");
			prestamos.add(prestamo);
		} else {
			System.out.println("El libro no existe en la biblioteca.");
		}
	}
	private boolean libroExiste(String titulo) {
		return buscarLibro(titulo) != null;
	}

}