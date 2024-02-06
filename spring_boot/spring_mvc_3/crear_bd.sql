CREATE DATABASE gestion_tareas;

USE gestion_tareas;

CREATE TABLE tareas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(255),
    fecha DATE
);

INSERT INTO tareas(descripcion, fecha),
VALUES ('Revisar correos', CURDATE()),
        ('PLanificar las clases proximas', CURDATE() + INTERVAL 1 DAY),
        ('Actualizar Github de Java-Backend', CURDATE() + INTERVAL 2 DAY);
