package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//atributos
	private String nome;
	private String email;
	private Date nascimento;
	
	//construtores
	public Cliente () {
		
	}

	public Cliente(String nome, String email, Date nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String toString () {
		return nome + " (" +sdf.format(nascimento)+ ") - " + email;
	}
	
}
