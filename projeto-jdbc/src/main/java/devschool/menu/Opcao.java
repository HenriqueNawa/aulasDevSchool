package devschool.menu;

public enum Opcao {
	ADD("Adicionar"),
	DEL ("Excluir"),
	UP ("Atualizar"),
	SHOW ("Mostrar todos"),
	EXIT ("Sair"),
	CLI ("Buscar por Código");
	
	private String descricao;
	private Opcao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}


}
