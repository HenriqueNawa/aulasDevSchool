package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		//Temos v�rias formas de inicializar uma List
		List <String> listaPresenca = new ArrayList<String>();
		List <String> lista = new ArrayList<>(); // Ou utlizando o Diamont Operator, introduzido no Java1.7
		ArrayList<Float> notas = new ArrayList<>(); // Por�m, � recomend�vel utilizar voltado a interface e n�o a aplica��o
		
		
		//Criar um Array j� definido, que n�o pode-se acrescentar nem retirar elementos, list mut�vel e que permite null
		List<String> nomes = Arrays.asList("Jo�o", "Maria", "Jos�", "Henrique");

		//Neste exemplo, ele ser� uma list imut�vel e n�o permite null
		List<String> nomesCandidatos = List.of("Jo�o", "Maria", "Jos�", "Henrique");
		
		
		//Alguns m�todos �teis
		//M�todo add
		lista.add("Henrique");// Adiciona em ordem
		lista.add(0, "Maria"); //Adiciona em um determinado Index, Onde lista.add(index, valor)
		
		//Para a impress�o dos elementos
		System.out.println(lista); //[Maria, Henrique]
		System.out.println(lista.toString()); //[Maria, Henrique]
		
		//Para substituir elementos
		lista.set(0, "Jo�o"); //.set(index, novoValor)
		System.out.println(lista); //[Jo�o, Henrique]
		
		//Para saber o index de um determinado elemento
		System.out.println(lista.indexOf("Henrique")); // Imprimi "1"
		
		//Para verificar se cont�m um determinado elemento dentro da list
		System.out.println(lista.contains("Henrique")); //Retorna "true"
		
		//Retorna o tamanho da list
		System.out.println(lista.size());
		
		//Mostrar um determinado elemento atrav�s do �ndice
		System.out.println(lista.get(0)); //Imprimi "Jo�o", que � o elemento de index 0
		
		//Remover um elemento
		lista.remove(0); //Removendo pelo Index
		lista.remove("Henrique"); // Tamb�m podemos remover especifindo o elemento
		//Ou para apagar toda a list, temos o m�todo .clear()
		
		//M�todo .isEmpty() -> Ele retorna um boolean(true ou false) se a lista est� ou nao vazia
		
		
		System.out.println(lista);
		

	}

}
