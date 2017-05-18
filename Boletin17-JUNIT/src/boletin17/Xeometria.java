package boletin17;

public class Xeometria {
	
	/**
	 * Recibe o valor do lado e calcula o per�metro do cadrado
	 * @param lado
	 * @return
	 */

	int perimetroCadrado(int lado) {

		if (lado <= 0)
			return -1;

		return lado * 4;
	}
	
	/**
	 * Recibe o valor do lado e calcula a �rea do cadrado
	 * @param lado
	 * @return
	 */

	int areaCadrado(int lado) {

		if (lado <= 0)
			return -1;

		return lado * lado;
	}
	
	/**
	 * Recibe os valores dos catetos A e B de un tri�ngulo e calcula a s�a hipotenusa
	 * @param catetoA
	 * @param catetoB
	 * @return
	 */

	double teoremaPitagoras(int catetoA, int catetoB) {
		int h;

		if (catetoA <= 0)
			return -1;
		else if (catetoB <= 0)
			return -1;

		h = (catetoA * catetoA) + (catetoB * catetoB);
		return Math.sqrt(h);

	}
	
	/**
	 * Recibe o valor de un cateto e o valor da hipotenusa e calcula o valor do cateto restante
	 * @param hipotenusa
	 * @param catetoA
	 * @return
	 */

	double teoremaPitagoras(double hipotenusa, double catetoA) {

		double b;

		if (hipotenusa <= catetoA)
			return -1;
		else if (hipotenusa <= 0)
			return -1;
		else if (catetoA <= 0)
			return -1;

		b = (hipotenusa * hipotenusa) - (catetoA * catetoA);
		return Math.sqrt(b);

	}
}
