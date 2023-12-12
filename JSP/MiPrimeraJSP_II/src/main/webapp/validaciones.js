document.getElementById('formularioRegistro').addEventListener('submit', function(event) {
    let nombre = document.getElementsByName('nombre')[0].value;
    let edad = document.getElementsByName('edad')[0].value;

    if (nombre.trim() === '' || edad.trim() === '') {
        alert('Por favor, rellena todos los campos');
        event.preventDefault();
    } else if (parseInt(edad) < 18) {
        alert('Debes ser mayor de 18 para registrarte');
        event.preventDefault();
    }
});
