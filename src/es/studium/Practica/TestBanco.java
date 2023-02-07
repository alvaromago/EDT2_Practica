package es.studium.Practica;

/**
 * Alvaro Martin
 * 
 * @author studi
 *
 */
public class TestBanco {
	/* Constantes extraídas */
	/**
	 * Guardamos la cadena "La cuenta de " en la constante CUENTA
	 */
	private static final String CUENTA = "La cuenta de ";
	/**
	 * Guardamos la cadena " tiene " en la constante TIENE
	 */
	private static final String TIENE = " tiene ";
	/**
	 * Guardamos la cadena "euros." en la constante EUROS
	 */
	private static final String EUROS = "euros.";

	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen clientes del banco */
		Cliente antonio = antonio();
		Cliente beatriz = beatriz();
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = cuentaAntonio(antonio);
		Cuenta cuentaBeatriz = cuentaBeatriz(beatriz);
		/* Variables locales extraídas */
		String nombreAntonio = cuentaAntonio.getCliente().getNombre();
		String nombreBeatriz = cuentaBeatriz.getCliente().getNombre();
		/* Antonio y Beatriz consultan el saldo */
		System.out.println(CUENTA + nombreAntonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);
		/*
		 * Antonio y Beatriz vuelven a consultar su saldo para comprobar que todo ha ido
		 * bien
		 */
		System.out.println(CUENTA + nombreAntonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
		/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
		/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
		System.out.println(CUENTA + nombreAntonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
		/*
		 * Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta
		 */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		System.out.println(CUENTA + nombreAntonio + TIENE + cuentaAntonio.getSaldo() + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + cuentaBeatriz.getSaldo() + EUROS);
	}

	/**
	 * Extraccion del metodo cuentaBeatriz
	 * 
	 * @param beatriz guarda los datos de la cuenta de Beatriz
	 * @return devuelve la creacion de la cuentaBeatriz
	 */
	private static Cuenta cuentaBeatriz(Cliente beatriz) {
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		return cuentaBeatriz;
	}

	/**
	 * Extraccion del metodo cuentaAntonio
	 * 
	 * @param antonio guarda los datos de la cuenta de Antonio
	 * @return devuelve la creacion de la cuentaAntonio
	 */
	private static Cuenta cuentaAntonio(Cliente antonio) {
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		return cuentaAntonio;
	}

	/**
	 * Extraccion del metodo beatriz
	 * 
	 * @return devuelve la creación del cliente beatriz
	 */
	private static Cliente beatriz() {
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		return beatriz;
	}

	/**
	 * Extraccion del metodo antonio
	 * 
	 * @return devuelve la creacion del cliente antonio
	 */
	private static Cliente antonio() {
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		return antonio;
	}
}
