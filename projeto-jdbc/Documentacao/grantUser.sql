--DCL (Data Control Language)
--D� permiss�o total ao usu�rio postgres na tabela clientes
GRANT ALL PRIVILEGES tab_clientes TO postgres;

--Caso queira especificar somente alguns comandos para trocar o "ALL PRIVILEGES" pelos comandos espec�ficos
--GRANT INSERT, UPDATE ON nomeTabela TO nomeUsuario;