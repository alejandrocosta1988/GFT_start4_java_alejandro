package dev.alejandrocosta.association;

public class TestPessoa {

	public static void main(String[] args) {
		
        System.out.println("Criando uma nova pessoa...");
        Endereco umEndereco = new Endereco("Rua Quintino Bocaiuva", "Xique-Xique", "Bahia");
        Pessoa umaPessoa = new Pessoa("Alejandro Costa", umEndereco);
        System.out.println("Ok");

	}

}