package Slide3_EX1;

public class Banco {
	
	private String nome;
	private Conta[] contas;
	
	public Banco(String nome, int tamanho) {
		this.nome = nome;
		setContas(new Conta[tamanho]);
	}
	
	public Conta procurarConta(int numeroDaContaAtual) {
		for(Conta conta: contas) {
			if(conta != null && conta.getNumero() == numeroDaContaAtual) {
				return conta;
			}
		}
		return null;
	}
	
	public void cadastraConta(int pos, String nome, int numero, double saldo) {
		contas[pos] = new Conta(nome, numero, saldo);
	}
	
	public void transferirEntreContas(int numeroDaContaOrigem, int numeroDaContaDestino, double valor) {
        Conta contaOrigem = procurarConta(numeroDaContaOrigem);
        Conta contaDestino = procurarConta(numeroDaContaDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.Saque(valor);
            contaDestino.Depositar(valor);
        } else {
            System.out.println("Uma das contas não foi encontrada!");
        }
    }
    
	// GETS AND SETS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Conta[] getContas() {
		return contas;
	}


	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

}
