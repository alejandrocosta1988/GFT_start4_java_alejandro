package dev.alejandrocosta.interf;

public class Calculadora implements OperacaoMatematica
{
	// A classe Calculadora implementa a nterface OperacaoMatematica, então ela TEM que sobrescrever todos os métodos que existem na interface.
	
	@Override
	public void soma(double primeiroNumero, double segundoNumero)
	{
		System.out.println("Soma: " + primeiroNumero + segundoNumero);	
	}
	
	@Override
	public void subtracao(double primeiroNumero, double segundoNumero)
	{
		System.out.println("Subtração: " + primeiroNumero - segundoNumero);
	}
	
	@Override
	public void multiplicacao(double primeiroNumero, double segundoNumero)
	{
		System.out.println("Multiplicação: " + primeiroNumero * segundoNumero);
	}
	
	@Override
	public void divisao(double primeiroNumero, double segundoNumero)
	{
		System.out.println("Divisão: " + primeiroNumero / segundoNumero);
	}

}
