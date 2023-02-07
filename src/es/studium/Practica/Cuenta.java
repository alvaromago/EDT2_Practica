package es.studium.Practica;

/**
 * �lvaro Mart�n
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

	/* Constructor vac�o */
	/**
	 * Creaci�n del constructor vac�o
	 */
	public Cuenta() {
		numCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	/* Constructor por par�metros */
	/**
	 * Creacion del constructor por par�metros
	 * 
	 * @param numCuenta atributo que guardar� el n�mero de cuenta del cliente
	 * @param saldo     atributo que guardar� el saldo de la cuenta del cliente
	 * @param cliente   atributo que llama a la clase Cliente y sus atributos
	 */
	public Cuenta(int numCuenta, int saldo, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	/* M�todos */
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
