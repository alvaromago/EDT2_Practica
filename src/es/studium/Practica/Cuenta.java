package es.studium.Practica;

/**
 * Álvaro Martín
 * 
 * @author studi
 */
public class Cuenta {
	/* Atributos */
	private int numCuenta;
	private int saldo;
	/**
	 * @see Cliente Atributo que referencia a la clase Cliente
	 */
	private Cliente cliente;

	/* Constructor vacío */
	/**
	 * Creación del constructor vacío
	 */
	public Cuenta() {
		numCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	/* Constructor por parámetros */
	/**
	 * Creacion del constructor por parámetros
	 * 
	 * @param numCuenta atributo que guardará el número de cuenta del cliente
	 * @param saldo     atributo que guardará el saldo de la cuenta del cliente
	 * @param cliente   atributo que llama a la clase Cliente y sus atributos
	 */
	public Cuenta(int numCuenta, int saldo, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	/* Métodos */
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
