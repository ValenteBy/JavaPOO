package Slide3_EX1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Conta c1 = new Conta("Samuel Valente", 01, 700);
		
		Conta c2 = new Conta("Miguel Valente", 02, 400);
		
		///////////////////////////////////////////////
		
		c1.Depositar(100);
		c2.Saque(200);
		
		System.out.println("Saldo da conta numero " + c1.getNumero() + " : " + c1.getSaldo());
		System.out.println("Saldo da conta numero " + c2.getNumero() + " : " + c2.getSaldo());
		
		c2.Saque(300);
		//Resultado caso ocorra um saldo negativo e seu valor não será mudado
		System.out.println("Saldo da conta numero " + c2.getNumero() + " : " + c2.getSaldo());
		
	}

}
