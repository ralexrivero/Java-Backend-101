SHOW DATABASES;

CREATE DATABASE comercio;

USE comercio;

CREATE TABLE orders (
OrderID INT PRIMARY KEY,
Department VARCHAR(50),
OrderDate DATE,
OrderQuantity INT,
OrderTotal DECIMAL(10, 2)
);

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

SELECT * FROM orders;

SELECT Department
FROM orders
GROUP BY Department;

SELECT Department, COUNT(*) AS NumerOfOrders
FROM orders
GROUP BY Department;

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department;

SELECT Department, MIN(OrderQuantity) AS SmallestOrder
FROM orders
GROUP BY Department;

SELECT Department, AVG(OrderTotal) AS AverageSales
FROM orders
GROUP BY Department;

SELECT
Department,
COUNT(*) AS NumberOfOrders,
SUM(OrderTotal) AS TotalSales,
MIN(OrderQuantity) AS SmallestOrder,
MAX(OrderQuantity) AS LargestOrder,
AVG(OrderTotal) AS AverageSales,
SUM(OrderQuantity) AS TotalQuantity,
AVG(OrderQuantity) AS AverageQuantity
FROM orders
GROUP BY Department;

SELECT * FROM orders;

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department;

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department
HAVING SUM(OrderTotal) > 500;

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department
HAVING TotalSales > 500;
