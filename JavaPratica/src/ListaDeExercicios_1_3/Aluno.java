package ListaDeExercicios_1_3;

public class Aluno {

	private String nome;
	private int    matricula;
	private double nota1;
	private double nota2;
	
	Aluno(String nome, int matricula){
		setNome(nome);
		setMatricula(matricula);
		//setNota1(nota1);
		//setNota2(nota2);
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

  }

