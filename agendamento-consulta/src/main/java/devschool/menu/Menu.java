package devschool.menu;

import java.util.Scanner;

import devschool.dao.CadastroDao;
import devschool.model.Cadastro;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static int opcao = 0;
	public static String nome;
	public static Long telefone;
	Cadastro cadastro = new Cadastro();
	CadastroDao dao = new CadastroDao();
	
	
	public static int escolha () {
		System.out.println("Cadastro de Usuários: Digite a opção desejada");
		System.out.println("1 - Inserir\n"
				+"2 - Alterar\n"
				+ "3 - Excluir\n"
				+ "4 - Visualizar todos os clientes\n"
				+ "5 - Buscar cliente\n"
				+ "6 - Sair");
		return sc.nextInt();
	}
//	public static void operacao(int opcao) {
//		switch (opcao) {
//		case 1:
//			System.out.println("Nome: ");
//			nome = sc.nextLine();
//			System.out.println("Telefone: ");
//			telefone = sc.nextLong();
//			sc.nextLine();
//			
//			break;
//
//		default:
//			break;
//		}
		
	

}
