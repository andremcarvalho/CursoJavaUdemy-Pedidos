package entidades;

public class ItemPedido {
	
	//atributos
	private Integer quantidade;
	private Double preco;
	
	//construtores
	public ItemPedido () {
		
	}

	public ItemPedido(Integer quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
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
	
	//metodos
	
	public double subTotal () {
		return quantidade* preco;
	}
	
	
	
	

}
