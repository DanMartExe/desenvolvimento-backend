drop database db_restaurante;

CREATE DATABASE db_restaurante;
USE db_restaurante;

CREATE TABLE pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255)
);

CREATE TABLE prato (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(7,2),
    id_pedido INT,
    FOREIGN KEY (id_pedido) REFERENCES pedido(id)
);

INSERT INTO pedido(descricao) VALUES ('Pedido mesa 1'), ('Pedido para delivery');

INSERT INTO prato(nome, preco, id_pedido) VALUES
('Feijoada', 39.90, 1),
('Baiao de dois', 43.90, 1),
('Baiao de dois', 43.90, 1),
('Frango a parmegiana', 45.90, 2);

SELECT * FROM prato WHERE id_pedido = 1;