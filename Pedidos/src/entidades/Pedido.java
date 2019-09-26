package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enums.StatusPedido;

public class Pedido {
	
	//atributos
	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List <ItemPedido> itens = new ArrayList<>();
	
	
	// construtores
	public Pedido () {
		
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	//getters e setters

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getPedidos() {
		return itens;
	}
	
	
	
	// métodos
	
	public void adicionaItem (ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem (ItemPedido item) {
		itens.remove(item);
	}

	

}

