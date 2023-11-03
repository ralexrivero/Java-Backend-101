# GROUP BY

```sql
SELECT Department, COUNT(*) AS NumerOfOrders
FROM orders
GROUP BY Department;
+------------+---------------+
| Department | NumerOfOrders |
+------------+---------------+
| Lawn Care  |             5 |
| Gardening  |             3 |
| Decor      |             2 |
+------------+---------------+
3 rows in set (0.00 sec)

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department;
+------------+------------+
| Department | TotalSales |
+------------+------------+
| Lawn Care  |     750.00 |
| Gardening  |     500.00 |
| Decor      |     720.00 |
+------------+------------+
3 rows in set (0.00 sec)

SELECT Department, MIN(OrderQuantity) AS SmallestOrder
FROM order
GROUP BY Deparment;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'order
GROUP BY Deparment' at line 2
SELECT Department, MIN(OrderQuantity) AS SmallestOrder
FROM orders
GROUP BY Department;
+------------+---------------+
| Department | SmallestOrder |
+------------+---------------+
| Lawn Care  |             1 |
| Gardening  |             2 |
| Decor      |             2 |
+------------+---------------+
3 rows in set (0.00 sec)

SELECT Department, AVG(OrderTotal) AS AverageSales
FROM orders
GROUP BY Department;
+------------+--------------+
| Department | AverageSales |
+------------+--------------+
| Lawn Care  |   150.000000 |
| Gardening  |   166.666667 |
| Decor      |   360.000000 |
+------------+--------------+
3 rows in set (0.00 sec)

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
+------------+----------------+------------+---------------+--------------+--------------+---------------+-----------------+
| Department | NumberOfOrders | TotalSales | SmallestOrder | LargestOrder | AverageSales | TotalQuantity | AverageQuantity |
+------------+----------------+------------+---------------+--------------+--------------+---------------+-----------------+
| Lawn Care  |              5 |     750.00 |             1 |            3 |   150.000000 |            10 |          2.0000 |
| Gardening  |              3 |     500.00 |             2 |            5 |   166.666667 |             9 |          3.0000 |
| Decor      |              2 |     720.00 |             2 |            4 |   360.000000 |             6 |          3.0000 |
+------------+----------------+------------+---------------+--------------+--------------+---------------+-----------------+
3 rows in set (0.00 sec)

SELECT * FROM orders;
+---------+------------+------------+---------------+------------+
| OrderID | Department | OrderDate  | OrderQuantity | OrderTotal |
+---------+------------+------------+---------------+------------+
|       1 | Lawn Care  | 2023-01-01 |             3 |     150.00 |
|       2 | Gardening  | 2023-01-02 |             2 |     200.00 |
|       3 | Lawn Care  | 2023-01-03 |             1 |      50.00 |
|       4 | Decor      | 2023-01-01 |             2 |     100.00 |
|       5 | Lawn Care  | 2023-02-03 |             1 |     250.00 |
|       6 | Gardening  | 2023-02-01 |             2 |     100.00 |
|       7 | Lawn Care  | 2023-01-15 |             2 |     120.00 |
|       8 | Lawn Care  | 2023-02-17 |             3 |     180.00 |
|       9 | Gardening  | 2023-01-15 |             5 |     200.00 |
|      10 | Decor      | 2023-01-03 |             4 |     620.00 |
+---------+------------+------------+---------------+------------+
10 rows in set (0.00 sec)

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department;
+------------+------------+
| Department | TotalSales |
+------------+------------+
| Lawn Care  |     750.00 |
| Gardening  |     500.00 |
| Decor      |     720.00 |
+------------+------------+
3 rows in set (0.00 sec)

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department
HAVING SUM(OrderTotal) > 500;
+------------+------------+
| Department | TotalSales |
+------------+------------+
| Lawn Care  |     750.00 |
| Decor      |     720.00 |
+------------+------------+
2 rows in set (0.00 sec)

SELECT Department, SUM(OrderTotal) AS TotalSales
FROM orders
GROUP BY Department
HAVING TotalSales > 500;
+------------+------------+
| Department | TotalSales |
+------------+------------+
| Lawn Care  |     750.00 |
| Decor      |     720.00 |
+------------+------------+
2 rows in set (0.00 sec)

USE academia;
Database changed
SHOW TABLES;
+--------------------+
| Tables_in_academia |
+--------------------+
| calificaciones     |
| cursos             |
| cursos_avanzados   |
| cursos_basicos     |
| estudiantes        |
| matriculas         |
| profesores         |
+--------------------+
7 rows in set (0.01 sec)

DESC cursos;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | int          | NO   | PRI | NULL    | auto_increment |
| nombre      | varchar(255) | NO   |     | NULL    |                |
| descripcion | text         | YES  |     | NULL    |                |
| id_profesor | int          | YES  | MUL | NULL    |                |
| horario     | time         | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)

DESC calificaciones;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| id_estudiante | int          | NO   | PRI | NULL    |       |
| id_curso      | int          | NO   | PRI | NULL    |       |
| calificacion  | decimal(3,2) | YES  |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

SELECT id_curso, AVG(calificacion) as promedio_calificacion
FROM calificaciones
GROUP BY id_curso
HAVING promedio_calificacion > 5;
+----------+-----------------------+
| id_curso | promedio_calificacion |
+----------+-----------------------+
|        4 |              5.705000 |
|        8 |              6.079000 |
|        9 |              5.257500 |
|       10 |              5.335455 |
+----------+-----------------------+
4 rows in set (0.00 sec)

SELECT id_curso, AVG(calificacion) as promedio_calificacion
FROM calificaciones
GROUP BY id_curso;
+----------+-----------------------+
| id_curso | promedio_calificacion |
+----------+-----------------------+
|        1 |              3.003750 |
|        2 |              4.912500 |
|        3 |              2.718000 |
|        4 |              5.705000 |
|        5 |              3.337273 |
|        6 |              3.907500 |
|        7 |              4.828571 |
|        8 |              6.079000 |
|        9 |              5.257500 |
|       10 |              5.335455 |
+----------+-----------------------+
10 rows in set (0.00 sec)

SELECT id_curso, COUNT(*) AS TotalEstudiantes
FROM matriculas
GROUP BY id_curso;
+----------+------------------+
| id_curso | TotalEstudiantes |
+----------+------------------+
|        1 |                8 |
|        2 |                4 |
|        3 |                5 |
|        4 |                8 |
|        5 |               11 |
|        6 |                8 |
|        7 |                7 |
|        8 |               10 |
|        9 |                8 |
|       10 |               11 |
+----------+------------------+
10 rows in set (0.01 sec)

SELECT id_curso, MAX(calificacion) AS CalificaicionMaxima
FROM calificaciones
GROUP BY id_curso;
+----------+---------------------+
| id_curso | CalificaicionMaxima |
+----------+---------------------+
|        1 |                6.48 |
|        2 |                9.18 |
|        3 |                7.40 |
|        4 |                9.78 |
|        5 |                9.19 |
|        6 |                8.02 |
|        7 |                8.54 |
|        8 |                8.77 |
|        9 |                9.28 |
|       10 |                9.61 |
+----------+---------------------+
10 rows in set (0.00 sec)

SELECT id_curso, MIN(calificacion) AS CalificaicionMinima
FROM calificaciones
GROUP BY id_curso;
+----------+---------------------+
| id_curso | CalificaicionMinima |
+----------+---------------------+
|        1 |                0.31 |
|        2 |                1.23 |
|        3 |                0.33 |
|        4 |                3.00 |
|        5 |                0.01 |
|        6 |                0.84 |
|        7 |                1.13 |
|        8 |                2.24 |
|        9 |                0.20 |
|       10 |                1.09 |
+----------+---------------------+
10 rows in set (0.00 sec)
```
