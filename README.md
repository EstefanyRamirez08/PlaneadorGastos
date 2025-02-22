# 🏦 Proyecto de Gestión de Gastos

## 📌 Estado del Proyecto
Este proyecto está en construcción y tiene como objetivo desarrollar una aplicación para la gestión de gastos personales y empresariales.  
Se espera que la aplicación incluya:  
✅ Autenticación segura  
✅ Administración de usuarios  
✅ Gestión de categorías de gastos  
✅ Generación de reportes  

---

## 📝 Descripción
Este sistema permite a los administradores y usuarios gestionar información relevante sobre usuarios, categorías y gastos de manera segura y eficiente.

---

## 🚀 Funcionalidades Planeadas

### 🔹 1. Implementación de la Lógica de Negocio  
#### 📂 Clases principales:
- **UsuarioDAO**: Maneja la autenticación, registro y roles.  
- **GastoDAO**: Gestiona el registro y consulta de gastos.  
- **CategoriaDAO**: Permite agregar, editar o eliminar categorías.  

#### 🔧 Clases de Servicio:
- **UsuarioServicio**: Controla la lógica de registro e inicio de sesión.  
- **GastoServicio**: Calcula los reportes de gastos y distribuye el presupuesto.  
- **CategoriaServicio**: Administra las categorías disponibles y su distribución.  

---

### 🎨 2. Desarrollo de la Interfaz Gráfica con JavaFX  
📌 **Pantallas principales:**  
- 🔑 Inicio de sesión: Ingreso de usuario y contraseña.  
- 🛠️ Administración: Gestión de usuarios y categorías (solo administradores).  
- 📋 Registro de gastos: Ingreso de gastos por categoría.  
- 📊 Reportes: Generación de reportes en PDF o Excel.  

---

### 📊 3. Generación de Reportes  
- 📄 **iText**: Exportación de reportes a **PDF**.  
- 📊 **Apache POI**: Exportación de reportes en **Excel**.  

---

### 🔐 4. Seguridad y Roles  
- 🔒 **Encriptación SHA-256** para almacenar contraseñas (se planea mejorar con bcrypt o similar).  
- 👤 **Control de roles** para restringir accesos según el perfil del usuario.  

---

### 🛠️ 5. Pruebas y Ajustes  
- ✅ **Pruebas de usuario** para validar la funcionalidad del sistema.  
- 🔄 **Verificación de cálculos** en reportes y autenticación.  

---

### 🌍 6. Despliegue  
- 🏠 **Modo local**: Se ejecutará en el entorno local del usuario.  
- 🚀 **Compartición**: Se empaquetará como un **JAR ejecutable** o se desplegará en un **servidor web**.  

---

## 📂 Estructura del Proyecto  
El sistema está dividido en los siguientes paquetes:

📌 **com.servicio** → Contiene la lógica de negocio (*UsuariosServicio, CategoriasServicio, GastosServicio*).  
📌 **com.entidades** → Contiene las clases de las entidades (*Usuarios, Gastos, Categorias*).  
📌 **com.persistencia** → Contiene las clases de acceso a datos (*UsuariosDAO, GastosDAO, CategoriasDAO*).  
📌 **com.menu** → Contiene MenuPrincipal, que maneja la interacción con el usuario.  

---
## 🔧 Instalación y Uso  

1️⃣ **Clonar el repositorio**  

git clone https://github.com/EstefanyRamirez08/PlaneadorGastos.git

2️⃣ Asegurar que Java está instalado en el sistema.

3️⃣ Ejecutar la clase MenuPrincipal para interactuar con el sistema.

---

✅ Funcionalidades Implementadas

👤 Gestión de Usuarios

✔️ Registrar usuarios con nombre, correo, contraseña y rol.

✔️ Autenticación con validación de credenciales.

✔️ Actualización y eliminación de usuarios.

✔️ Listado de usuarios registrados.

---

📁 Gestión de Categorías

✔️ Creación, actualización y eliminación de categorías.

✔️ Listado de categorías existentes.

---

🔐 Seguridad

✔️ Uso de SHA-256 para encriptar contraseñas.

✔️ Verificación de roles y permisos específicos.

---

👨‍💻 Autor

💡 Desarrollado por EstefanyRamirez08.

Este proyecto sigue en desarrollo. ¡Las sugerencias y mejoras son bienvenidas! 🚀

📌 ¡Gracias por visitar este repositorio! Si te gusta e
