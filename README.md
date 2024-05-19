# Conversor de Monedas 

## Descripción del Proyecto
La aplicación de conversión de monedas es una herramienta sencilla que permite a los usuarios convertir cantidades de dólares estadounidenses (USD) a varias monedas latinoamericanas y viceversa. Utiliza la API de ExchangeRate-API para obtener las tasas de cambio actuales y proporciona una interfaz de línea de comandos para que los usuarios puedan realizar conversiones fácilmente.

## Funcionalidades
- **Conversión de USD a Pesos Mexicanos (MXN)**
- **Conversión de Pesos Mexicanos (MXN) a USD**
- **Conversión de USD a Pesos Argentinos (ARS)**
- **Conversión de Pesos Argentinos (ARS) a USD**
- **Conversión de USD a Pesos Colombianos (COP)**
- **Conversión de Pesos Colombianos (COP) a USD**
- **Manejo de errores y validación de entradas para garantizar una experiencia de usuario robusta**

## Cómo Pueden Usarlo los Usuarios
1. **Clonar el repositorio**:
    ```bash
    git clone https://github.com/tu-usuario/currency-converter.git
    cd currency-converter
    ```
2. **Agregar la dependencia de Gson en tu proyecto**:
    - Para Maven, añade esto a tu `pom.xml`:
      ```xml
      <dependency>
          <groupId>com.google.code.gson</groupId>
          <artifactId>gson</artifactId>
          <version>2.8.8</version>
      </dependency>
      ```
    - Para Gradle, añade esto a tu `build.gradle`:
      ```gradle
      implementation 'com.google.code.gson:gson:2.8.8'
      ```
3. **Ejecutar la aplicación**:
    ```bash
    javac -d out -cp .:path/to/gson-2.8.8.jar com/aluracursos/conversor/**/*.java
    java -cp out:path/to/gson-2.8.8.jar com.aluracursos.conversor.principal.Principal
    ```
4. **Interacción con la aplicación**:
    - Al iniciar la aplicación, se presentará un menú con opciones para convertir entre USD y las monedas soportadas (MXN, ARS, COP).
    - Seleccione una opción introduciendo el número correspondiente.
    - Ingrese la cantidad a convertir y la aplicación mostrará el resultado.

## Donde los Usuarios Pueden Encontrar Ayuda Sobre su Proyecto
Para obtener ayuda sobre el proyecto, los usuarios pueden:
- Revisar la documentación del código y comentarios incluidos.
- Visitar la página de la API utilizada [ExchangeRate-API](https://www.exchangerate-api.com/)
- Crear un issue en el repositorio de GitHub.

## Autores del Proyecto
- **Tu Nombre** - *ALAN AMASTAL FABIAN* - [11Walker11](https://github.com/tu-usuario)


