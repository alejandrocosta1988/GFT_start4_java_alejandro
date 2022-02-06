package dev.alejandrocosta.interf;

public class Calculadora implements OperacaoMatematica
{
	
	@Override
	public void soma(double primeiroNumero, double segundoNumero)
	{
		System.out.println("Soma: " + primeiroNumero + segundoNumero);	
	}

}
