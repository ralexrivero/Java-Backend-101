// Selectores
// la maniplacion del DOM con JavaScript se realiza mediante:
// `getElementById`, `getElementsByClassName`, `querySelector`

// Seleccionar, modificar y actualizar elementos

// Seleccionar por el id
const parrafo23 = document.getElementById('parrafo_23');
console.log(parrafo23);

texto23 = 'Este es el texto de reemplazo, el original no lo voy a mostrar nunca.';

parrafo23.textContent = texto23;

// `querySelector`, selecciona el primer elemento que coincida con un selector CSS.

const primerParrafo = document.querySelector('.container p');
console.log(primerParrafo.textContent);

const parrafos = document.querySelectorAll('.container p');
console.log(parrafos)
console.log(parrafos[0].textContent)

// `getElementsByClassName`, selecciona todos los elementos que comparten una clase.

const mensajes = document.getElementsByClassName('mensaje');
for (const mensaje of mensajes) {
    console.log(mensaje.textContent);
}


// Cambiar un atributo

const parrafo2 = document.getElementById('parrafo2');
// <p class="texto-destacado">...
parrafo2.setAttribute('class', 'texto-destacado');

// Crear y eliminar nodos en JavaScript
// `createElement` y `createTextNode`

// `createElement`, crear un nuevo elemento HTML (parrafo, un div, un h3)

const nuevoDiv = document.createElement('div');
// una vez creado queda en memoria y no se asigna a nigun lado, no se coloca automaticamente en el DOM.

nuevoDiv.innerHTML = "Hola, soy el nuevo div";

const contenedor = document.getElementById('mi-contenedor');
contenedor.appendChild(nuevoDiv);

const eliminar = document.getElementById('eliminar');
// document.body.removeChild('eliminar')