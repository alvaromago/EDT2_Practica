package es.studium.Practica;

public class Cuenta {
		/* Atributos */
		private int numCuenta;
		private int saldo;
		private Cliente cliente;
		/* Constructor vacío */
		public Cuenta()
		{
			numCuenta = 0;
			saldo = 0;
			cliente = new Cliente();
		}
		/* Constructor por parámetros */
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
