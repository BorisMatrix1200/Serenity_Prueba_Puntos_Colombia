# Proyecto Automatización Tricount - Serenity BDD, Screenplay, Appium y Cucumber

## Descripción
Este proyecto implementa la automatización de pruebas funcionales para la aplicación móvil Tricount, utilizando el patrón Screenplay con Serenity BDD, Appium y Cucumber. Permite validar flujos críticos como inicio de sesión, creación de grupos, registro de gastos y liquidación de saldos en dispositivos Android.

## Estructura del Proyecto

- **src/test/java/com/example/screenplay/**
  - `tasks/`: Acciones atómicas (Tasks) del Screenplay.
  - `questions/`: Validaciones y consultas (Questions).
  - `interactions/`: Interacciones personalizadas.
  - `ui/`: Page Objects (localizadores de elementos).
  - `stepdefinitions/`: Definiciones de pasos de Cucumber.
  - `runners/`: Runners de pruebas (JUnit/Cucumber).
- **src/test/resources/features/**
  - Archivos `.feature` escritos en Gherkin.
  - Historias de usuario y criterios de aceptación.
- **pom.xml**: Configuración de dependencias y plugins Maven.
- **serenity.properties / serenity.conf**: Configuración de Serenity y Appium.
- **azure-pipelines.yml**: Integración continua (opcional).

## Instalación y Ejecución

1. **Requisitos previos:**
   - Java 17+
   - Maven 3.8+
   - Node.js y Appium Server (para pruebas móviles)
   - Dispositivo o emulador Android configurado

2. **Instalar dependencias:**
   ```bash
   mvn clean install
   ```

3. **Ejecutar pruebas:**
   ```bash
   mvn clean verify
   ```
   Los reportes se generan en `target/serenity-reports/index.html`.

## Estructura de los Features

- **Inicio de sesión con Google** (válido e inválido)
- **Creación de grupo de gastos**
- **Registro de gasto compartido**
- **Visualización y liquidación de saldos**

Cada escenario está alineado con historias de usuario y criterios de aceptación documentados en `tricount_user_stories.txt`.

## Buenas Prácticas
- Código documentado en español (Javadoc y comentarios).
- Separación de responsabilidades (Tasks, Questions, UI, Steps).
- Reutilización y atomización de acciones.
- Escenarios claros y mantenibles en Gherkin.
- Configuración centralizada y segura.

## Recursos útiles
- [Serenity BDD](https://serenity-bdd.github.io/)
- [Screenplay Pattern](https://serenity-bdd.github.io/theserenitybook/latest/screenplay.html)
- [Appium](https://appium.io/)
- [Cucumber](https://cucumber.io/)

## Contacto
Para dudas o mejoras, contactar al equipo de QA o al responsable del proyecto.

