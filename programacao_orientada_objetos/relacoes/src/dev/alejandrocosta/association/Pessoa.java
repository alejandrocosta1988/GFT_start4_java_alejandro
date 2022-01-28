package dev.alejandrocosta.association;

public class Pessoa {

	private String nome;
	private Endereco endereco;
	
	Pessoa(String nome, Endereco endereco)
	{
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco.getEndereco() + "]";
	}	
	
}
