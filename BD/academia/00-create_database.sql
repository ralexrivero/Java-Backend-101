CREATE DATABASE academia;
USE academia;

CREATE TABLE Estudiantes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  fecha_registro DATE NOT NULL
);

CREATE TABLE Profesores (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL,
  especialidad VARCHAR(255)
);

CREATE TABLE Cursos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  descripcion TEXT,
  id_profesor INT,
  horario TIME,
FOREIGN KEY (id_profesor) REFERENCES Profesores(id)
);

CREATE TABLE Matriculas (
  id_estudiante INT,
  id_curso INT,
  fecha_matricula DATE NOT NULL,
  PRIMARY KEY (id_estudiante, id_curso),
  FOREIGN KEY (id_estudiante) REFERENCES Estudiantes(id),
  FOREIGN KEY (id_curso) REFERENCES Cursos(id)
);

CREATE TABLE Calificaciones (
  id_estudiante INT,
  id_curso INT,
  calificacion DECIMAL(3,2) CHECK (calificacion BETWEEN 0 AND 10),
  PRIMARY KEY (id_estudiante, id_curso),
  FOREIGN KEY (id_estudiante) REFERENCES Estudiantes(id),
  FOREIGN KEY (id_curso) REFERENCES Cursos(id)
);

