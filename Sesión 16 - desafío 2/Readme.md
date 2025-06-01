# Muestra un menú de opciones al usuario donde podrá:
1. Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota. 
💡Para lograr esto, te recomendamos utilizar un array de tipo String para almacenar los nombres de los alumnos y un array de tipo Double para guardar las notas correspondientes. De esta manera, podrás asociar los nombres con las notas utilizando los índices de los arrays.

2. Mostrar todos los alumnos: Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta el momento.
3. Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.
4. Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su nota si el alumno existe.
5. Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su nota si el alumno existe.
6. Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.
Salir: Terminar el programa.

# Características:
- El programa debe validar que el nombre no esté vacío y que la nota sea un número válido entre 0.00 y 10.00.
- El programa debe utilizar las estructuras de control adecuadas (if, switch, for, while, do-while) según corresponda para implementar las diferentes opciones del menú.
- El programa debe manejar excepciones utilizando bloques try-catch para manejar posibles excepciones al leer datos de entrada del usuario.
- Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción hasta que elija la opción "Salir".
