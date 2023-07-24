package básico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Pessoa p1 = new Pessoa("SAMUEL VALENTE", 20, 700);
		Pessoa p2 = new Pessoa();
		p2.salario = 600;
        
        System.out.println(p2.SalarioBonus());
	}

}
