import java.util.Scanner;

import devschool.dao.CadastroDao;
import devschool.menu.Menu;
import devschool.model.Cadastro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroDao dao = new CadastroDao();
		
		Cadastro cadastro = new Cadastro();
		
		int opcao = Menu.escolha();
		int codigo;
		String nome;
		Long telefone;
		
		while (opcao != 6) {
			
			switch (opcao) {
			case 1:
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Telefone: ");
				telefone = sc.nextLong();
				sc.nextLine();
				cadastro.setRazao_nome(nome);
				cadastro.setTelefone(telefone);
				dao.incluir(cadastro);
				opcao = Menu.escolha();
				break;
			case 2:
				System.out.println("Código do cliente: ");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Telefone: ");
				telefone = sc.nextLong();
				sc.nextLine();
				cadastro.setCodigo(codigo);
				cadastro.setRazao_nome(nome);
				cadastro.setTelefone(telefone);
				dao.alterar(cadastro);
				opcao = Menu.escolha();
				break;
			case 3:
				System.out.println("Código do cliente: ");
				codigo = sc.nextInt();
				sc.nextLine();
				dao.excluir(codigo);
				opcao = Menu.escolha();
				break;
			case 4:
				System.out.println(dao.listar());
				opcao = Menu.escolha();
				break;
			case 6:
				break;
			default:
				System.out.println("Opção Inválida!");
				opcao = Menu.escolha();
				break;
			}
		}
		
		

		
	}

}
