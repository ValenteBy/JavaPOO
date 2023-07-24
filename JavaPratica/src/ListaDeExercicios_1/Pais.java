package ListaDeExercicios_1;

public class Pais {

	private String nome;
	private String capital;
	private double km;
	private String Fronteiras[];
	private int tamanho;
	private int cont = 0;
	
	Pais(String nome, String capital, double km, int tamanho){
		this.nome = nome;
		this.capital = capital;
		this.km = km;
		this.tamanho = tamanho;
		this.Fronteiras = new String[tamanho]; 
	}
	
	public void cadastraFronteira(String string) {
		if(cont <= tamanho) {
			Fronteiras[cont] = string;
			cont++;
		}
	}
	
	public boolean equals (Pais outro) {
		if(nome.equals(outro.getNome()) && capital.equals(outro.getCapital())) {
			return true;
		}else {
			return false;
		}
	}
	
	public void retornarCapitalFronteiras() {
		System.out.println("Sua capital: " + getCapital());
		for(int i = 0; i < cont; i++) {
			System.out.println(Fronteiras[i]);
		}
		return  ;
	}

	//GETS AND SETS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public String[] getFronteiras() {
		return Fronteiras;
	}

	public void setFronteiras(String fronteiras[]) {
		Fronteiras = fronteiras;
	}

}
