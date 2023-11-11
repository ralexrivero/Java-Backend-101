// Funciones
// Declaracion de funciones


// Tradicional

function saludo() {
    console.log('Hola desde la funcion');
};

saludo(); // llama la funcion y escribe en consola: 'Hola desde la funcion'

// Expresiones de Funcion
// a diferencia de las declaraciones, las expresiones de funcion pueden ser anonimas y asignadas a variables

const despedida = function() {
    console.log('Adios desde la expresion de funcion');
};

despedida(); // Imprime 'Adios desde la expresion de funcion'

// Funciones Flecha, Arrow Function

const saludoFlecha = () => {
    console.log('Hola desde la funcion flecha')
};

saludoFlecha(); // Imprime: 'Hola desde la funcion flecha

// Alcance (Scope) y Hoisting

// Alcance
// Es el contexto en el que las variables y funciones son accesibles. Hay global y local

let variableGlobal = 'Global';

function verificarAlcance() {
    let variableLocal = 'Local';
    console.log(variableGlobal); // Accesible
    console.log(variableLocal); // Accesible
}

verificarAlcance();
// console.log(variableLocal) // Error: esta variables no es definida en este contexto

// Hoisting
// compartamiento de mover las declaraciones al inicio del script o de la funcion

let unaVariable = 'Ahora si existe';
console.log(unaVariable); // undefined, debido al hoisting

// Closures
// una funcion que recuerda el alacance en el que fue creada, aunque se ejecute en un alcance diferente

function crearSaludo(nombre) {
    return function() {
        console.log('Hola, ' + nombre);
    };
}

const saludoJuan = crearSaludo('Juan');
saludoJuan(); // Imprime: Hola, Juan

// Funciones de orden superior
// son funciones que pueden tomar otras funciones como argumentos y retornalas como valores

function ejecutarFuncion(fn) {
    fn();
}

ejecutarFuncion(()=> console.log('Esta es una funcion de orden superior'));

// Programacion funcional
const numeros = [1, 2, 3, 4, 5]; // array
const numerosDobles = numeros.map(n => n * 2);
console.log(numerosDobles);

const filtrarPares = numeros => numeros.filter(n => n % 2 === 0); // el modulo 2 de un numero par siempre es 0

const pares = filtrarPares([1, 2, 3, 4, 5, 6]);
console.log(pares);

// Repaso Funciones de orden superior

function saludar(nombre) {
    return `Hola, ${nombre}!`;
}

// callback es una funcion como argumento a otra funcion, luego esa funcion la invoca desde adentro.

function procesarEntrada(usuario, callback) {
    return callback(usuario);  // saludar('Rob')
}

console.log(procesarEntrada("Rob", saludar))

// Hoisting

console.log(miFuncion()); // esto va a funcionar bien

function miFuncion() {
    return 'El hoisting funciona';
}
