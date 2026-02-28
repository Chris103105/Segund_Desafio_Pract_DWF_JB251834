# Sistema de Gestión Académica - Desafío Práctico 1

Este proyecto es una aplicación backend desarrollada con **Spring Boot** y **Java**, diseñada para gestionar la inscripción de alumnos en materias impartidas por profesores. Implementa una arquitectura basada en entidades relacionales utilizando **Spring Data JPA** y una base de datos **H2**.

##  Demostración del Proyecto

 demostración del funcionamiento del sistema en el siguiente enlace:
https://drive.google.com/drive/folders/1i7uSR6TawZz3K4B05m7MTl4L3lDXAxLu?usp=drive_link

##  Tecnologías y Dependencias

El proyecto está construido utilizando las siguientes herramientas y dependencias principales:

* **Java** (JDK 17 o superior recomendado)
* **Spring Boot** (Framework principal)
* **Spring Data JPA** (Para el mapeo objeto-relacional / ORM)
* **H2 Database** (Base de datos en memoria/archivo para desarrollo y pruebas)


## Estructura de la Base de Datos

El sistema modela las siguientes entidades y sus relaciones:
1.  **Profesor:** Entidad independiente.
2.  **Materia:** Entidad dependiente (`@ManyToOne` con Profesor). No permite materias huérfanas.
3.  **Alumno:** Se relaciona con Materia mediante una tabla intermedia (`@ManyToMany`).

* La estructura inicial y los datos se cargan automáticamente al iniciar la aplicación mediante los scripts `schema.sql` y `data.sql`.*

##  Cómo clonar y ejecutar el proyecto

Sigue estos pasos para desplegar el proyecto en tu entorno local:

### 1. Clonar el repositorio
Abre la terminal y ejecuta el siguiente comando:
```bash
git clone  https://github.com/Chris103105/Primer_desafio_Pract_DWF_JB251834.git
2. Abrir en el IDE
Abre el proyecto en IntelliJ IDEA (o tu editor de preferencia).

Espera a que Maven/Gradle descargue todas las dependencias necesarias.

