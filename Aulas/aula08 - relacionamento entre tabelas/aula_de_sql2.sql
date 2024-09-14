create database aula_sql2;
use aula_sql2;

create table curso (
	id int primary key,
	area varchar(45),
    dataInicio date
);
    
create table aluno (
	matricula char(4) primary key,
    nome varchar(45)
);

describe curso;

alter table curso modify column area varchar(50);
describe curso;

alter table curso add column professor varchar(50);
describe curso;

insert into curso values
	(1,'pogramação','2024-10-01','Davi'),
    (2,'engenharia','2025-10-01','Mateus');
    
insert into aluno values
	('B001', 'Murilo'),
    ('A001', 'Fulano'),
    ('0A02', 'Cicrano');
    
select * from aluno;
select * from aluno where matricula = '0000';

alter table aluno add column fkCurso int;
alter table aluno add constraint fkCursoAluno foreign key(fkCurso) references curso(id);
describe aluno;
describe curso;

update aluno set fkCurso = 1 where matricula = 'B001' or matricula = '0A02';
update aluno set fkCurso = 2 where matricula = 'A001';

select * from aluno join curso on aluno.fkCurso = curso.id;
select aluno.*, curso.area from aluno join curso on aluno.fkCurso = curso.id;

-- truncate table aluno; APAGA TODOS OS DADOS
-- drop database aula_de_sql2; APAGA O BANCO DE DADOS
-- update curso set professor = 'Nenhum' where id in (1,2); ALTERAR MAIS DE UM CURSO
-- select matricula from aluno where nome <> 'Murilo'; OUTRA FORMA DE USAR O !=
-- select concat(nome, ' tem a matricula ', matricula) from aluno; CONCATENAÇÃO

-- DATE (YYYY-MM-DD)
-- INT numero inteiro
-- FLOAT numero decimal (menor)
-- DOUBLE numero decimal
-- DECIMAL (numero decimal (maior)
-- DECIMAL(5,2) numero decimal (máximo 5 numeros, depois da virgula 2)
-- TIME (HH:MM:SS)
-- DATETIME data e hora (YYYY-MM-DD HH-MM-SS)
-- VARCHAR() carateres (varia)
-- CHAR() caracteres (explicito)

-- BANCO DE DADOS = SCHEMA
-- TABELA = ENTIDADE
-- COLUNA = ATRIBUTO/CAMPO
-- LINHA = TUPLA, REGISTRO

-- PORTA PADRAO MYSQL 3306


-- Crie a tabela Celular com os seguintes campos:
-- id (número inteiro e chave primária), marca (texto), modelo (texto), preco (numero decimal), cor (texto), dataFabricacao (data)
-- DECIMAL(7,2) 123456,67
-- Insira pelo menos 3 celulares
-- Selecione os celulares onde a marca for igual a 'Poco'
-- Selecione as cores dos celulares o preço for maior que 