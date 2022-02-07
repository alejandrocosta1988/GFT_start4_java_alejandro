package dev.alejandrocosta.association;

public class TestCliente {

	public static void main(String[] args) {
		
		System.out.println("Criando um cliente...");
		Cliente clienteUm = new Cliente("Alejandro Costa", "Villa Caputti", "Xique-Xique", "Bahia");
		System.out.println("Ok");
		System.out.println(clienteUm);
		
		System.out.println("Testando métodos de pagamento...");
		System.out.println(clienteUm.realizarPagamento());
		System.out.println(clienteUm.realizarPagamento(new Cupom(10)));

	}

}
