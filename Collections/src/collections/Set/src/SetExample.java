import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//Interface Set, n�o aceita valores duplicados e n�o possui �ndice 
		
		//HashSet - Caracter�sticas
		// - N�o mant�m a ordem dos elementos
		// - Possui uma performance melhor que a LinkedHashSet e TreeSet
		// - Permite no m�ximo um elemento null
		Set<Integer> listaHashSet = new HashSet<>(Arrays.asList(20,2,2,10,5));
		System.out.println(listaHashSet.toString()); // Ir� imprimir de forma aleat�ria, sem duplicado
		
		//M�todos �teis
		//M�todo para verificar se h� um determinado elemento
		System.out.println(listaHashSet.contains(10));// Retorna true ou false
		// M�todo para verificar m�ximo e m�nimo, podemos utilizar Collections
		System.out.printf("M�ximo valor: %d\n", Collections.max(listaHashSet));
		System.out.printf("M�nimo valor: %d\n", Collections.min(listaHashSet));
		//M�todo para remo��o de um elemento
		listaHashSet.remove(5);
		System.out.println(listaHashSet);
		
		
		// LinkedHashSet - Caracter�sticas 
		// - Mant�m pela orderm de inser��o dos elementos
		// - Desempenho entre a HashSet e a TreeSet
		// - Permite no m�ximo um elemento null
		Set<Double> notas = new LinkedHashSet<>();
		notas.add(7.3);
		notas.add(5.8);
		notas.add(10.0);
		notas.add(4.5);
		System.out.println(notas); // Imprimi de acordo com a ordem quem foi inserido
		
		
		// TreeSet - Caracter�sticas 
		// - Mant�m por padr�o a ordem natural dos elementos. Ex. Se for num�rico, ele organiza de forma crescente
		// - Pior performance dentre os tr�s
		// - N�o permite null
		Set<String> listaNomes = new TreeSet<String>();
		listaNomes.add("Henrique");
		listaNomes.add("Ana");
		listaNomes.add("Pedro");
		listaNomes.add("Maria");
		System.out.println(listaNomes); // Ordena na ordem natural, neste caso ordem alfab�tica
		listaNomes.clear();//Exclui toda a lista
		System.out.println(listaNomes);
		
		
	}

}
