package dev.alejandrocosta;

public class CarroTest {

	public static void main(String[] args) {
		
		System.out.println("Criando um objeto da classe Carro...");
        var umCarro = new Carro("branco", "Logan", 45.5);
        System.out.println("Ok");
        
        System.out.println("Criando Carro sem especificar capacidade do tanque...");
        var outroCarro = new Carro("branco", "Logan");
        System.out.println("Ok");

	}

}
