package dev.alejandrocosta.interf;

public class Calculadora implements OperacaoMatematica
{
	
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

}
