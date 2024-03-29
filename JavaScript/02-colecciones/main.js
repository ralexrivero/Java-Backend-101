// Colecciones de datos: arrays y objetos


// Objeto: colecciones de propiedades
// Arrays: listas ordenadas
// Manipulacion de esos datos: con sus metodos y propiedades para manipular el contenido

// Objetos

let persona = {
    nombre: 'Deborah',
    edad: 25,
    saludar: function() {
        console.log(`Hola, mi nombre es ${this.nombre}`);
    }
}

console.log(persona.nombre)
persona.saludar();

// Arrays
// seria genial que pruebes todos estos metodos en la consola para entender mejor como funcionan

let frutas = ['Manzana', 'Banana', 'Cereza', 'Pera'];
console.log(`El largo del array 'frutas' es de ${frutas.length}`) // 4

// push, agrega un elemento al final
frutas.push('Naranja')

// forEach

frutas.forEach(function(fruta) {
    console.log(`La fruta es: ${fruta}`);
});

// Push, pop, shift, unshift, slice, indexOf, splice

//push: agrega un elemento al final
frutas.push('Anana');
frutas.push('Ciruela');

console.log(frutas);

// pop: elimina el utlimo elemento (indice largo - 1)
frutas.pop();

// shift: elimina el primer elemento (indice 0) y lo retorna
frutas.shift();
//tambien puedo aprovechar ese retorno y almacenarlo en una variable o agregarlo a otro elemento

let frutaX = frutas.shift();
console.log(frutaX);

// unshift: agrega un elemneto al inicio del array
frutas.unshift('Melon');

// slice: devuelve una porcion en un nuevo array pero no modifica el original
let frutasSlice = frutas.slice(2, 4)
console.log(frutasSlice);

// splice: cambia el contenido o lo borra

frutas.splice(1, 1, 'Kiwi') // cambia la posicion 1 por Kiwi

frutas.splice(3, 1) // borra una porcion de un elemento, el indice 3 y no se desplaza a la derecha borrando mas elementos



// For in/ For of

for (let fruta of frutas) {
    console.log(fruta)
}

// for in es mas adecuado para los objetos
for (let propiedad in persona) {
    console.log(`${propiedad} : ${persona[propiedad]}`);
}


// Metodos de alto orden para Arrays
// son funciones que operan en otras funciones
// map(), es un metodo que crea un nuevo array con los resultados de llamar a una funcion para cada elemento del array

const numeros = [1, 2, 3, 4, 5];
const cuadrados = numeros.map(n => n * n); // [1, 4, 9, 16, 25]

// filter() crea un nuevo array con todos los elementos que pasan la prueba del filtro, que tambien esta en una funcion

const numeros2 = [5, 10, 15, 20];
const mayoresADiez = numeros2.filter(num => num > 10);

console.log(mayoresADiez); // [15, 20]

// reduce() ejectua una funcion reductora sobre cada elemento del array, devuleve un solo valor.

// numeros es el array inicial [1, 2, 3, 4, 5]
const suma = numeros.reduce((acumulador, valorActual) => acumulador + valorActual, 0); // el 0 es el valor inicial del acumulador
const producto = numeros.reduce((acumulador, valorActual) => acumulador * valorActual, 1); // el 0 es el valor inicial del acumulador

console.log(suma)
console.log(producto)
