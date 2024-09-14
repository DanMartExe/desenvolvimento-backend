create database db_floricultura;
use db_floricultura;

create table tb_flores (
	id int auto_increment primary key,
    especie varchar(255),
    preco decimal (5,2)
);

insert into tb_flores(especie, preco) values
	('Orquidea', 199.99),
    ('Dama da noite', 1.50);
    
select * from tb_flores;