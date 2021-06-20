package myapp;


import java.text.SimpleDateFormat;


import myapp.cadastros.Empresa;
import myapp.pedidos.Pedido;

public class PrinterApp {
	public static void imprimirPedido(Pedido pedido) {
		//GERAR O CUPOM
		//CRIAR O OBJETO - ENDERECO - LOGRADOURO, NUMERO, BAIRRO, CIDADE - SIGLA ESTADO
		//FORMATAR O CNPJ, IE, EM - PLUS
		
		System.out.printf("Mr.%2$s,%1$s\n\n", "HENRIQUE", "NAWA");
		
		Empresa empresa = pedido.getEmpresa();
		
		String formatarCnpj = empresa.getCadastro().getCpfCnpj().replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})", "$1.$2.$3/$4-");
		StringBuilder sb = new StringBuilder();
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(empresa.getCadastro().getEndereco() + "\n");
//		sb.append(String.format("CNPJ: %s \n", empresa.getCadastro().getCpfCnpj()));
		sb.append(formatarCnpj + "\n");
		sb.append(String.format("IE: %d\nIM: %d\n",empresa.getIe(), empresa.getIm()));
		sb.append("------------------------------------------------------------------\n");
		
		//NUMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6DIGITOS)
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(dataFormatada);
		
		sb.append("------------------------------------------------------------------\n");
		sb.append(String.format("TOTAL %.2f", pedido.getValorTotal()));
		
		 
		
		System.out.println(sb.toString());
		/*
		System.out.println(empresa.getCadastro().getNome());
		System.out.println(empresa.getCadastro().getEndereco());
		System.out.println("CNPJ:" + empresa.getCadastro().getCpfCnpj());
		System.out.println("IE:" +empresa.getIe());
		System.out.println("IM:" +empresa.getIm());
		*/
		
	}

}
