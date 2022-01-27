package dev.alejandrocosta;
import Veiculo;

public class VeiculoTest {

	public static void main(String[] args) {
		
        System.out.println("Criando um objeto da classe Veiculo...");
        Veiculo umVeiculo = new Veiculo("Alejandro Costa", "NH467J89");
        System.out.println("Ok\n");
        
        System.out.println("Exibindo nome de proprietário de um veículo...");
        System.out.println("Nome do proprietário: " + umVeiculo.getProprietario());
        System.out.println("Ok\n");

	}

}
