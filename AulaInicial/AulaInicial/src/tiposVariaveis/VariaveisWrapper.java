package tiposVariaveis;

public class VariaveisWrapper {
	public static void main(String []args) {
	/* Com a Classe Wrapper podemos utilizar as vari�veis primitivas como sendo objetos,
	e assim temos alguns m�todos dispon�veis para se trabalhar com estas vari�veis 
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
	
	//*Compara��o entre as vari�veis
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
	//Estamos com dois objetos, a compara��o ocorre entre as refer�ncias dos objetos
	//Como foram criados de forma direta, o valor esta sendo reaproveitado do pool de objetos,
	//assim sendo, as vari�veis apontam para o mesmo objeto de mem�ria
	
	//Caso 2 -> n1 == n2 (false)
	// Os objetos foram criados de forma diferente,
	//onde: n1, fez-se o autoboxing
	//      n2, criou-se atrav�s do construtor
	//Sendo assim, n�o foi aproveitado o pool de objetos, e sim foi criado um novo objeto em mem�ria
	//Portanto, temos que o resultado da compara��o como false
	
	//Conclus�o, quando queremos comparar vari�veis Wrapper, a melhor escolha � pelo m�todo Equals
	
	//Informa��es detalhadas retirada do site:  https://blog.cvinicius.com.br/2019/04/analisando-na-pratica-o-uso-de.html
	
	
	}
}
