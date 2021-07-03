import java.util.List;
import java.util.Scanner;

import devschool.dao.CadastroDao;
import devschool.menu.Menu;
import devschool.menu.Opcao;
import devschool.model.Cadastro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroDao dao = new CadastroDao();
		
		Cadastro cadastro = new Cadastro();
		
		int codigo;
		String nome;
		Long telefone;
		Opcao.values();
		
		int opcao = Menu.escolha();
		do {
			switch (opcao) {
			case 1:
				System.out.println("Nome/Razão: ");
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
				System.out.println("Nome/Razão: ");
				nome = sc.nextLine();
				System.out.println("Telefone: ");
				telefone = sc.nextLong();
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
				List<Cadastro> clientes = dao.listar();
		
				clientes.stream().forEach(cli -> 
					System.out.println("Código: " + cli.getCodigo() + "\n" + 
					"Nome/Razão: " + cli.getRazao_nome() + "\n" + 
					"Telefone: " + cli.getTelefone() + "\n" + "-".repeat(50)));
				opcao = Menu.escolha();
				break;
				
			case 5:
				System.out.println("Código do cliente: ");
				codigo = sc.nextInt();
				sc.nextLine();
				Cadastro cliente = dao.buscar(codigo);
				System.out.println(String.format("Nome/Razão: %s\nTelefone: %d", cliente.getRazao_nome(), cliente.getTelefone()));
				opcao = Menu.escolha();
				break;
			case 6:
				break;
				
			default:
				System.out.println("Opção Inválida!");
				opcao = Menu.escolha();
				break;
			}
		} while (opcao != 6);
		
		System.exit(0);


		
	}

}
