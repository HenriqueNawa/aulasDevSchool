package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExemplo {
	
	//Exemplo de utiliza��o da Interface Queue para atendimento de pessoas
	public static void main(String[] args) throws InterruptedException {
		//Criando uma Queue de clientes
		Queue<String> filaClientes = new LinkedList<>();
		
		//Adicionando clientes a Queue
		filaClientes.add("Maria Silva");
		filaClientes.add("Jos� Pereira");
		filaClientes.add("Jo�o Silveira");
		filaClientes.add("Ana Porto");
		filaClientes.add("Henrique Nawa");
		
		//Verifica se a fila de clientes est� vazia
		while (!filaClientes.isEmpty()) { 
			System.out.println("Cliente sendo atendido: " + filaClientes.peek());
			
			//Mostra a lista de clientes no momento
			for (String cliente: filaClientes) { 
				System.out.println(cliente);
			}
			filaClientes.poll(); //Remove o primeiro elemento da fila
			System.out.println("-".repeat(50));
			Thread.sleep(2000); //Delay de 2 segundos para melhor visualiza��o

		}
		System.out.println("Sem clientes na fila!");
		
		
	}

}
