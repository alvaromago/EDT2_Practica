package es.studium.Practica;

public class TestBanco {
	/* Constantes extraídas */
	private static final String EUROS = "euros.";
	private static final String TIENE = " tiene ";
	private static final String CUENTA = "La cuenta de ";

	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen clientes del banco */
		Cliente antonio = antonio();
		Cliente beatriz = beatriz();
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		/* Variables locales extraídas */
		String nombreAntonio = cuentaAntonio.getCliente().getNombre();
		String nombreBeatriz = cuentaBeatriz.getCliente().getNombre();
		int saldoBeatriz = cuentaBeatriz.getSaldo();
		int saldoAntonio = cuentaAntonio.getSaldo();
		/* Antonio y Beatriz consultan el saldo */
		System.out.println(CUENTA + nombreAntonio + TIENE + saldoAntonio + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + saldoBeatriz + EUROS);
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(saldoBeatriz - 50);
		cuentaAntonio.setSaldo(saldoAntonio + 50);
		/*
		 * Antonio y Beatriz vuelven a consultar su saldo para comprobar que todo ha ido
		 * bien
		 */
		System.out.println(CUENTA + nombreAntonio + TIENE + saldoAntonio + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + saldoBeatriz + EUROS);
		/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
		cuentaAntonio.setSaldo(saldoAntonio + 100);
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(saldoBeatriz - 30);
		/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
		System.out.println(CUENTA + nombreAntonio + TIENE + saldoAntonio + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE + saldoBeatriz + EUROS);
		/*
		 * Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de su cuenta
		 */
		cuentaAntonio.setSaldo(saldoAntonio - 50);
		cuentaBeatriz.setSaldo(saldoBeatriz + 50);
		System.out.println(CUENTA + nombreAntonio + TIENE+ saldoAntonio + EUROS);
		System.out.println(CUENTA + nombreBeatriz + TIENE+ saldoBeatriz + EUROS);
	}

	private static Cliente beatriz()
	{
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		return beatriz;
	}

	private static Cliente antonio()
	{
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		return antonio;
	}
}
