package Slide2_EX2;

public class Comparavel {

	int numero;
	
	Comparavel(){
		this.numero = 3;
	}
	
	boolean maiorOuIgual(int x) {
		if(x >= numero) {
			return true;
		}
		return false;
	}
	
	boolean menorOuIgual(int x) {
		if(x <= numero) {
			return true;
		}
		return false;
	}
	
	boolean diferenteDe(int x) {
		if(x != numero) {
			return true;
		}
		return false;
	}
	
	
}
