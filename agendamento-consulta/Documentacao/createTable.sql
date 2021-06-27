--DDL (Data Definition Language)
create table public.clientes (
	codigo serial NOT NULL PRIMARY KEY,
	pj_pf character(1) NOT NULL,
	razao_nome varchar(70) NOT NULL,
	cpf_cnpj varchar(14) NOT NULL,
	inscEst_rg varchar(12) NOT NULL,
	telefone numeric(11) NOT NULL,
	telefone2 numeric(11),
	email varchar(70) NOT NULL,
	ativ_profissao varchar(100),
	cep char(8) NOT NULL,
	estado char(2) NOT NULL,
	cidade varchar(50) NOT NULL,
	rua varchar(70) NOT NULL,
	numero varchar(6) NOT NULL,
	complemento varchar(100),
	bairro varchar (50) NOT NULL,
	site_instagram varchar(50),
	observacoes text
);