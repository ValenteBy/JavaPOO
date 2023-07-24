package Slide3_EX1;

public class Conta {

	private String titular;
	private int    numero;
	private double saldo;
	
	Conta(){
	}
	
	Conta(String titular, int numero, double saldo){
		this.titular = titular;
		this.numero  = numero;
		this.saldo   = saldo;
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	public void Saque(int x) {
		if(saldo - x >= 0) {
			this.saldo -= x;
		}
	}
	
	//GETS AND SETS
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}