package dev.alejandrocosta.desafios;

import java.io.IOException;
import java.util.Scanner;

public class IntermediarioUm {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	
    	double aumentoAbsoluto = B - A;
    	double aumentoEmPorcentagem = aumentoAbsoluto * 100 / A;
    	
    	System.out.printf("%.2f", aumentoEmPorcentagem);
    	System.out.print("%");
	}

}
