--DCL (Data Control Language)
--D� permiss�o total ao usu�rio postgres na tabela clientes
GRANT ALL clientes TO postgres;

--Caso queira especificar somente alguns comandos para trocar o "ALL" pelos comandos espec�ficos
--GRANT INSERT, UPDATE ON nomeTabela TO nomeUsuario;