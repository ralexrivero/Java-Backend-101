-- base de datos y tabla para ventas

CREATE DATABASE comercio;

CREATE TABLE orders (
    OrderID INT PRIMARY KEY,
    Department VARCHAR(50),
    OrderDate DATE,
    OrderQuantity INT,
    OrderTotal DECIMAL(10, 2)
);

-- DECIMAL(M, D)
-- M Precision, la cantidad de digitos que podemos almacenar
-- D escala, la cantidad de digitos despues de la coma

INSERT INTO orders (OrderID, Department, OrderDate, OrderQuantity, OrderTotal)
VALUES
(1, 'Lawn Care', '2023-01-01', 3, 150.00),
(2, 'Gardening', '2023-01-02', 2, 200.00),
(3, 'Lawn Care', '2023-01-03', 1, 50.00),
(4, 'Decor', '2023-01-01', 2, 100.00),
(5, 'Lawn Care', '2023-02-03', 1, 250.00),
(6, 'Gardening', '2023-02-01', 2, 100.00),
(7, 'Lawn Care', '2023-01-15', 2, 120.00),
(8, 'Lawn Care', '2023-02-17', 3, 180.00),
(9, 'Gardening', '2023-01-15', 5, 200.00),
(10, 'Decor', '2023-01-03', 4, 620.00);
