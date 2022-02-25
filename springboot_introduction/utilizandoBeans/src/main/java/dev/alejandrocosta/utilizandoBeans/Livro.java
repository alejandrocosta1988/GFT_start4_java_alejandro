package dev.alejandrocosta.utilizandoBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

	private String nome;
	private String codigo;
	
	@Autowired
	AutorLivro autorLivro; //a anotação Autowired injeta a dependência, o que permite capturar o valor do autor
	
	public AutorLivro getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(AutorLivro autorLivro) {
		this.autorLivro = autorLivro;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void exibir()
	{
		System.out.println(this.nome + " - " + this.codigo);
		autorLivro.exibirAutor();
	}
}
