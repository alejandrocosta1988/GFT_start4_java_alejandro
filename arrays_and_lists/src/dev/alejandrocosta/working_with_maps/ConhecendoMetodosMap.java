package dev.alejandrocosta.working_with_maps;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

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
		double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // O método .entrySet() retorna um Set com a implementação da interface Entry. Dessa forma, é possível manipular valores e chaves separadamente.
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry : entries)
		{
			if (entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
		}
		System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente + " km/L");
		System.out.println();
		
		System.out.println("Modelo menos econômico...");
		double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		Set<Map.Entry<String, Double>> newEntry = carrosPopulares.entrySet();
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> modelo : newEntry)
		{
			if (modelo.getValue().equals(consumoMenosEficiente)) modeloMenosEficiente = modelo.getKey();
			System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente + " km/L");
		} // inserindo a impressão dentro do if, se houver mais de um modelo com o mesmo consumo, ambos serão impressos. 
		System.out.println();
		
		System.out.println("Exibindo a soma e a média dos valores...");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		double soma = 0d;
		while (iterator.hasNext()) soma += iterator.next();
		System.out.println("Soma: " + soma + "\nMédia: " + soma/carrosPopulares.size());
		System.out.println();
		
		System.out.println("Removendo modelos com consumo de 15,6 km/L...");
		Iterator<Double> removedor = carrosPopulares.values().iterator();
		while (removedor.hasNext())
		{
			if (removedor.next().equals(15.6)) removedor.remove();
		}
		System.out.println(carrosPopulares);
		System.out.println();
		
		System.out.println("Exibindo os carros na ordem em que foram informados:");
		Map<String, Double> carrosPopularesEmOrdem = new LinkedHashMap<>()
		{{
			put("Gol", 14.4);	
			put("Uno", 15.6);	
			put("Mobi", 16.1);	
			put("HB20", 14.5);	
			put("Kwid", 15.6);	
		}};
		System.out.println(carrosPopularesEmOrdem);
		System.out.println();
		
		System.out.println("Exibindo o dicionário ordenado pelo modelo:");
		Map<String, Double> carrosPopularesEmOrdemDeModelo = new TreeMap<>(carrosPopularesEmOrdem);
		System.out.println(carrosPopularesEmOrdemDeModelo);
		System.out.println();
		
		System.out.println("Apagando o dicionário de carros...");
		carrosPopulares.clear();
		System.out.println(carrosPopulares);
		System.out.println();
		
		System.out.println("Dicionário apagado: " + carrosPopulares.isEmpty());
		System.out.println();
		
		
	} // main

} // ConhecendoMetodosMap
