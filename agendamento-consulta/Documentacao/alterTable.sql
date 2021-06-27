--DDL(Data Definition Language) , comando ALTER TABLE
--Retirar a obrigatoriedade das colunas não aceitarem nulls
ALTER TABLE clientes ALTER COLUMN nomesColunas DROP NOT NULL;
--	[pj_pf ,
--	razao_nome ,
--	cpf_cnpj ,
--	inscEst_rg,
--	telefone ,
--	email ,
--	cep,
--	estado,
--	cidade,
--	rua ,
--	numero ,
--	complemento ,
--	bairro ]
	
--Observacao para colocar a obrigatoriedade de aceitar nulos basta trocar por (SET NOT NULL)