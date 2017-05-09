
public class Xeometria {

	int perimetroCadrado(int lado) {

		return lado * 4;
	}

	int areaCadrado(int lado) {

		return lado * lado;
	}

	double teoremaPitagoras(int catetoA, int catetoB) {
		int h;
		h = (catetoA * catetoA) + (catetoB * catetoB);
		return Math.sqrt(h);

	}

}
