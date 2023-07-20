/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author usuario
 */
public class Profesor extends Persona{

	private String categoria;

	public Profesor() {
		super();
	} // constructor default

	public Profesor(String categoria, String nombre, String apellidos) {
		super(nombre, apellidos);
		this.categoria = categoria;
	} // constructor sobrecargado

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Profesor [categoria=" + categoria + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
} // fin clase
