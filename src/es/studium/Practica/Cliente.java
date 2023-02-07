package es.studium.Practica;

/**
 * �lvaro Mart�n
 * 
 * @author studi
 */
public class Cliente {
	/* Atributos */
	private String dni;
	private String nombre;
	private String direccion;

	/* Constructor vac�o */
	/**
	 * Creaci�n del constructor vac�o
	 */
	public Cliente() {
		dni = "";
		nombre = "";
		direccion = "";
	}

	/* Constructor por par�metros */
	/**
	 * Constructor por par�metros
	 * 
	 * @param dni       atributo donde se guardar� el dni del cliente
	 * @param nombre    atributo donde se guardar� el nombre del cliente
	 * @param direccion atributo donde se guardar� la direccion del cliente
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/* M�todos */
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
