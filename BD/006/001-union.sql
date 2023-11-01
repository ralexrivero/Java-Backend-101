-- crear tabla de frutas rojas
SHOW DATABASES;
CREATE DATABASE ejemplo;
USE ejemplo;

CREATE TABLE frutas_rojas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE frutas_amarillas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

SHOW TABLES;
DESC frutas_amarillas;
DESC frutas_rojas;

INSERT INTO frutas_rojas (nombre)
    VALUES
    ('Manzana'), ('Frutilla'), ('Moras'), ('Ciruelas');

INSERT INTO frutas_amarillas (nombre)
    VALUES
    ('Banana'), ('Limon'), ('Membrillo'), ('Anana');

SELECT * FROM frutas_rojas;
SELECT * FROM frutas_amarillas;

-- Union
SELECT nombre FROM frutas_rojas
    UNION
    SELECT nombre FROM frutas_amarillas;

INSERT INTO frutas_rojas (nombre) VALUES ('Pina');
SELECT nombre FROM frutas_rojas;
INSERT INTO frutas_rojas (nombre) VALUES ('Anana');
SELECT nombre FROM frutas_rojas;
SELECT nombre FROM frutas_amarillas;

SELECT nombre FROM frutas_rojas
UNION
SELECT nombre FROM frutas_amarillas;

SELECT nombre FROM frutas_rojas
UNION ALL
SELECT nombre FROM frutas_amarillas;

(SELECT nombre FROM frutas_rojas WHERE nombre LIKE 'P%')
UNION
(SELECT nombre FROM frutas_amarillas WHERE nombre LIKE 'B%')
ORDER BY nombre;

CREATE TABLE Autores (
AutorID INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(255) NOT NULL
);

CREATE TABLE Libros (
LibroID INT AUTO_INCREMENT PRIMARY KEY,
Titulo VARCHAR(255) NOT NULL,
AutorID INT,
FOREIGN KEY (AutorID) REFERENCES Autores(AutorID)
);

SHOW TABLES;

CREATE TABLE Autores (
AutorID INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(255) NOT NULL
);

INSERT INTO Autores (Nombre)
VALUES
('Gabriel Garcia Marquez'), ('Isabell Allende');

INSERT INTO Libros (Titulo, AutorID)
VALUES
('Cien años de soledad', 1), ('La casa de los espiritus', 2);

SELECT Autores.Nombre, Libros.Titulo
FROM Autores
INNER JOIN Libros ON Autores.AutorID = Libros.AutorID;

INSERT INTO Autores (Nombre)
VALUES
('Mario Benedetti');

SELECT Autores.Nombre, Libros.Titulo
FROM Autores
INNER JOIN Libros ON Autores.AutorID = Libros.AutorID;

SELECT Nombre FROM Autores;

INSERT INTO Autores (Nombre) VALUES ('Julio Cortazar');

SELECT * FROM Autores;

SELECT Autores.Nombre, Libros.Titulo
FROM Autores
LEFT JOIN Libros ON Autores.AutorID = Libros.AutorID;

INSERT INTO Libros (Titulo, AutorID)
VALUES
('Violeta', 2), ('La ciudad de las bestias', 2);

SELECT * from Libros;

SELECT  Autores.Nombre, Libros.Titulo
FROM Autores
LEFT JOIN Libros ON Autores.AutorID = Libros.AutorID;

SELECT Autores.Nombre AS Autor, Libros.Titulo AS Libro
FROM Autores
RIGHT JOIN Libros On Autores.AutorID = Libros.AutorID;

DESC Autores;
DESC Libros;

CREATE TABLE Empleados (
EmpleadoID INT PRIMARY KEY,
Nombre VARCHAR(255) NOT NULL,
SupervisorID INT,
FOREIGN KEY (SupervisorID) REFERENCES Empleados(EmpleadoID)
);

ALTER TABLE Empleados
ADD COLUMN Apellido VARCHAR(255) DEFAULT 'Desconocido';

DESC Empleados;

INSERT INTO Empleados (EmpleadoID, Nombre, Apellido, SupervisorID) VALUES (1, 'Ana', 'Monterroso', NULL);
INSERT INTO Empleados (EmpleadoID, Nombre, Apellido, SupervisorID) VALUES (2, 'Luis', 'Pereira', 1);
INSERT INTO Empleados (EmpleadoID, Nombre, Apellido, SupervisorID) VALUES (3, 'Marta', 'Martinez', 1);
INSERT INTO Empleados (EmpleadoID, Nombre, Apellido, SupervisorID) VALUES (4, 'Carlos', 'Pereira', 2);

SELECT * FROM Empleados;

SELECT e1.Nombre AS Empleado, e2.Nombre AS Supervisor
FROM Empleados e1
LEFT JOIN Empleados e2 ON e1.SupervisorID = e2.EmpleadoID;

USE academia;
Database changed
SHOW TABLES;
