package dev.alejandrocosta;

public class CarroTest {

	public static void main(String[] args) {
		
		System.out.println("Criando um objeto da classe Carro...");
        var umCarro = new Carro("branco", "Logan", 45.5);
        System.out.println("Ok");
        
        System.out.println("Criando Carro sem especificar capacidade do tanque...");
        var outroCarro = new Carro("branco", "Logan");
        System.out.println("Ok");
        
        System.out.println("Calculando valor para encher o tanque...");
        System.out.println("Valor do tanque cheio: " + umCarro.calcularValorDoTanqueCheio(6.99));
        System.out.println("Ok");
        
        System.out.println("Alterando o atributo modelo do carro...");
        umCarro.setModelo("Fluence");
        System.out.println("Modelo alterado com sucesso");
        
        System.out.println("Apresentando atributo modelo...");
        System.out.println("Modelo: " + umCarro.getModelo());
        System.out.println("Ok");
        
        System.out.println("Alterando o atributo cor do carro...");
        umCarro.setCor("red");
        System.out.println("Cor alterada com sucesso");
        
        System.out.println("Apresentando atributo cor...");
        System.out.println("Cor: " + umCarro.getCor());
        System.out.println("Ok");
        
        System.out.println("Alterando o atributo capacidade do tanque...");
        umCarro.setCapacidadeDoTanque(45);
        System.out.println("Capacidade do tanque alterada com sucesso");
	}

}
