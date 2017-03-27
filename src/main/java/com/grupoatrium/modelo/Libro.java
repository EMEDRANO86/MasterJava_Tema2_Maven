/**
 * 
 */
package com.grupoatrium.modelo;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PreDestroy;

/**
 * Clase de definición de Libro
 * @author Elena
 *
 */
public class Libro {

	// Definimos las propiedades de clase
	private String isbn;
	private String titulo;
	private List<Autor> autores;
	private Editorial editorial;
	private int publicacion;
	private double precio;
	private String descripcion;

	// Métodos de Ciclo de Vida
	public void init() {
		System.out.println("Metodo Init");
	}

	public void destroy() {
		System.out.println("Método Destroy");
	}

	//--------------Métodos de acceso y modificación-------------

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public int getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Método de prueba de inyecciones
	@Override
	public String toString() {
		return "- ISBN: " + isbn + "\n- Titulo: " + titulo + "\n- Autores: "
				+ autores.stream().map(Object::toString).collect(Collectors.joining(",")) + "\n- Editorial: "
				+ editorial.toString() + "\n- Publicacion: " + publicacion + "\n- Precio: " + precio;
	}

}
