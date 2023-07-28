package ListaDeExercicios_1_2;

public class ItemDeCompra {
	private int    codigo;
	private String nome;
	private double preco;
	private int    qtd;
	
	ItemDeCompra(int codigo, String nome, double preco, int qtd){
		setCodigo(codigo);
		setNome(nome);
		setPreco(preco);
		setQtd(qtd);
	}
	
	//  gets and sets
	
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
