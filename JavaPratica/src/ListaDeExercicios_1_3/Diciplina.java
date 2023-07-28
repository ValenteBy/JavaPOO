package ListaDeExercicios_1_3;

public class Diciplina {

	private int codigo;
	private String nome;
	private int qtdmaxdealunos;
	private Aluno[] alunos;
	private int cont = 0;
	
	Diciplina(int codigo, String nome, int qtd){
		setCodigo(codigo);
		setNome(nome);
		setQtdmaxdealunos(qtd);
		alunos = new Aluno[getQtdmaxdealunos()];
	}

	public void matricularAluno(Aluno a) {
		if(cont < getQtdmaxdealunos()) {
			alunos[cont] = a;
			cont++;
		}else {
			System.out.println("Turma cheia!!!!");
		}
	}
	
	public void atribuirNotas(String nome, double n1, double n2) {
		for(int i = 0; i <= cont; i++) {
			if(alunos[i].getNome().equals(nome)) {
				alunos[i].setNota1(n1);
				alunos[i].setNota2(n2);
			}
		}
	}
	
	public void alterarNotas(String nome, int notaalterar, double n) {
	
		for(int i = 0; i <= cont; i++) {
			if(alunos[i].getNome().equals(nome)) {
				if(notaalterar == 1) {
					alunos[i].setNota1(n);
				}else if(notaalterar == 2) {
					alunos[i].setNota2(n);
				}
			}
		}
	}
	
	//FALTA GERAR ESTATICAS E ADIANTE... E MAIN
	
	//GETS AND SETS
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdmaxdealunos() {
		return qtdmaxdealunos;
	}

	public void setQtdmaxdealunos(int qtdmaxdealunos) {
		this.qtdmaxdealunos = qtdmaxdealunos;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
}
