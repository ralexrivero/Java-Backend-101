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
