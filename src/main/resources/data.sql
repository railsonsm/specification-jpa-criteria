

INSERT INTO usuario
(id,
nome,
email,
senha)
VALUES
(1, 'Railson','railson@hotmail.com','123456'),
(2, 'Lais Silva','lais@hotmail.com','123456'),
(3, 'Rose Martins','railson@hotmail.com','123456'),
(4, 'Nelci','nelci@hotmail.com','123456');

INSERT INTO lancamento (id, observacao, cartao, valor, data, usuario_id) VALUES (1, 'Teste', 'c', '10', curdate(), 1);
INSERT INTO lancamento (id, observacao, cartao, valor, data, usuario_id) VALUES (2, 'Teste 2', 'c', '10', curdate(), 2);
