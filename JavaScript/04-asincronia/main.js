// Asincronia
// las operaciones como una solicitud de red, leer un archivo, o cualquier cosa que lleve tiempo, se realizar de manera asincronica
// para evitar que se bloquee el hilo principal de ejecucion

// Event loop y Modelo de concurrencia
// JS es un lenguaje de programacion de un solo hilo

// Event loop: monitorea la cola de mensajes y la pila de ejecucion.

console.log('Inicio');

setTimeout(() => {
    console.log("Procesamiento asincronico");
}, 5000);

console.log('Fin');

// setTimeout es una funcion asincronica, tiene un retraso de 5 segundos
// no bloquea la ejecucion, por eso se imprime 'Fin' y luego 'Procesamiento asincronico'

// Promesas y Manejo de Errores con try/catch

function obtenerDatos() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Datos recibidos");
        }, 2000)
    });
}

obtenerDatos().then(datos => {
    console.log(datos);
}).catch(error => {
    console.log("Error:", error)
});

// Fetch API para solicitudes HTTP

// es para realizar solicitudes, la Fetch API devuelve promesas que son compatible con async/await
// para hacer solicitudes de red

async function obtenerUsuarios() {
    try {
        let respuesta = await fetch('https://jsonplaceholder.typicode.com/posts');
        let usuarios = await respuesta.json();
        console.log(usuarios);
    } catch (error) {
        console.error("Error al obtener usuarios:", error);
    }
}

obtenerUsuarios();
