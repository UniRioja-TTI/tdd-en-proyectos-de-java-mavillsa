Práctica III: TDD en Java y Spring BootAsignatura: Taller Transversal I: Programación y Proceso de Información Curso: 2025/2026 

Descripción del Proyecto
Este proyecto consiste en el desarrollo de un servicio de gestión de tareas pendientes (ToDo) utilizando la metodología TDD (Test-Driven Development). 
El sistema permite crear tareas, añadir correos a una agenda y enviar alertas automáticas cuando una tarea está fuera de plazo.

Estructura del Sistema
El proyecto está dividido en varias capas siguiendo un patrón de diseño profesional:
    ToDo: Clase JavaBean que representa una tarea (nombre, descripción, fecha límite y estado).
    DBStub: Emulación de una base de datos mediante colecciones.
    Repositorio: Capa de enlace de datos para gestionar tareas y correos.
    MailerStub: Servicio que emula el envío de correos electrónicos por consola.
    Servicio: Lógica de negocio y control de alertas de tareas caducadas.
    Tecnologías UtilizadasJava 17/18.
    Maven: Para la gestión de dependencias y el ciclo de vida del proyecto.
    JUnit 5: Para la realización de tests unitarios y de integración.
    Spring Boot: Empleado en la parte individual para la gestión de solicitudes web e inyección de dependencias.
Cómo ejecutar los tests
Para verificar que todas las funcionalidades son correctas, puedes ejecutar los tests desde tu IDE (Eclipse o IntelliJ) haciendo clic derecho en la carpeta de tests y seleccionando "Run as JUnit Test".
