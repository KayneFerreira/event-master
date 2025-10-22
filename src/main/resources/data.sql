-- Inserindo endereços
INSERT INTO address (city) VALUES 
('São Paulo'),
('Rio de Janeiro'),
('Curitiba'),
('Belo Horizonte'),
('Porto Alegre');

-- Inserindo usuários
INSERT INTO users (name, birth_date, cpf, username, password, role, address_id) VALUES
('Ana Souza', '1990-05-12', '12345678909', 'ana.souza', 'senha123', 'ROLE_USER', 1),
('Carlos Lima', '1985-11-23', '98765432100', 'carlos.lima', 'segredo456', 'ROLE_USER', 2),
('Beatriz Mendes', '1998-07-08', '45678912360', 'bia.mendes', '123abc', 'ROLE_USER', 3),
('João Pereira', '1992-03-15', '32165498706', 'joao.p', 'joaopass', 'ROLE_USER', 4),
('Mariana Costa', '1989-09-30', '65432198790', 'mariana.c', 'mariana123', 'ROLE_USER', 5),
('Lucas Oliveira', '1995-01-20', '78912345620', 'lucas.oli', 'lucaspass', 'ROLE_USER', 1),
('Fernanda Ribeiro', '1993-06-10', '85296374104', 'fernanda.r', 'fernandapass', 'ROLE_USER', 2),
('Rafael Martins', '1987-12-05', '74185296300', 'rafael.m', 'rafaelpass', 'ROLE_USER', 3),
('Juliana Almeida', '1991-04-18', '96374185200', 'juliana.a', 'julianapass', 'ROLE_USER', 4),
('Bruno Silva', '1996-08-25', '15935725800', 'bruno.s', 'brunopass', 'ROLE_USER', 5),
('Patrícia Gomes', '1994-02-14', '25815935700', 'patricia.g', 'patpass', 'ROLE_USER', 1),
('Thiago Rocha', '1988-07-07', '35725815900', 'thiago.r', 'thiagopass', 'ROLE_USER', 2),
('Camila Duarte', '1997-11-11', '45612378900', 'camila.d', 'camilapass', 'ROLE_USER', 3),
('Eduardo Nunes', '1990-10-10', '78945612300', 'eduardo.n', 'edupass', 'ROLE_USER', 4),
('Larissa Teixeira', '1992-12-22', '32198765400', 'larissa.t', 'larissapass', 'ROLE_USER', 5),
('Gabriel Freitas', '1986-05-05', '65478932100', 'gabriel.f', 'gabrielpass', 'ROLE_USER', 1),
('Vanessa Carvalho', '1999-03-03', '98732165400', 'vanessa.c', 'vanessapass', 'ROLE_USER', 2),
('Felipe Barros', '1993-09-09', '74196385200', 'felipe.b', 'felipepass', 'ROLE_USER', 3),
('Aline Monteiro', '1996-06-06', '85274196300', 'aline.m', 'alinepass', 'ROLE_USER', 4),
('Diego Santana', '1984-01-01', '96385274100', 'diego.s', 'diegopass', 'ROLE_USER', 5);
