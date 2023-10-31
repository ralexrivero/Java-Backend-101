-- source C:\Users\Admin.DESKTOP-0Q23CA9\Desktop\code\Java-Backend-101\BD\academia\01-insertar_datos.sql

INSERT INTO Cursos (nombre, descripcion, id_profesor, horario)
VALUES
('Introduccion a Matematicas', 'Curso introductorio a las Matematicas', 1, '08:00:00'),
('Historia del Arte', 'Estudio de la historia del arte en el siglo XIV', 3, '10:00:00'),
('Fisica Cuantica', 'Curso de fisica teorica cuantica', 4, '12:00:00'),
('Literatura Griega', 'Curso intensivo de Literatura Griega', 5, '14:00:00');


INSERT INTO Matriculas (id_estudiante, id_curso, fecha_matricula)
VALUES
(1, 1, '2023-05-01'),
(1, 2, '2023-05-02'),
(2, 2, '2023-05-03'),
(2, 3, '2023-06-15'),
(3, 3, '2023-06-18'),
(3, 4, '2023-06-19'),
(4, 4, '2023-05-01'),
(4, 1, '2023-08-19');
