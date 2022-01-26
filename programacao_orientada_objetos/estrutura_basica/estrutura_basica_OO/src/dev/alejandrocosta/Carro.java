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
	
	public String getModelo()
	{
		return this.modelo; 
	}
	
	public String getCor()
	{
		return this.cor;
	}
	
	public double getCapacidadeDoTanque()
	{
		return this.capacidadeDoTanque;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public void setCor(String cor)
	{
		this.cor = cor;
	}
	
	public void setCapacidadeDoTanque(double valor)
	{
		this.capacidadeDoTanque = valor;
	}
	
	public double calcularValorDoTanqueCheio(double valorDoLitro)
	{
		return this.capacidadeDoTanque * valorDoLitro;
	}
	
}
