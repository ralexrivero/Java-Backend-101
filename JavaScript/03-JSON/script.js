console.log('JSON');
// JSON: JavaScript Object Notation
// formato ligero de intercambio de datos

// convertir los objetos y arrays a formato JSON y viceversa

// 1) Serializacion (Convertir de Objeto a JSON)

const usuario = {
    nombre: "Carlos",
    edad: 30,
    hobbies: ["leer", "viajar", "fotografia"],
    direccion: {
        calle: "Rondeau 2815",
        ciudad: "Montevideo"
    }
};

const jsonUsuario = JSON.stringify(usuario);
// JSON.stingify() puede convertir objetos complejos, con arrays y objetos anidados
// No se incluyen en la cadena JSON: funciones y metodos del objeto original

// 2) Parseo (Convertir de JSON a Objeto)
// util para recibir datos de un servidor y trabajarlos en nuestro codigo

const json = '{"nombre":"Laura", "edad":28, "intereses":["Jardineria", "Programacion"]}';
const objeto = JSON.parse(json);

console.log(objeto);
