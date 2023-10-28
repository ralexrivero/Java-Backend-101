-- REPLACE en MySQL
-- las diferencias de REPLACE con INSERT INTO y UPDATE

-- REPLACE INTO nombre_tabla (columna1, columna2)
-- VALUES (valor1, valor2);

-- UPDATE
SELECT * FROM clase_developers WHERE id = 169;

-- actualizar un registro unico por id
UPDATE clase_developers
SET email = 'carlitos.123@email.com'
WHERE id = 169;

SELECT * FROM clase_developers WHERE id = 169;

-- actualizar un registro filtrando por nombre y apellido (no es muy recomendable)
UPDATE clase_developers
SET email = 'ricardo.paredes@gmail.com'
WHERE nombre = 'Ricardo' AND apellido = 'Paredes';

-- cambio en multiples registros
-- falla porque email es UNIQUE y no se puede actualizar a un valor repetido
UPDATE clase_developers
SET email = '_________@gmail.com'
WHERE nombre = 'Maria';

-- actualizar apellido segun nombre, esto genera que todos los Carlos tengan el mismo apellido
UPDATE clase_developers
SET apellido = 'Perez'
WHERE nombre = 'Carlos';

-- confirmo que todos los Carlos tienen el mismo apellido
SELECT * FROM clase_developers WHERE nombre = 'Carlos'

-- hago una consulta para verificar el registro que voy a actualizar y me aseguro que tenga un solo registro
SELECT * FROM clase_developers WHERE id = 18;

SELECT * FROM clase_developers WHERE id = 140;

SELECT * FROM clase_developers WHERE email = 'ricardo.molina@email.com';

-- TRUNCATE es una forma de eliminar todos los registros de una tabla
-- se reinicia el id a 1
TRUNCATE clase_developers;

DESCRIBE clase_developers;

-- son source se ejecuta la sentencia SQL que se encuentra en el archivo
-- filepath es la ruta del archivo
source filepath\005-insertar_mas_registros.sql

-- consulto los registro de nombre Juan
SELECT * FROM clase_developers WHERE nombre = 'Juan';

-- con REPLACE INTO se puede actualizar un registro existente o insertar uno nuevo
REPLACE INTO clase_developers (id, nombre, apellido, email, fecha_registro)
VALUES (5, 'Juan', 'Perez', 'juan.perez@correo.com', NOW());

SELECT * FROM clase_developers WHERE id = 5;

-- verifico que no existe el registro anterior de id 5
SELECT * FROM clase_developers WHERE email = 'elena.morales@email.com';

-- Si el registro no existe, se inserta
REPLACE INTO clase_developers (id, nombre, apellido, email, fecha_registro)
VALUES (172, 'Leonel', 'Suarez', 'leo.suarez@correo.com', NOW());

-- el id 172 es el ultimo y se inserta un nuevo reemplaza un registro numero 175
-- quedan registros sin usar en la tabla
REPLACE INTO clase_developers (id, nombre, apellido, email, fecha_registro)
VALUES (175, 'Juan', 'Marino', 'juan.marino@correo.com', NOW());

-- se inserta un nuevo registro con en uno de los id sin usar
INSERT INTO clase_developers (nombre, apellido, email, fecha_registro)
VALUES ('Ronald', 'Alexander', 'ralexrivero@gmail.com', NOW());

-- con NOW() se inserta la fecha actual
REPLACE INTO clase_developers (id, nombre, apellido, email, fecha_registro)
VALUES (173, 'Jackie', 'Chan', 'jackie.chan@correo.com', NOW());

-- insertar nuevo registro
INSERT INTO clase_developers (nombre, apellido, email, fecha_registro)
VALUES
('Deborah', 'Rivero', 'deby@email.com', NOW());
