package ListaDeExercicios_1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pais pais  = new Pais("Brasil", "DF", 123, 1);
		
		Pais pais2 = new Pais("Brasil", "DF", 111, 2);
		
		Pais Corea = new Pais("Corea", "Capital", 1234.4, 0);
		
		////////
		
	    pais.cadastraFronteira("PaisLouco");
	    pais.retornarCapitalFronteiras();
	    pais2.cadastraFronteira("PaisDoido");
	    pais2.cadastraFronteira("EitaLouca");
	    pais2.retornarCapitalFronteiras();
	    
	    if(pais.equals(pais2)) {
	    	System.out.println("Iguais");
	    }else {
	    	System.out.println("Diferente");
	    }
	    
	    if(Corea.equals(pais)) {
	    	System.out.println("Iguais");
	    }else {
	    	System.out.println("Diferente");
	    }
	}

}
