package dev.alejandrocosta.desafios;

import java.util.Scanner;

/**
 * Desafios
 * @author alejandro_costa
 * Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
 * Entrada 
 * Você receberá 1 valor inteiro N, onde N > 0.
 * Saída 
 * Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
 */ 
public class BasicoDois {
    
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int userNumber;
		
		System.out.println("Informe um número inteiro: ");
		userNumber = scan.nextInt();
		
		for (int i = 1; i <= userNumber; i++)
		{
			if (i % 2 == 0) System.out.println(i);
		}
		
	}
}
