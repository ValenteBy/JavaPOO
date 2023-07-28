package ListaDeExercicios_1_2;

public class Compra {
	private ItemDeCompra[] item;
	private int tamanho = 0;
	private double valordodesconto;
	
	Compra(){
		setItem(new ItemDeCompra[5]);
	}
	
	public void compraItem(ItemDeCompra produto) {
		if(tamanho < 5) {
			item[tamanho] = produto;
			tamanho++;
	   }else {
		   System.out.println("Não foi possivel adicionar outro item.");
	   }
	}
	
	public double calcularTotalCompra() {
		double valortotal = 0;
		for(int i = 0; i <= tamanho; i++) {
			valortotal += item[i].getPreco() * item[i].getQtd();
		}
		return valortotal;
	}
	
	public double darDesconto(double desconto) {
		setValordodesconto(calcularTotalCompra() * (desconto/10));
		return getValordodesconto();
	}
	
	public double calcularTotalFinal() {
		return calcularTotalCompra() - getValordodesconto();
	}
	
	public void gerarRelatorio() {
		System.out.println("################################## CARRINHO ##################################");
		for(int i = 0; i <= tamanho; i++) {
			System.out.println("Produto: " + item[i].getNome() + "preço: " + item[i].getPreco() + "\n");
	    }
		System.out.println(getValordodesconto());
		System.out.println("Pagamento em dinheiro.");
		System.out.println(calcularTotalFinal());
	}
	//FALTA A MAIN E RECURSO DE ATUALIZAR A FORMA DE DESCONTO DO PROJETO
	
	
	//GETS AND SETS

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public ItemDeCompra[] getItem() {
		return item;
	}

	public void setItem(ItemDeCompra[] item) {
		this.item = item;
	}

	public double getValordodesconto() {
		return valordodesconto;
	}

	public void setValordodesconto(double valordodesconto) {
		this.valordodesconto = valordodesconto;
	}
}
