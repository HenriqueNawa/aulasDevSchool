package collections.priorityQueue;


//A classe implementa a Interface Comparable e o que ir� ser ordenado ser� a idade da pessoa, atrav�s do m�todo compareTo
//Ent�o quando utilizamos a PriorityQueue, ela busca esse Comparable que ser� definido a ordem de prioridade
public class Pessoa implements Comparable<Pessoa>{
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public int getIdade() {
		return idade;
	}


	@Override
	public int compareTo(Pessoa p1) {
		return p1.idade > this.idade ? 1 : -1;
	}
	
	@Override
	public String toString() {
		return getNome() + " - " + getIdade()+" anos";
	}
	

}
