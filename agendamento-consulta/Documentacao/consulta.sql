--DQL (Data Query Language), comando SELECT
SELECT * from clientes; --Mostrar todos as colunas com todos os clientes
SELECT * from clientes ORDER BY razao_nome ASC; --Ordena a consulta em ordem alfabética dos nomes, obs. ASC= ordem crescente, DESC = ordem decrescente. Porém é opcional colocar ASC, pois por padrão ele ordena de forma alfabética
--SELECT telefone from clientes; --Consultar apenas a coluna de telefone