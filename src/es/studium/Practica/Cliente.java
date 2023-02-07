package es.studium.Practica;

/**
 * Álvaro Martín
 * 
 * @author studi
 */
public class Cliente {
	/* Atributos */
	private String dni;
	private String nombre;
	private String direccion;

	/* Constructor vacío */
	/**
	 * Creación del constructor vacío
	 */
	public Cliente() {
		dni = "";
		nombre = "";
		direccion = "";
	}

	/* Constructor por parámetros */
	/**
	 * Constructor por parámetros
	 * 
	 * @param dni       atributo donde se guardará el dni del cliente
	 * @param nombre    atributo donde se guardará el nombre del cliente
	 * @param direccion atributo donde se guardará la direccion del cliente
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/* Métodos */
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
