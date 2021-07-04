package collections.priorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
	//Exemplo de Priority Queue (Fila de prioridades)
	//Neste exemplo, temos uma fila ordenada de pessoas por idade decrescente
	public static void main(String[] args) throws InterruptedException {
		Pessoa p1 = new Pessoa("Maria", 60);
		Pessoa p2 = new Pessoa("João", 10);
		Pessoa p3 = new Pessoa("Ana", 20);
		Pessoa p4 = new Pessoa("José", 30);
		
		//Criando-se a PriorityQueue, temos as pessoas estão sendo retiradas pela Idade (maior idade), através da Interface Comparable
		//que está sendo implementada pela classe Pessoa
		Queue<Pessoa> listaPrioridade = new PriorityQueue<>();
		Queue<Pessoa> listaSemPrioridade = new LinkedList<Pessoa>();
		
		//Adicionado a lista com PriorityQueue
		listaPrioridade.add(p1);
		listaPrioridade.add(p2);
		listaPrioridade.add(p3);
		listaPrioridade.add(p4);
		
		//Adicionando as mesmas pessoas e na mesma ordem, porém sem prioridade
		listaSemPrioridade.add(p1);
		listaSemPrioridade.add(p2);
		listaSemPrioridade.add(p3);
		listaSemPrioridade.add(p4);
		
		while (!listaPrioridade.isEmpty()) {
			System.out.println("Prioridade por idade: " + listaPrioridade.toString());
			System.out.println("Pessoa vacinada: " + listaPrioridade.peek());
			System.out.println("Sem prioridade: " + listaSemPrioridade.toString());
			System.out.println("Pessoa vacinada: " + listaSemPrioridade.peek());
			System.out.println("-".repeat(100));
			listaPrioridade.poll();
			listaSemPrioridade.poll();
			
			Thread.sleep(2000);
		}
	}

}
