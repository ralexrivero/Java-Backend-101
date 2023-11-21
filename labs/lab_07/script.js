document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('taskForm');
    const tasksContainer = document.getElementById('tasksContainer');

    form.addEventListener('submit', function(e) {
        e.preventDefault();
        const title = document.getElementById('taskTitle').value;
        const description = document.getElementById('taskDescription').value;

        // agregar tarea
        addTask(title, description);
        // editar tarea

        // borrar tarea

        // filtrar

        // limpiar el formulario
        form.reset();
    });
});

function addTask(title, description) {
    const taskDiv = document.createElement('div'); // <div></div>
    taskDiv.classList.add('task'); // <div class="task"></div>

    const checkbox = document.createElement('input');
    checkbox.type = 'checkbox';
    checkbox.classList.add('task-checkbox');
    checkbox.addEventListener('change', (e) => {
        if (e.target.checked) {
            taskDiv.classList.add('completed');
        } else {
            taskDiv.classList.remove('completed')
        }
    });

    const titleElement = document.createElement('h3');
    titleElement.textContent = title;

    const descriptionElement = document.createElement('p');
    descriptionElement.textContent = description;

    const deleteButton = document.createElement('button');
    deleteButton.textContent = 'X';
    deleteButton.classList.add('delete-button');
    deleteButton.addEventListener('click', () => {
        tasksContainer.removeChild(taskDiv);
    });

    taskDiv.appendChild(checkbox);
    taskDiv.appendChild(titleElement);
    taskDiv.appendChild(descriptionElement);
    taskDiv.appendChild(deleteButton);

    tasksContainer.appendChild(taskDiv);

    tasksContainer.appendChild(taskDiv);
}
