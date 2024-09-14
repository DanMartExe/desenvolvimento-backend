create database db_empresa_eventos;
use db_empresa_eventos;

create table tb_eventos (
	id int auto_increment primary key,
    nome varchar(255),
    localizacao varchar(255),
    preco_ingresso decimal (6,2)
);

insert into tb_eventos(nome, localizacao, preco_ingresso) values
	('Feira empresarial de Itaqua', 'Prefeitura', 15.99),
    ('Rock in Rio', 'Algum lugar do RJ', 6543.21);

select * from tb_eventos;