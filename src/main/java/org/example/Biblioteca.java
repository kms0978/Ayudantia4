import java.util.*;

public class Biblioteca {

	Collection<Prestamo> libro;
	private List<Prestamo> prestamos;

	/**
	 * 
	 * @param libro
	 */
	public void agregarLibro(String libro) {
		// TODO - implement Biblioteca.agregarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entrada
	 */
	public libro buscarLibro(String entrada) {
		// TODO - implement Biblioteca.buscarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param autor
	 */
	public List<Libro> obtenerLibroPorAutor(String autor) {
		// TODO - implement Biblioteca.obtenerLibroPorAutor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bibliotecario
	 * @param usuario
	 * @param libro
	 * @param fechaInicio
	 * @param fechaTermino
	 */
	public void generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, Prestamo libro, Prestamo fechaInicio, Prestamo fechaTermino) {
		// TODO - implement Biblioteca.generarPrestamo
		throw new UnsupportedOperationException();
	}

	public List<Prestamo> getPrestamos() {
		return this.prestamos;
	}

	/**
	 * 
	 * @param prestamos
	 */
	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	/**
	 * 
	 * @param libro
	 */
	private boolean libroExiste(Libro libro) {
		// TODO - implement Biblioteca.libroExiste
		throw new UnsupportedOperationException();
	}

}