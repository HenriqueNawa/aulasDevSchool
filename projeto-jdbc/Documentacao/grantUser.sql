--DCL (Data Control Language)
--Dá permissão total ao usuário postgres na tabela clientes
GRANT ALL PRIVILEGES tab_clientes TO postgres;

--Caso queira especificar somente alguns comandos para trocar o "ALL PRIVILEGES" pelos comandos específicos
--GRANT INSERT, UPDATE ON nomeTabela TO nomeUsuario;