CREATE DATABASE aula_de_sql;
USE aula_de_sql;
CREATE TABLE curso (id INT primary key, area VARCHAR(45), dataInicio date);
CREATE TABLE aluno (matricula char(4) primary key, nome varchar(45));
describe aluno;
CREATE TABLE animal (id INT primary key, nome VARCHAR(20), raca VARCHAR(20), genero char(1), dataNascimento date);
DESCRIBE animal;
alter table animal add column porte varchar(20);
INSERT INTO animal values(1, 'Pudim', 'feliscatos', 'F', '2023-01-01', 'mini');
SELECT * from  animal;
SELECT nome from  animal;
UPDATE animal set nome = 'Diamante' where id = '1';
INSERT INTO animal values(2, 'Pudim', 'feliscatus', 'F', '2023-01-01', 'mini');
SELECT nome from  animal;
DELETE FROM animal where id = '1';
SELECT * from  animal;
INSERT INTO animal values(1, 'Diamante', 'feliscatos', 'F', '2023-01-01', 'mini');
SELECT * FROM animal WHERE nome = 'Pudim';
SELECT * FROM animal WHERE nome LIKE '%im%';
SELECT * FROM animal WHERE nome LIKE '%P_%';
SELECT * FROM animal WHERE nome LIKE '%_P%';
SELECT * FROM animal WHERE nome LIKE '_____-__';
CREATE TABLE pessoa (id int primary key auto_increment, nome varchar(20));
insert into pessoa values (1, 'Daniel');
insert into pessoa values (default, 'Josild');
select * from pessoa;
insert into pessoa (nome) values ('Rosildon');
select * from pessoa;
delete from pessoa where id between (1) and (3);
delete from pessoa where id in (1, 2);
create table produto (id int primary key auto_increment, nome varchar(20), preco decimal(7,2), quantidadeEstoque int, dataCadastro date, marca varchar(20));
insert into produto values (default, 'Televisao', 2799.00, 30, default, 'LG');
insert into produto values (default, 'Fone bluetooth', 299.99, 60, default, 'Apple');
select * from produto;

create table produtos (
    id int primary key auto_increment,
    nome varchar(255), preco decimal(7,2),
    quantidadeEstoque int,
    dataCadastro datetime default current_timestamp, --função p salvar com data atual
    marca varchar(255)
);
insert into produtos values (default, 'Televisao', 2799.00, 30, default, 'LG');
insert into produtos values (default, 'Fone bluetooth', 299.99, 60, default, 'Apple');
select * from produtos;