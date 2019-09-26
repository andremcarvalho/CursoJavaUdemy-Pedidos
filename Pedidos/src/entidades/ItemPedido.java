package entidades;

public class ItemPedido {
	
	//atributos
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;
	
	//construtores
	public ItemPedido () {
		
	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	
	//getters e setters
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	//metodos
	
	public double subTotal () {
		return quantidade* preco;
	}
	
	public String toString() {
		return produto.getNome() 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantidade: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	
}
