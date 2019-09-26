package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.enums.StatusPedido;
import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Nascimento (DD/MM/YYYY): ");
		Date nascimentoCliente = sdf.parse(sc.next());
		
		//instanciar  informações do cliente
		Cliente cliente = new Cliente (nomeCliente,email,nascimentoCliente);
		
		
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido =new Pedido(new Date(), status , cliente);
		
		System.out.print("Quantos itens para este pedido? ");
		int nItens = sc.nextInt();
		
		for (int i=1; i<=nItens ; i++) {
			System.out.println(" Entre com os dados do #"+i+" item:");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String nomeProduto = sc.next();
			System.out.print("Preço do Produto: ");
			Double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto (nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade =sc.nextInt();
			
			ItemPedido itempedido = new ItemPedido (quantidade, precoProduto, produto);
			
			pedido.adicionaItem(itempedido);
				
		}
		
		
		System.out.println();
		System.out.println("SUMARIO DO PEDIDO:");
		System.out.println(pedido);
		
		
		sc.close();
		
	}

}
