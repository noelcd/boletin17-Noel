
public class Xeometria {

	int perimetroCadrado(int lado) {

		if (lado <= 0)
			return -1;

		return lado * 4;
	}

	int areaCadrado(int lado) {

		if (lado <= 0)
			return -1;

		return lado * lado;
	}

	double teoremaPitagoras(int catetoA, int catetoB) {
		int h;

		if (catetoA <= 0)
			return -1;
		else if (catetoB <= 0)
			return -1;

		h = (catetoA * catetoA) + (catetoB * catetoB);
		return Math.sqrt(h);

	}

	double teoremaPitagoras(double hipotenusa, double catetoA) {

		double b;
		b = (hipotenusa * hipotenusa) - (catetoA * catetoA);
		return Math.sqrt(b);

	}
}
