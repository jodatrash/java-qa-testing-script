<div align="center"> 


# Java Testing Script

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-4.40.0-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

Script de automatización básico, diseñado para probar el flujo de inicio de sesión en [Demo Web Shop](https://demowebshop.tricentis.com/) utilizando **Selenium WebDriver**.
</div>

---

## 🚀 Características

- Navegación automatizada al portal de pruebas.
- Localización de elementos web (inputs, botones).
- Gestión de dependencias manual (sin Maven/Gradle) para entornos ligeros o educativos.
- Estructura clara separando código fuente y librerías.

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java 17
- **Framework:** Selenium WebDriver

---

## 📦 Requisitos previos

Antes de comenzar, asegúrate de contar con lo siguiente instalado:

1.  **Java Development Kit (JDK) 17**: [Descargar aquí](https://www.oracle.com/java/technologies/downloads/#java17).
2.  **Selenium WebDriver 4.40.0**: [Descarga aquí](https://www.selenium.dev/downloads/)
3.  **Navegador Web**: Google Chrome (Recomendado para Selenium).
4.  **IDE Recomendado:** IntelliJ IDEA / VSCode
5.  **Crea una cuenta** en: [Demo Web Shop](https://demowebshop.tricentis.com/)

_\*No es necesario que sea una cuenta legítima, por ejemplo:_ `your-email@test.com`

---

## 🔧 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/jodatrash/java-qa-testing-script.git
```

### 2. Descargar Selenium

Descarga Selenium para Java desde el [sitio oficial](https://www.selenium.dev/downloads/):

### 3. Configurar dependencias

1. Descomprime el archivo:
   ```
   selenium-java-4.40.0.zip
   ```
2. Copia el contenido de la carpeta:
   ```
   selenium-java-4.40.0
   ```
3. Pégalo dentro del proyecto en la ruta:
   ```
   java-qa-testing-script/lib
   ```

---

## 🗂️ Estructura del proyecto

El proyecto se organiza de la siguiente manera:

```text
java-qa-testing-script/
│
├── src/            # Código fuente del script de automatización
├── lib/            # Dependencias de Selenium WebDriver
├── .gitignore      # .gitignore del proyecto
├── LICENSE.md      # Licencia del proyecto
└── README.md       # Documentación
```

- `src`: Contiene el código Java de las pruebas automatizadas.
- `lib`: Incluye las librerías necesarias de Selenium.

---

## ⚡ Ejecución

Para ejecutar el script, asegúrate de que `classpath` incluya la carpeta `lib`,
Si usas (VSCode/IntelliJ), añade los JARs de `/lib` a las "Referenced Libraries".

1. Agregar variables de entorno en el IDE (IntelliJ):
   ```
   USER_EMAIL=YOUR-EMAIL-FOR-LOGIN
   PASSWORD=YOUR-PASSWORD-FOR-LOGIN
   ```
2. Compilar:

   ```
   javac -cp "lib/*;src" -d bin src/MainApp.java
   ```

   (Nota: En Linux/Mac usa `:` en lugar de `;` como separador del classpath).

3. Ejecutar:
   ```
   java -cp "lib/*;bin" MainApp
   ```

---

## 🧪 Alcance de las pruebas

Actualmente, el script automatiza:

- Navegación al sitio de prueba
- Flujo básico de inicio de sesión (login)
- Validación del comportamiento esperado

Este proyecto puede ampliarse fácilmente para incluir:

- Pruebas negativas
- Validaciones adicionales
- Integración con frameworks de testing (JUnit, TestNG)
- Reportes de resultados

---

## 👤 Autor

- **Jonathan Pacheco Cruz** - _Trabajo inicial / Core_ - GitHub: [Jodatrash](https://github.com/Jodatrash)

---

## 📄 Licencia

Este proyecto está bajo la **Licencia MIT** - consulta el archivo [LICENSE](LICENSE) para más detalles.

Siéntete libre de **usar, modificar o compartir** este proyecto.
