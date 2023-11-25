package org.example;
import java.util.*;

public class Prestamo {

	Libro libro;
	Bibliotecario biliotecario;
	private String fechaInicio;
	private String fechaTermino;
	Usuario usuario;

	public Prestamo(Libro libro, Usuario usuario, Bibliotecario biliotecario, String fechaInicio, String fechaTermino) {
		this.libro = libro;
		this.biliotecario = biliotecario;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.usuario = usuario;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaTermino() {
		return this.fechaTermino;
	}
	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Bibliotecario getBiliotecario() {
		return biliotecario;
	}
	public void setBiliotecario(Bibliotecario biliotecario) {
		this.biliotecario = biliotecario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}