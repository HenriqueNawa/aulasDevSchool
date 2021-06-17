package tiposVariaveis;

public class VariaveisWrapper {
	public static void main(String []args) {
	/* Com a Classe Wrapper podemos utilizar as variáveis primitivas como sendo objetos,
	e assim temos alguns métodos disponíveis para se trabalhar com estas variáveis 
	como equals(Object) e toString*/
	
	
	//Autoboxing, onde o compilador converte o tipo primitivo para a classe Wrapper
	Boolean maiorDeIdade  = true; 
	
	Byte idade = 25 ;
	
	Short anoDeNascimento = 1995;
	
	Character sexo = 'M'; 
	
	Integer precoFerrari = 1480000; 
	
	Float valorDolar = 5.06f; 
	
	Long telefone = 1299999999L; 
	
	Double pi = 3.14159265358979;
	
	//Pontos Interessantes
	
	//*Comparação entre as variáveis
	Integer n1 = 10;
	Integer n2 = 10;
	//Caso 1
	System.out.println(n1 == n2); //true 
	
	System.out.println(n1.equals(n2)); //true
	
	Integer x = 10;
	Integer y = new Integer(10);
	//Caso 2
	System.out.println(x == y); //false
	
	System.out.println(x.equals(y)); //true
	
	// No caso 1 -> n1 == n2 (true)
	//Estamos com dois objetos, a comparação ocorre entre as referências dos objetos
	//Como foram criados de forma direta, o valor esta sendo reaproveitado do pool de objetos,
	//assim sendo, as variáveis apontam para o mesmo objeto de memória
	
	//Caso 2 -> n1 == n2 (false)
	// Os objetos foram criados de forma diferente,
	//onde: n1, fez-se o autoboxing
	//      n2, criou-se através do construtor
	//Sendo assim, não foi aproveitado o pool de objetos, e sim foi criado um novo objeto em memória
	//Portanto, temos que o resultado da comparação como false
	
	//Conclusão, quando queremos comparar variáveis Wrapper, a melhor escolha é pelo método Equals
	
	//Informações detalhadas retirada do site:  https://blog.cvinicius.com.br/2019/04/analisando-na-pratica-o-uso-de.html
	
	
	}
}
