import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

	public static void main(String[] args) {
		
		//Interface Map, mapeia chave(key) com valor(value) 
		//Map não aceita chaves duplicadas
		
		
		//Inicializando um Map
		//Para adicionar valores ao Map usamos PUT
		Map<Integer, String> pessoa = new HashMap<>(){{
			put(1233456, "Henrique");
			put(222222, "Maria");
			put(333333, "José");
			put(444444, "Ana");
		}};
		
		
		//Métodos Úteis
		//Verificar se existe determinada chave
		System.out.println(pessoa.containsKey(333333)); //Retorna true ou false
		
		//Verificar se existe determinado valor
		System.out.println(pessoa.containsValue("Henrique"));
		
		//Mostrar as chaves do Map
		System.out.println(pessoa.keySet());// Retorna um Set com todas as chaves
		
		//Mostrar os valores do Map
		System.out.println(pessoa.values()); // Retorna uma Collection com todos os Valores do Map
		
		
	}

}
