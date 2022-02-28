package desafios_intermediarios;

import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		
		Scanner inputInteger = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		int numeroDeCasosTeste = inputInteger.nextInt();
		int numeroDeCoelhos = 0;
		int numeroDeRatos = 0;
		int numeroDeSapos = 0;
		
		for (int i = 0; i < numeroDeCasosTeste; i++)
		{
			String entradaDoUsuario = inputString.nextLine();
			String[] entradaSeparada = entradaDoUsuario.split(" ");
			
			int numeroDeCobaias = Integer.valueOf(entradaSeparada[0]);
			String tipoDeCobaia = entradaSeparada[1].toUpperCase();
			
			switch (tipoDeCobaia)
			{
			case "C": 
				numeroDeCoelhos += numeroDeCobaias;
				break;
			case "R": 
				numeroDeRatos += numeroDeCobaias;
				break;
			case "S": 
				numeroDeSapos += numeroDeCobaias;
				break;
			} //switch
									
		}// for loop
		
		int total = numeroDeCoelhos + numeroDeRatos + numeroDeSapos;
		double percentualDeCoelhos = numeroDeCoelhos * 100 / total;
		double percentualDeRatos = numeroDeRatos * 100 / total;
		double percentualDeSapos = numeroDeSapos * 100 / total;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + numeroDeCoelhos);
		System.out.println("Total de ratos: " + numeroDeRatos);
		System.out.println("Total de sapos: " + numeroDeSapos);
		System.out.println(String.format("Percentual de coelhos: %.2f", percentualDeCoelhos) + " %");
		System.out.println(String.format("Percentual de ratos: %.2f", percentualDeRatos) + " %");
		System.out.println(String.format("Percentual de sapos: %.2f", percentualDeSapos) + " %");

	} // main

}
