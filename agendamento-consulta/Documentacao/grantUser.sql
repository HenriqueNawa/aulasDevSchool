--DCL (Data Control Language)
--Dá permissão total ao usuário postgres na tabela clientes
GRANT ALL clientes TO postgres;

--Caso queira especificar somente alguns comandos para trocar o "ALL" pelos comandos específicos
--GRANT INSERT, UPDATE ON nomeTabela TO nomeUsuario;