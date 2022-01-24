package dev.alejandrocosta;

/**
 * Classe de exemplo para aulas sobre estrutura básica da orientação à objetos
*/
public class Carro 
{
	
	private String cor;
	private String modelo;
	private double capacidadeDoTanque;

	Carro(String cor, String modelo, double capacidadeDoTanque)
	{
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	Carro(String cor, String modelo)
	{
	    this.cor = cor;
	    this.modelo = modelo;
	    this.capacidadeDoTanque = 40;
	}
	
}
