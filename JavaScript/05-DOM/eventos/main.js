//Eventos: son cualquier cosa que pasa en la pagina web.
// - click, presionar una tecla, cargar la pagina

// 1) Disparo el evento: por ej. el usuario hace clic
// 2) Escucha el evento: tengo que poner a escuchar a un 'listener'
// 3) Respueta al evento: que hago, que codigo ejecuto cuando lo esucho

// Agregar un evento `addEventListener`

const boton = document.getElementById('mostrarMensaje');

boton.addEventListener('click', function() {
    // recuperar el mensaje del campo de texto
    const mensaje = document.getElementById('mensajeInput').value;
    // recupero el area donde va el texto
    const area = document.getElementById('mensajeArea')
    // asignar el valor del mensaje al contexto del area de mensaje
    area.textContent = `Bienvenido ${mensaje}`;
})


// agregador de de texto

document.getElementById('agregarBoton').addEventListener('click',function() {
    // Obtenemos el texto del campo de texto (input)
    const texto = document.getElementById('agregarInput').value;
    // Creo un nuevo parrafo
    const nuevoParrafo = document.createElement('p');
    nuevoParrafo.textContent = texto;
    // agregar el nuevo parrafo al div 'agregarArea'
    document.getElementById('agregarArea').appendChild(nuevoParrafo);
    // limpiar el campo de texto de agregarlo
    document.getElementById('agregarInput').value = '';
});

// cambiar al tema oscuro

// const botonTema = document.getElementById('cambiarTema')
// botonTema.addEventListener('click', function() {
//     document.body.classList.add('dark');
// })

// alternar entre el modo oscuro o sin modo oscuro

// document.getElementById('cambiarTema').addEventListener('click', function() {
//     // verifico si body tienen la clase 'dark'
//     if (document.body.classList.contains('dark')) {
//         // si la tiene, se la borro
//         document.body.classList.remove('dark');
//     } else {
//         document.body.classList.add('dark');
//     }
// });

// alternar, pero mas facil

document.getElementById('cambiarTema').addEventListener('click', function() {
    document.body.classList.toggle('dark');
})

