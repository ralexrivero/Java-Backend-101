CREATE DATABASE EjemploJava;
SHOW DATABASES;
USE EjemploJava;
CREATE TABLE usuarios (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        nombre VARCHAR(100) NOT NULL,
                        email VARCHAR(100) NOT NULL
);
DESCRIBE usuarios;
