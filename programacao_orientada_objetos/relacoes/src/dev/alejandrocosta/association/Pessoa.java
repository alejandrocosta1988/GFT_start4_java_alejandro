package dev.alejandrocosta.association;

public class Pessoa {

	private String nome;
	
	// Associação do tipo: Composição (endereço só existe junto com pessoa. Se pessoa deixa de existir, Endereco também deixa.)
	private Endereco endereco;
	
	Pessoa(String nome, Endereco endereco)
	{
		this.nome = nome;
		this.endereco = endereco;
	}
	
	Pessoa(String nome, String rua, String cidade, String estado)
	{
		this.nome = nome;
		this.endereco = new Endereco(rua, cidade, estado);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco.getEndereco() + "]";
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
}
