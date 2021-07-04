package collections.priorityQueue;


//A classe implementa a Interface Comparable e o que irá ser ordenado será a idade da pessoa, através do método compareTo
//Então quando utilizamos a PriorityQueue, ela busca esse Comparable que será definido a ordem de prioridade
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
