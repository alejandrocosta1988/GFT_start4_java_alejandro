package dev.alejandrocosta.working_with_sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConhecendoMetodosSet {

	// Sets armazenam valores únicos, não duplicados e não possuem índices.
	
	public static void main(String[] args) {
		
        System.out.println("Criando um conjunto ou set:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString()); // Diferenças no resultado em relação a List: os dados não ficaram na ordem em que foram inseridos e valores duplicados só foram inseridos uma única vez.
        System.out.println();
        
        System.out.println("Conferindo se o conjunto contém a nota 5.0 Resultado: " + notas.contains(5d));
        System.out.println("Exibindo a menor nota. Resultado: " + Collections.min(notas));
        System.out.println("Exibindo a maior nota. Resultado: " + Collections.max(notas));
        System.out.println();
        
        System.out.println("Exibindo a soma das notas:");
        // Nesse caso, precisamos utilizar um Iterator
        Iterator<Double> iterator = notas.iterator();
        double somatorio = 0d;
        while (iterator.hasNext())
        {
        	    double elemento = iterator.next();
        	    somatorio += elemento;
        }
        System.out.printf("%.2f", somatorio);
        System.out.println();
        System.out.println("Exibindo a média das notas: " + somatorio/notas.size());
        System.out.println();

        System.out.println("Removendo a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas.toString());
        System.out.println();
        
        System.out.println("Removendo as notas abaixo de 7.0:");
        Iterator<Double> removedorDeNotasBaixas = notas.iterator();
        while (removedorDeNotasBaixas.hasNext())
        {
        	    double notaASerConferida = removedorDeNotasBaixas.next();
        	    if (notaASerConferida < 7.0) removedorDeNotasBaixas.remove();
        }
        System.out.println(notas.toString());
        System.out.println();
        
        System.out.println("Exibindo todas as notas na ordem em que foram inseridas. Criar novo objeto do tipo LinkedHashSet.");
        Set<Double> notasEmOrdem = new LinkedHashSet();
        notasEmOrdem.add(7d);
        notasEmOrdem.add(8.5);
        notasEmOrdem.add(9.3);
        notasEmOrdem.add(5d);
        notasEmOrdem.add(0d);
        notasEmOrdem.add(3.6);
        System.out.println(notasEmOrdem); // Agora as notas foram exibidas em ordem de inserção.
        System.out.println();
        
        System.out.println("Exibindo todas as notas em ordem crescente:");
        // vamos precisar utilizar a implementação TreeSet, porque ela trabalha com a ordem natural dos elementos. Como estamos trabalhando com Double, existe o Comparable.
        Set<Double> notasEmOrdemCrescente = new TreeSet<>(notasEmOrdem);
		System.out.println(notasEmOrdemCrescente); // só funciona porque Double possui Comparable. Se não tivesse, teríamos que criar um Comparable.
		System.out.println();
        
		System.out.println("Apagando todos os elementos do conjunto...");
		notasEmOrdemCrescente.clear();
		System.out.println("Testando se o conjunto está vazio. Resultado: " + notasEmOrdemCrescente.isEmpty());
		
	}

}
