# Conversor de Monedas 

## :file_folder: Descripción del Proyecto
La aplicación de conversión de monedas es una herramienta sencilla que permite a los usuarios convertir cantidades de dólares estadounidenses (USD) a varias monedas latinoamericanas y viceversa. Utiliza la API de ExchangeRate-API para obtener las tasas de cambio actuales y proporciona una interfaz de línea de comandos para que los usuarios puedan realizar conversiones fácilmente.

## 🔨 Funcionalidades
- **Conversión de USD a Pesos Mexicanos (MXN)**
- **Conversión de Pesos Mexicanos (MXN) a USD**
- **Conversión de USD a Pesos Argentinos (ARS)**
- **Conversión de Pesos Argentinos (ARS) a USD**
- **Conversión de USD a Pesos Colombianos (COP)**
- **Conversión de Pesos Colombianos (COP) a USD**
- **Manejo de errores y validación de entradas para garantizar una experiencia de usuario robusta**

## :bulb: Cómo pueden usarlo los usuarios
1. **Clonar el repositorio**:
    ```bash
    git clone https://github.com/11Walker11/ConversorDeMonedasChallenge.git
    cd ConversorDeMonedasChallenge
    ```
2. :computer:**Agregar la dependencia de Gson al proyecto**:
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
3. :computer:**Ejecutar la aplicación**:
    ```bash
    javac -d out -cp .:path/to/gson-2.8.8.jar com/aluracursos/conversor/**/*.java
    java -cp out:path/to/gson-2.8.8.jar com.aluracursos.conversor.principal.Principal
    ```
4. :computer:**Interacción con la aplicación**:
    - Al iniciar la aplicación, se presentará un menú con opciones para convertir entre USD y las monedas soportadas (MXN, ARS, COP).
    - Seleccione una opción introduciendo el número correspondiente.
    - Ingrese la cantidad a convertir y la aplicación mostrará el resultado.
    
5. :computer:**Usar el menú de la aplicación**:
    - Al iniciar la aplicación, verá un menú con las siguientes opciones:
        ```
        1) Dolar ===> Peso Mexicano
        2) Peso Mexicano ===> Dolar
        3) Dolar ===> Peso Argentino
        4) Peso Argentino ===> Dolar
        5) Dolar ===> Peso Colombiano
        6) Peso Colombiano ===> Dolar
        7) Salir
        ```
    - Para seleccionar una opción, introduzca el número correspondiente y presione `Enter`.
    - La aplicación le pedirá que ingrese la cantidad de dinero que desea convertir.
    - Ingrese la cantidad y presione `Enter`. La aplicación mostrará el resultado de la conversión.
    - Para salir de la aplicación, seleccione la opción `7`.

## :mag_right: Donde los usuarios pueden encontrar eyuda sobre el proyecto
Para obtener ayuda sobre el proyecto, los usuarios pueden:
- Revisar la documentación del código y comentarios incluidos.
- Visitar la página de la API utilizada [ExchangeRate-API](https://www.exchangerate-api.com/)

## :stars: Autores del Proyecto
- *ALAN AMASTAL FABIAN* - [11Walker11](https://github.com/tu-usuario)


