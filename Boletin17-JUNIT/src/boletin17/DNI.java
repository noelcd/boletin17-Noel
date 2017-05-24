package boletin17;

import java.util.ArrayList;

public class DNI {
	private String dni;

	/**
	 * Comproba que o DNI introducido ten a lonxitude correcta
	 * 
	 * @param numeroLetra
	 * @return
	 */
	public boolean eValido(String numeroLetra) {

		if (dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false) {
			return false;
		}

		numeroLetra = (this.dni.substring(8)).toUpperCase();

		if (soloNumeros() == true && calculaLetra(numeroLetra).equals(numeroLetra)) {
			return true;
		}

		else {
			return false;
		}
	}

	/**
	 * Comproba que só sexan n´meros
	 * 
	 * @return
	 */
	private boolean soloNumeros() {
		int i, j = 0;
		String numero = "";
		String miDNI = "";
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < this.dni.length() - 1; i++) {
			numero = this.dni.substring(i, i + 1);

			for (j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		}

		else {
			return true;
		}
	}

	/**
	 * Calcula a letra correspondente
	 * 
	 * @param numero
	 * @return
	 */

	String calculaLetra(String numero) {

		int miDNI = Integer.parseInt(this.dni.substring(0, 8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];
		return miLetra;
	}

}
