package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nomeCliente = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Nascimento (DD/MM/YYYY): ");
		Date nascimentoCliente = sdf.parse(sc.next());
		
		//instanciar  informações do cliente
		Cliente cliente = new Cliente (nomeCliente,email,nascimentoCliente);
		
		
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		String statusPedido = sc.next();
		System.out.print("Quantos itens para este pedido? ");
		int nItens = sc.nextInt();
		
		for (int i=1; i<=nItens ; i++) {
			
		}
		
		
		
	}

}
