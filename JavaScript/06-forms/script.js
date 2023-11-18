
// esperar a que se cargue el contenido del DOM (HTML) antes de ejecutar la funcion
document.addEventListener('DOMContentLoaded', function() {
    const formulario = document.getElementById('formularioRegistro');
    formulario.addEventListener('submit', validarFormulario);
});

function validarFormulario(evento) {
    // prevengo que se comporte de forma predeterminada, que es recargar la pagina o enviar datos al servidor
    evento.preventDefault();
    let nombre = document.getElementById('nombre').value;
    let email = document.getElementById('email').value;
    let password = document.getElementById('password').value;
    let mensajeError = document.getElementById('mensajeError');

    // validar nombre, email, password si la info es valida
    if (!validarNombre(nombre)) {
        mensajeError.textContent = "Nombre invalido";
        return;
    }

    if (!validarEmail(email)) {
        mensajeError.textContent = "Email invalido";
        return;
    }

    if (!validarPassword(password)) {
        mensajeError.textContent = "Password invalido";
        return;
    }

    // funciones de validacion, retorna True o False
    function validarNombre(nombre) {
        return nombre.length > 2;
    }

    function validarEmail(email) {
        // objeto de expresion regular
        const regexEmail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,5}$/;
        return regexEmail.test(email);
    }

    function validarPassword(password) {
        // ?= `lookahead positivo` verificacion de que una cadena coincide con un patron
        // (?=.*\d) cualquier digito positivo
        // (?=.*[a-z]) cualquier letra minuscula
        // (?=.*[a-z]) cualquier letra mayuscula
        // .{8,20}
        console.log(password);
        const regexPass = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}$/;
        return regexPass.test(password);
    }
}
