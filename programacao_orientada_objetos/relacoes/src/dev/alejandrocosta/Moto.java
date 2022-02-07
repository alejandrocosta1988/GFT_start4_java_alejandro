package dev.alejandrocosta;

public class Moto extends Veiculo
{

	private String marca;
	private String modelo;
	private int cilindradas;
	private int capacidadeDoTanque;
	
	Moto(String proprietario, String placa, String marca, String modelo, int cilindradas, int capacidadeDoTanque)
	{
		super(proprietario, placa);
		this.marca = marca;
		this.modelo = modelo;
		this.cilindradas = cilindradas;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
}
