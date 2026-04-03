# 🛼 RollerSpeed - Sistema de Gestión

## 📌 Descripción

RollerSpeed es un sistema desarrollado en Spring Boot que permite gestionar estudiantes, instructores, clases y horarios.  
El proyecto está construido utilizando una arquitectura MVC con vistas HTML mediante Thymeleaf.

---

## 🚀 Tecnologías utilizadas

### 🔧 Backend
- Spring Boot
- Spring Data JPA
- Hibernate

### 🗄️ Base de datos
- MySQL

### 📦 Dependencias
- Lombok

### 🎨 Frontend
- Thymeleaf (vistas HTML)

---

## 🏗️ Arquitectura del proyecto

El sistema está organizado en capas:

- **Controller** → Maneja las peticiones HTTP
- **Service** → Contiene la lógica de negocio
- **Repository** → Acceso a la base de datos
- **Entity** → Representación de las tablas

---

## 📡 Documentación API (OpenAPI)

La documentación de los endpoints fue realizada utilizando OpenAPI en formato YAML.

📄 Archivo:

Esta documentación describe:

- Endpoints del sistema
- Métodos HTTP (GET, POST)
- Datos recibidos en formularios
- Tipos de respuestas

👉 Puede visualizarse en:
https://editor.swagger.io/

---

## ⚠️ Nota importante

El sistema no fue modificado a API REST, ya que está construido con controladores MVC que retornan vistas HTML.  
Por esta razón, la documentación OpenAPI fue realizada de forma manual.

---

## 📌 Funcionalidades principales

- Registro de estudiantes
- Registro de instructores
- Gestión de clases
- Visualización de horarios

---

## ▶️ Ejecución del proyecto

1. Clonar el repositorio
2. Configurar la base de datos en `application.properties`
3. Ejecutar el proyecto con:

```bash
mvn spring-boot:run