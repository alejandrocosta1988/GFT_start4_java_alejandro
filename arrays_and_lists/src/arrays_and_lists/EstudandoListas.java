package arrays_and_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EstudandoListas {

	public static void main(String[] args) {
		
        /**Crie uma lista e adicione sete notas de um aluno."
         * Notas [7, 8.5, 9.3, 5, 7, 0, 3.6]
         */
        
        System.out.println("Criando uma lista para armazenar notas de alunos.");
        //Uma das formas possíveis de se criar uma lista. A partir do Java 7, se tornou possível utilizar o diamond operator <>.
        List<Double> notas = new ArrayList<>();
        notas.add(7.0); // Se utilizar apenas 7, o compilador identifica outra assinatura do método.
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d); // É possível utilizar Double adicionando o d no final.
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString()); // imprime a lista inteira
        System.out.println();
        
        System.out.println("Exibindo a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicionando uma nota 8.0 na posição 4.");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println();
        
        System.out.println("Substituindo a nota 5.0 por 6.0:");
        notas.set(3, 6.0);
        System.out.println(notas);
        System.out.println();
        
        System.out.println("Conferindo se a nota 5.0 está dentro da lista: " + notas.contains(5.0));
        System.out.println();
        
        System.out.println("Imprimindo elemento por elemento:");
        for (Double nota : notas) System.out.println(nota);
        System.out.println();

        System.out.println("Exibindo o terceiro elemento adicionado: " + notas.get(2));
        System.out.println();
        
        System.out.println("Exibindo a menor nota: " + Collections.min(notas));
        System.out.println("Exibindo a maior nota: " + Collections.max(notas));
        System.out.println();

        System.out.println("Calculando a soma de todas as notas");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext())
        {
        	    Double next = iterator.next();
        	    soma += next;
        }
        System.out.println("Soma de todas as notas: " + soma);
        System.out.println();
        
        System.out.println("Exibindo a média das notas: " + soma/notas.size());
        System.out.println();
        
        System.out.println("Removendo a nota 0.0");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println();
        
        System.out.println("Removendo a nota na posição 0 (primeira nota)");
        notas.remove(0);
        System.out.println(notas);
        System.out.println();
        
        System.out.println("Removendo as notas abaixo de 7.0");
        Iterator<Double> iteratorRemocao = notas.iterator();
        while (iteratorRemocao.hasNext())
        {
        	    Double next = iteratorRemocao.next();
        	    if (next < 7.0) iteratorRemocao.remove();
        }
        System.out.println(notas);
        System.out.println();
        
        System.out.println("Apagando todas as notas da lista...");
        notas.clear();
        System.out.println(notas);
        System.out.println("A lista está vazia? Resposta: " + notas.isEmpty());
        
        
	}

}
