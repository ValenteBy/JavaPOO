package básico.Slide1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Conta c1 = new Conta();
		c1.numero  = 01;
		c1.titular = "SAMUEL VALENTE";
		c1.saldo   = 500;
		
		Conta c2 = new Conta();
		
		c2.numero  = 02;
		c2.titular = "MIGUEL VALENTE";
		c2.saldo   = 300;
		
		c1.Depositar(100);
		c2.Saque(200);
		
		System.out.println("Saldo da conta numero " + c1.numero + " : " + c1.saldo);
		System.out.println("Saldo da conta numero " + c2.numero + " : " + c2.saldo);
		
		c2.Saque(140);
		//Resultado caso ocorra um saldo negativo e seu valor não será mudado
		System.out.println("Saldo da conta numero " + c2.numero + " : " + c2.saldo);
		
	}

}
