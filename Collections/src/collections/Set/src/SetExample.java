import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//Interface Set, não aceita valores duplicados e não possui índice 
		
		//HashSet - Características
		// - Não mantém a ordem dos elementos
		// - Possui uma performance melhor que a LinkedHashSet e TreeSet
		// - Permite no máximo um elemento null
		Set<Integer> listaHashSet = new HashSet<>(Arrays.asList(20,2,2,10,5));
		System.out.println(listaHashSet.toString()); // Irá imprimir de forma aleatória, sem duplicado
		
		//Métodos úteis
		//Método para verificar se há um determinado elemento
		System.out.println(listaHashSet.contains(10));// Retorna true ou false
		// Método para verificar máximo e mínimo, podemos utilizar Collections
		System.out.printf("Máximo valor: %d\n", Collections.max(listaHashSet));
		System.out.printf("Mínimo valor: %d\n", Collections.min(listaHashSet));
		//Método para remoção de um elemento
		listaHashSet.remove(5);
		System.out.println(listaHashSet);
		
		
		// LinkedHashSet - Características 
		// - Mantém pela orderm de inserção dos elementos
		// - Desempenho entre a HashSet e a TreeSet
		// - Permite no máximo um elemento null
		Set<Double> notas = new LinkedHashSet<>();
		notas.add(7.3);
		notas.add(5.8);
		notas.add(10.0);
		notas.add(4.5);
		System.out.println(notas); // Imprimi de acordo com a ordem quem foi inserido
		
		
		// TreeSet - Características 
		// - Mantém por padrão a ordem natural dos elementos. Ex. Se for numérico, ele organiza de forma crescente
		// - Pior performance dentre os três
		// - Não permite null
		Set<String> listaNomes = new TreeSet<String>();
		listaNomes.add("Henrique");
		listaNomes.add("Ana");
		listaNomes.add("Pedro");
		listaNomes.add("Maria");
		System.out.println(listaNomes); // Ordena na ordem natural, neste caso ordem alfabética
		listaNomes.clear();//Exclui toda a lista
		System.out.println(listaNomes);
		
		
	}

}
