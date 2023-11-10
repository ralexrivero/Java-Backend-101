// sintaxis basica
// Variables, tipos de datos, operadores

// variables
// declaradas con `var`, `let` o `const`
// no usamos `var`
// `let` y `const` son la forma adecuada de declarar una variable

let mensaje = "Hello World!"; // variable local del tipo string
const PI = 3.1416; // variable local const que no se puede modificar

// tipos de datos
// numeros (enteros y flotantes)
// textos (strings)
// booleanos (true/false)
// Undefined y null

let nombre; // undefined, una variable no inicializada
// const renta; no se puede dejar sin inicializar una constante

nombre = 'Jose';
nombre = 'Jose Maria';
nombre = null;
nombre = 7;

console.log('Hola mundo!!!')

// Operadores
// Para realizar operaciones con variables o constantes
// Aritmeticos
// + - * / %
let a = 3;
let b = 8;
let c;

c = a + b * a / 2 ** 3 % 2
console.log(c)


// Asignacion
// = += -=

a += 2 // a = a + 2
console.log(a)
b -= 3 // b = b -3
console.log(b)


// Compracion
// == === != !==

let igualdad = 5 == '5'; // Igualdad debil: true
console.log(igualdad);
let identidad = 5 === '5'; // Igualdad estricta: false
console.log(identidad);
let desigualdad = 5 != '8'; // desigualdad debil: true
console.log(desigualdad)
let noIdentidad = 5 !== '5' // desigualdad estricta: true
console.log(noIdentidad)

// logicos
// && (AND) || (OR) ! (NOT)

let verdadero = true && true; // AND: true
let falso = true && false; // AND: false
let oVerdedero = true || false; // OR: true, true || true
let noVerdadero = !true // NOT: false
