package dev.alejandrocosta.working_with_maps;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class ConhecendoMetodosMap {

	public static void main(String[] args) {
		
        // Lembrando que Map utiliza keys e values.
		System.out.println("Criando um dicionário que relaciona modelos de carro e valores de consumo...");
		Map<String, Double> carrosPopulares = new HashMap<>()
		{{
			put("Gol", 14.4);	
			put("Uno", 15.6);	
			put("Mobi", 16.1);	
			put("HB20", 14.5);	
			put("Kwid", 15.6);	
		}};
		System.out.println(carrosPopulares.toString());
		System.out.println();
		
		System.out.println("Susbtituindo o valor de consumo do Gol por 15,2 km/L...");
		// Como não é possível se ter chaves repetidas, podemos simplesmente substituir a chave-valor do Gol
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares.toString());
		System.out.println();

		System.out.println("Conferindo se o modelo Tucson está no dicionário:");
		System.out.println(carrosPopulares.containsKey("Tucson"));
		System.out.println();

		System.out.println("Exibindo o consumo do Uno:");
		System.out.println(carrosPopulares.get("Uno"));
		System.out.println();
		
		System.out.println("Exibindo os modelos...");
		System.out.println(carrosPopulares.keySet());
		System.out.println();
		
		System.out.println("Exibindo os valores...");
		System.out.println(carrosPopulares.values());
		System.out.println();
		
		System.out.println("Carro mais econômico...");
		
		System.out.println();
		
		
		
		
		
	} // main

} // ConhecendoMetodosMap
