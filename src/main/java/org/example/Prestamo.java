import java.util.*;

public class Prestamo {

	private String libro;
	private String fechaInicio;
	private String fechaTermino;
	private Usuario usuario;
	private Collection<Bibliotecario> bibliotecario;

	public Prestamo() {
		// TODO - implement Prestamo.Prestamo
		throw new UnsupportedOperationException();
	}

	public String getLibro() {
		return this.libro;
	}

	/**
	 * 
	 * @param libro
	 */
	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaTermino() {
		return this.fechaTermino;
	}

	/**
	 * 
	 * @param fechaTermino
	 */
	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Bibliotecario getBibliotecario() {
		// TODO - implement Prestamo.getBibliotecario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bibliotecario
	 */
	public void setBibliotecario(Bibliotecario bibliotecario) {
		// TODO - implement Prestamo.setBibliotecario
		throw new UnsupportedOperationException();
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}