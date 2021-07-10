package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		//Temos várias formas de inicializar uma List
		List <String> listaPresenca = new ArrayList<String>();
		List <String> lista = new ArrayList<>(); // Ou utlizando o Diamont Operator, introduzido no Java1.7
		ArrayList<Float> notas = new ArrayList<>(); // Porém, é recomendável utilizar voltado a interface e não a aplicação
		
		
		//Criar um Array já definido, que não pode-se acrescentar nem retirar elementos, list mutável e que permite null
		List<String> nomes = Arrays.asList("João", "Maria", "José", "Henrique");

		//Neste exemplo, ele será uma list imutável e não permite null
		List<String> nomesCandidatos = List.of("João", "Maria", "José", "Henrique");
		
		
		//Alguns métodos úteis
		//Método add
		lista.add("Henrique");// Adiciona em ordem
		lista.add(0, "Maria"); //Adiciona em um determinado Index, Onde lista.add(index, valor)
		
		//Para a impressão dos elementos
		System.out.println(lista); //[Maria, Henrique]
		System.out.println(lista.toString()); //[Maria, Henrique]
		
		//Para substituir elementos
		lista.set(0, "João"); //.set(index, novoValor)
		System.out.println(lista); //[João, Henrique]
		
		//Para saber o index de um determinado elemento
		System.out.println(lista.indexOf("Henrique")); // Imprimi "1"
		
		//Para verificar se contém um determinado elemento dentro da list
		System.out.println(lista.contains("Henrique")); //Retorna "true"
		
		//Retorna o tamanho da list
		System.out.println(lista.size());
		
		//Mostrar um determinado elemento através do índice
		System.out.println(lista.get(0)); //Imprimi "João", que é o elemento de index 0
		
		//Remover um elemento
		lista.remove(0); //Removendo pelo Index
		lista.remove("Henrique"); // Também podemos remover especifindo o elemento
		//Ou para apagar toda a list, temos o método .clear()
		
		//Método .isEmpty() -> Ele retorna um boolean(true ou false) se a lista está ou nao vazia
		
		
		System.out.println(lista);
		

	}

}
