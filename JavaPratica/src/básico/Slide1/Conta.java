package básico.Slide1;

public class Conta {

	String titular;
	int    numero;
	double saldo;
	
	Conta(){
	}
	
	Conta(String titular, int numero, double saldo){
		this.titular = titular;
		this.numero  = numero;
		this.saldo   = saldo;
	}
	
	void Depositar(int x) {
		this.saldo += x;
	}
	
	void Saque(int x) {
		if(saldo - x >= 0) {
			this.saldo -= x;
		}
	}
}
