drop database db_escola_tech;

create database db_escola_tech;
use db_escola_tech;

create table tb_endereco (
	id INT AUTO_INCREMENT PRIMARY KEY,
	logradouro VARCHAR(255),
	bairro VARCHAR(255),
	numero INT,
	uf CHAR(2),
	pais VARCHAR(255)
);

create table tb_filial (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255),
	cnpj CHAR(14),
	id_endereco int,
    foreign key (id_endereco) references tb_endereco(id)
);

insert into tb_endereco (logradouro, bairro, numero, uf, pais) values
('Baker Street', 'Marylebone', 221, 'EG', 'Reino Unido');

insert into tb_filial (nome, cnpj, id_endereco) values
('Sherlock Holmes', '123456780000', 1);

describe tb_filial;
select * from tb_filial;
select * from tb_filial join tb_endereco on tb_filial.id_endereco = tb_endereco.id;