mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| academia           |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.03 sec)

mysql> USE academia;
Database changed
mysql> SHOW TABLES;
+--------------------+
| Tables_in_academia |
+--------------------+
| calificaciones     |
| cursos             |
| estudiantes        |
| matriculas         |
| profesores         |
+--------------------+
5 rows in set (0.01 sec)

mysql> INSERT INTO Estudiantes (nombre, apellido, email, fecha_registro)
    -> VALUES ('Juan', 'Perez', 'juan.perez@email.com', '2023-10-30');
Query OK, 1 row affected (0.04 sec)

mysql> RENAME TABLE Estudiantes TO Estudiante;
Query OK, 0 rows affected (0.09 sec)

mysql> RENAME TABLE Estudiante TO Estudiantes;
Query OK, 0 rows affected (0.04 sec)

mysql> SELECT COUNT(*) FROM Estudiantes;
+----------+
| COUNT(*) |
+----------+
|        1 |
+----------+
1 row in set (0.01 sec)

mysql> INSERT INTO Profesores (nombre, apellido, especialidad)
    -> VALUES ('Ana', 'Rivero', 'Matematicas');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Estudiantes (nombre, apellido, email, fecha_registro)
    -> VALUES
    -> ('Maria', 'Gonzalez', 'maria.gonzalez@email.com', '2023-02-15'),
    -> ('Carlos', 'Rodriguez', 'carlos.rodriguez@email.com', '2023-03-20'),
    -> ('Ana', 'Fernandez', 'ana.fernandez@email.com', '2023-04-25');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> INSERT INTO Profesores (nombre, apellido, especialidad)
    -> VALUES
    -> ('Roberto', 'Mendoza', 'Matematicas'),
    -> ('Luisa', 'Ortega', 'Historia'),
    -> ('Pedro', 'Vargas', 'Fisica'),
    -> ('Carmen', 'Lopez', 'Literatura');
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM Estudiantes;
+----+--------+-----------+----------------------------+----------------+
| id | nombre | apellido  | email                      | fecha_registro |
+----+--------+-----------+----------------------------+----------------+
|  1 | Juan   | Perez     | juan.perez@email.com       | 2023-10-30     |
|  2 | Maria  | Gonzalez  | maria.gonzalez@email.com   | 2023-02-15     |
|  3 | Carlos | Rodriguez | carlos.rodriguez@email.com | 2023-03-20     |
|  4 | Ana    | Fernandez | ana.fernandez@email.com    | 2023-04-25     |
+----+--------+-----------+----------------------------+----------------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM Profesores;
+----+---------+----------+--------------+
| id | nombre  | apellido | especialidad |
+----+---------+----------+--------------+
|  1 | Ana     | Rivero   | Matematicas  |
|  2 | Roberto | Mendoza  | Matematicas  |
|  3 | Luisa   | Ortega   | Historia     |
|  4 | Pedro   | Vargas   | Fisica       |
|  5 | Carmen  | Lopez    | Literatura   |
+----+---------+----------+--------------+
5 rows in set (0.00 sec)

mysql> DESCRIBE Cursos;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | int          | NO   | PRI | NULL    | auto_increment |
| nombre      | varchar(255) | NO   |     | NULL    |                |
| descripcion | text         | YES  |     | NULL    |                |
| id_profesor | int          | YES  | MUL | NULL    |                |
| horario     | time         | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
5 rows in set (0.02 sec)

mysql> INSERT INTO Cursos (nombre, descripcion, id_profesor, horario)
    -> VALUES
    -> ('Introduccion a Matematicas', 'Curso introductorio a las Matematicas', 1, '08:00:00'),
    -> ('Historia del Arte', 'Estudio de la historia del arte en el siglo XIV', 3, '10:00:00'),
    -> ('Fisica Cuantica', 'Curso de fisica teorica cuantica', 4, '12:00:00'),
    -> ('Literatura Griega', 'Curso intensivo de Literatura Griega', 5, '14:00:00');
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM Cursos;
+----+----------------------------+-------------------------------------------------+-------------+----------+
| id | nombre                     | descripcion                                     | id_profesor | horario  |
+----+----------------------------+-------------------------------------------------+-------------+----------+
|  1 | Introduccion a Matematicas | Curso introductorio a las Matematicas           |           1 | 08:00:00 |
|  2 | Historia del Arte          | Estudio de la historia del arte en el siglo XIV |           3 | 10:00:00 |
|  3 | Fisica Cuantica            | Curso de fisica teorica cuantica                |           4 | 12:00:00 |
|  4 | Literatura Griega          | Curso intensivo de Literatura Griega            |           5 | 14:00:00 |
+----+----------------------------+-------------------------------------------------+-------------+----------+
4 rows in set (0.00 sec)

mysql> DECRIBE Matriculas;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DECRIBE Matriculas' at line 1
mysql> DESCRIBE Matriculas;
+-----------------+------+------+-----+---------+-------+
| Field           | Type | Null | Key | Default | Extra |
+-----------------+------+------+-----+---------+-------+
| id_estudiante   | int  | NO   | PRI | NULL    |       |
| id_curso        | int  | NO   | PRI | NULL    |       |
| fecha_matricula | date | NO   |     | NULL    |       |
+-----------------+------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> INSERT INTO Matriculas (id_estudiante, id_curso, fecha_matricula)
    -> VALUES
    -> (1, 1, '2023-05-01'),
    -> (1, 2, '2023-05-02'),
    -> (2, 2, '2023-05-03'),
    -> (2, 3, '2023-06-15'),
    -> (3, 3, '2023-06-18'),
    -> (3, 4, '2023-06-19'),
    -> (4, 4, '2023-05-01;),
    '> (4, 1, '2023-08-19');^C
mysql> INSERT INTO Matriculas (id_estudiante, id_curso, fecha_matricula)
    -> VALUES
    -> (1, 1, '2023-05-01'),
    -> (1, 2, '2023-05-02'),
    -> (2, 2, '2023-05-03'),
    -> (2, 3, '2023-06-15'),
    -> (3, 3, '2023-06-18'),
    -> (3, 4, '2023-06-19'),
    -> (4, 4, '2023-05-01'),
    -> (4, 1, '2023-08-19');
Query OK, 8 rows affected (0.01 sec)
Records: 8  Duplicates: 0  Warnings: 0

mysql> DESCRIBE Calificaciones;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| id_estudiante | int          | NO   | PRI | NULL    |       |
| id_curso      | int          | NO   | PRI | NULL    |       |
| calificacion  | decimal(3,2) | YES  |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> INSERT INTO Calificaciones (id_estudiante, id_curso, calificacion)
    -> VALUES
    -> (1, 1, 8.5),
    -> (1, 2, 7.0),
    -> (2, 2, 9.0),
    -> (2, 3, 6.5),
    -> (3, 3, 8.0),
    -> (3, 4, 7.5),
    -> (4, 4, 9.5),
    -> (4, 1, 6.0);
Query OK, 8 rows affected (0.01 sec)
Records: 8  Duplicates: 0  Warnings: 0

mysql> SHOW TABLES;
+--------------------+
| Tables_in_academia |
+--------------------+
| calificaciones     |
| cursos             |
| estudiantes        |
| matriculas         |
| profesores         |
+--------------------+
5 rows in set (0.00 sec)

mysql> INSERT INTO Calificaciones (id_estudiante, id_curso, calificacion)
    -> VALUES
    -> (1, 6, 8.5);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`academia`.`calificaciones`, CONSTRAINT `calificaciones_ibfk_2` FOREIGN KEY (`id_curso`) REFERENCES `cursos` (`id`))
mysql> INSERT INTO Calificaciones (id_estudiante, id_curso, calificacion)
    -> VALUES
    -> (1, 3, 11);
ERROR 1264 (22003): Out of range value for column 'calificacion' at row 1
mysql> SELECT * FROM Estudiantes
    -> WHERE fecha_registro > '2023-05-01' AND apellido 'Perez';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Perez'' at line 2
mysql> SELECT * FROM Estudiantes
    -> WHERE fecha_registro > '2023-05-01' AND apellido = 'Perez';
+----+--------+----------+----------------------+----------------+
| id | nombre | apellido | email                | fecha_registro |
+----+--------+----------+----------------------+----------------+
|  1 | Juan   | Perez    | juan.perez@email.com | 2023-10-30     |
+----+--------+----------+----------------------+----------------+
1 row in set (0.01 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE fecha_registro > '2024-05-01' AND apellido = 'Perez';
Empty set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE apellido = 'Perez' AND apellido = 'Gonzalez';
Empty set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE apellido = 'Perez' OR apellido = 'Gonzalez';
+----+--------+----------+--------------------------+----------------+
| id | nombre | apellido | email                    | fecha_registro |
+----+--------+----------+--------------------------+----------------+
|  1 | Juan   | Perez    | juan.perez@email.com     | 2023-10-30     |
|  2 | Maria  | Gonzalez | maria.gonzalez@email.com | 2023-02-15     |
+----+--------+----------+--------------------------+----------------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE NOT apellido = 'Perez';
+----+--------+-----------+----------------------------+----------------+
| id | nombre | apellido  | email                      | fecha_registro |
+----+--------+-----------+----------------------------+----------------+
|  2 | Maria  | Gonzalez  | maria.gonzalez@email.com   | 2023-02-15     |
|  3 | Carlos | Rodriguez | carlos.rodriguez@email.com | 2023-03-20     |
|  4 | Ana    | Fernandez | ana.fernandez@email.com    | 2023-04-25     |
+----+--------+-----------+----------------------------+----------------+
3 rows in set (0.00 sec)

mysql> SELECT e.nombre, e.apellido
    -> FROM Estudiantes e
    -> JOIN Matriculas m ON e.id = m.id_estudiante
    -> WHERE m.id_curso = 1 OR m.id_curso = 2;
+--------+-----------+
| nombre | apellido  |
+--------+-----------+
| Juan   | Perez     |
| Juan   | Perez     |
| Maria  | Gonzalez  |
| Ana    | Fernandez |
+--------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM Matriculas;
+---------------+----------+-----------------+
| id_estudiante | id_curso | fecha_matricula |
+---------------+----------+-----------------+
|             1 |        1 | 2023-05-01      |
|             1 |        2 | 2023-05-02      |
|             2 |        2 | 2023-05-03      |
|             2 |        3 | 2023-06-15      |
|             3 |        3 | 2023-06-18      |
|             3 |        4 | 2023-06-19      |
|             4 |        1 | 2023-08-19      |
|             4 |        4 | 2023-05-01      |
+---------------+----------+-----------------+
8 rows in set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE nombre IN ('Juan', 'Maria');
+----+--------+----------+--------------------------+----------------+
| id | nombre | apellido | email                    | fecha_registro |
+----+--------+----------+--------------------------+----------------+
|  1 | Juan   | Perez    | juan.perez@email.com     | 2023-10-30     |
|  2 | Maria  | Gonzalez | maria.gonzalez@email.com | 2023-02-15     |
+----+--------+----------+--------------------------+----------------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE fecha_registro BETWEEN '2023-07-15' AND '2023-09-24';
Empty set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE fecha_registro BETWEEN '2023-05-15' AND '2023-09-24';
Empty set (0.00 sec)

mysql> SELECT * FROM Estudiantes ORDER BY fecha_registro DESC;
+----+--------+-----------+----------------------------+----------------+
| id | nombre | apellido  | email                      | fecha_registro |
+----+--------+-----------+----------------------------+----------------+
|  1 | Juan   | Perez     | juan.perez@email.com       | 2023-10-30     |
|  4 | Ana    | Fernandez | ana.fernandez@email.com    | 2023-04-25     |
|  3 | Carlos | Rodriguez | carlos.rodriguez@email.com | 2023-03-20     |
|  2 | Maria  | Gonzalez  | maria.gonzalez@email.com   | 2023-02-15     |
+----+--------+-----------+----------------------------+----------------+
4 rows in set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE fecha_registro BETWEEN '2023-03-18' AND '2023-08-25';
+----+--------+-----------+----------------------------+----------------+
| id | nombre | apellido  | email                      | fecha_registro |
+----+--------+-----------+----------------------------+----------------+
|  3 | Carlos | Rodriguez | carlos.rodriguez@email.com | 2023-03-20     |
|  4 | Ana    | Fernandez | ana.fernandez@email.com    | 2023-04-25     |
+----+--------+-----------+----------------------------+----------------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM Estudiantes
    -> WHERE nombre LIKE 'J__%';
+----+--------+----------+----------------------+----------------+
| id | nombre | apellido | email                | fecha_registro |
+----+--------+----------+----------------------+----------------+
|  1 | Juan   | Perez    | juan.perez@email.com | 2023-10-30     |
+----+--------+----------+----------------------+----------------+
1 row in set (0.01 sec)

mysql> SELECT nombre, apellido
    -> FROM Estudiantes
    -> WHERE nombre LIKE 'A__%';
+--------+-----------+
| nombre | apellido  |
+--------+-----------+
| Ana    | Fernandez |
+--------+-----------+
1 row in set (0.00 sec)

mysql> SELECT fecha_registro AS fecha FROM estudiantes;
+------------+
| fecha      |
+------------+
| 2023-10-30 |
| 2023-02-15 |
| 2023-03-20 |
| 2023-04-25 |
+------------+
4 rows in set (0.00 sec)

mysql> DESC Estudiantes;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | int          | NO   | PRI | NULL    | auto_increment |
| nombre         | varchar(255) | NO   |     | NULL    |                |
| apellido       | varchar(255) | NO   |     | NULL    |                |
| email          | varchar(255) | NO   | UNI | NULL    |                |
| fecha_registro | date         | NO   |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)

mysql> SELECT CONCAT(nombre, ' ',apellido) AS nombre_completo FROM Estudiantes;
+------------------+
| nombre_completo  |
+------------------+
| Juan Perez       |
| Maria Gonzalez   |
| Carlos Rodriguez |
| Ana Fernandez    |
+------------------+
4 rows in set (0.00 sec)

mysql> CREATE TABLE cursos_basicos (
    -> id INT AUTO_INCREMENT PRIMARY KEY,
    -> nombre VARCHAR(255) NOT NULL,
    -> costo DECIMAL(10,2) NOT NULL
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> CREATE TABLE cursos_avanzados (
    -> id INT AUTO_INCREMENT PRIMARY KEY,
    -> nombre VARCHAR(255) NOT NULL,
    -> costo DECIMAL(10,2) NOT NULL
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO cursos_basicos (nombre, costo) VALUES
    -> ('Intro a la programacion', 50.00),
    -> ('Matematicas iniciales', 80.00),
    -> ('Historia Precolombina', 90.00),
    -> ('Fitologia', 110.00);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> INSERT INTO cursos_avanzados(nombre, costo) VALUES
    -> ('Programacion en Python', 300.00),
    -> ('Calculo de matrices', 450.00),
    -> ('Arte renacentista', 510.00),
    -> ('Peluqueria con inteligencia artificial', 490.00);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT nombres AS curso_basico, costo FROM cursos_basicos AS b WHERE b.costo <= 100
    -> UNION
    -> SELECT nombres AS cursos_avanzado, costo FROM cursos_avanzados AS a WHERE a.costo <= 500;
ERROR 1054 (42S22): Unknown column 'nombres' in 'field list'
mysql> SELECT nombre AS curso_basico, costo FROM cursos_basicos AS b WHERE b.costo <= 100
    -> UNION
    -> SELECT nombre AS cursos_avanzado, costo FROM cursos_avanzados AS a WHERE a.costo <= 500;
+----------------------------------------+--------+
| curso_basico                           | costo  |
+----------------------------------------+--------+
| Intro a la programacion                |  50.00 |
| Matematicas iniciales                  |  80.00 |
| Historia Precolombina                  |  90.00 |
| Programacion en Python                 | 300.00 |
| Calculo de matrices                    | 450.00 |
| Peluqueria con inteligencia artificial | 490.00 |
+----------------------------------------+--------+
6 rows in set (0.00 sec)
