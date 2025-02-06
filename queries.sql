
-- create
CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(20),
    fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- insert
INSERT INTO clientes (nombre, email, telefono) VALUES
('Juanita Pérez', 'juanita.perez@email.com', '123456789'),
('Mariana osorio', 'mariana.osorio@email.com', '987654321'),
('Nicolas Duran', 'nicolas.duran@email.com', '555666777'),
('Ana Torres', 'ana.torres@email.com', '111222333'),
('Sebatian Sanchez', 'sebastian.sanchez@email.com', '999888777');



-- fetch 
SELECT * FROM clientes;

