package Slide2_EX3;

public class Potencia {

	double x;
	double y;
	
	Potencia(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double elevar(){
		double valor_elevado = x;
		for(int i = 1; i < y; i++) {
			valor_elevado *= x;
		}
		return valor_elevado;
	}
}
