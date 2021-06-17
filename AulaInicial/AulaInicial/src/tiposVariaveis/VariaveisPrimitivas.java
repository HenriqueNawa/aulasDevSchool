package tiposVariaveis;

public class VariaveisPrimitivas {
	public static void main(String []args) {
	//Declara��o de vari�vel tipo + nome
	
	boolean maiorDeIdade  = true; //Duas op��es: false ou true, tamanho de 1 bit
	
	byte idade = 25 ;//Valores entre -128 a 127, tamanho de 1 byte
	
	short anoDeNascimento = 1995; //Valores entre -32768 a 32767, tamanho de 2 bytes
	
	char sexo = 'M'; //somente um caracter � poss�vel, tamanho de 2 bytes
	
	int precoFerrari = 1480000; //Valores de -2.147.483.648 a 2.147.483.647,  tamanho de 4 bytes
	
	float valorDolar = 5.06f; //Ponto flutuante de 6 a 7 casas decimais,tamanho de 4 bytes
	
	long telefone = 1299999999L; //Valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807, tamanho de 8 bytes
	
	double pi = 3.14159265358979; //Ponto flutuante com at� 15 casas decimais, tamanho de 8 bytes
	
	System.out.println("Exemplo de boolean = " + maiorDeIdade);
	System.out.println("Exemplo de byte = " + idade);
	System.out.println("Exemplo de short = " + anoDeNascimento);
	System.out.println("Exemplo de char = " + sexo);
	System.out.println("Exemplo de int = " + precoFerrari);
	System.out.println("Exemplo de float = " + valorDolar);
	System.out.println("Exemplo de long  = " + telefone);
	System.out.println("Exemplo de double = " + pi);
	

	}
}
