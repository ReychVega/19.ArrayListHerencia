package Domain;

/**
 *
 * @author usuario
 */
public class Estudiante extends Persona{

	private String numeroCarnet;
	
	public Estudiante() {
		super();
	} // constructor default
	
	public Estudiante(String numeroCarnet) {
		super();
		this.numeroCarnet=numeroCarnet;
	} // constructor sobre cargado
	
	public Estudiante(String numeroCarnet, String nombre, String apellidos) {
		super(nombre, apellidos);
		this.numeroCarnet=numeroCarnet;
	} // costructor sobrecargado	

	public String getNumeroCarnet() {
		return numeroCarnet;
	}

	public void setNumeroCarnet(String numeroCarnet) {
		this.numeroCarnet = numeroCarnet;
	}

	@Override
	public String toString() {
		return "Estudiante [numeroCarnet=" + numeroCarnet + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
} // fin clase
