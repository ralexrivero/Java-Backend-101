-- todos
SELECT * FROM clase_developers;
-- solo nombre y apellido
SELECT nombre, apellido
FROM clase_developers;
-- contar todos los registros
SELECT COUNT(*) as total_registros
FROM clase_developers;
-- todos los email que terminan con @gmail.com
SELECT email FROM clase_developers
WHERE email LIKE '%@gmail.com';
-- agrupar por nombre, obtener la cantidad de registros repetidos, ordenar de mayor a menor y mostrar los primeros 10
SELECT nombre, COUNT(*) as cantidad
FROM clase_developers
GROUP BY nombre
ORDER BY cantidad DESC
LIMIT 10;
SELECT apellido, COUNT(*) as cantidad
FROM clase_developers
GROUP BY apellido
ORDER BY cantidad DESC
LIMIT 5;
-- registros por anio y mes ordenado por cantidad de registros
SELECT EXTRACT(YEAR FROM fecha_registro) as anio, EXTRACT(MONTH FROM fecha_registro) as mes, COUNT(*) as cantidad
FROM clase_developers
GROUP BY anio, mes
ORDER BY cantidad DESC;
-- registros por anio y mes ordenado por fecha
SELECT EXTRACT(YEAR FROM fecha_registro) as anio, EXTRACT(MONTH FROM fecha_registro) as mes, COUNT(*) as cantidad
FROM clase_developers
GROUP BY anio, mes
ORDER BY cantidad DESC;
-- minimo registro
SELECT MIN(fecha_registro) as fecha_minima
FROM clase_developers;
--  maximo registro
SELECT MAX(fecha_registro) as fecha_maxima
FROM clase_developers;
-- combinar clausulas y funciones
SELECT
MIN(fecha_registro) as fecha_min,
MAX(fecha_registro) as fecha_max
FROM clase_developers;
-- listar personas que se registraron entre fechas
SELECT nombre, apellido, fecha_registro
FROM clase_developers
WHERE fecha_registro BETWEEN '2022-03-12' AND '2023-08-01';
--
SELECT COUNT(*) as total_registros
FROM clase_developers
WHERE fecha_registro BETWEEN '2023-01-01' AND '2023-05-31';
