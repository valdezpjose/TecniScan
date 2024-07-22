# Calculadora Aritmética

Este proyecto es una aplicación web que permite realizar operaciones aritméticas básicas (suma, resta, multiplicación y división). La aplicación está dividida en dos partes: el frontend, construido con Angular y Angular Material, y el backend, desarrollado con Spring Boot.

## Contenidos

- [Pre-requisitos](#pre-requisitos)
- [Instalación](#instalación)
- [Ejecución del Backend](#ejecución-del-backend)
- [Ejecución del Frontend](#ejecución-del-frontend)
- [Descripción del Proyecto](#descripción-del-proyecto)

## Pre-requisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- [Node.js](https://nodejs.org/) (versión 14 o superior)
- [Angular CLI](https://angular.io/cli) (versión 18 o superior)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (versión 11 o superior)
- [Maven](https://maven.apache.org/) (versión 3.6.3 o superior)

## Instalación

1. Clona este repositorio en tu máquina local:

   ```sh
   git clone https://github.com/valdezpjose/TecniScan.git
   cd TecniSccan

## Ejecución del Backend

1. Navega al directorio del backend
2. Compila y empaqueta el proyecto utilizando Maven: mvn clean install
3. Ejecuta la aplicación Spring Boot: mvn spring-boot:run


## Ejecución del Frontend

1. Navega al directorio del frontend
2. Instala las dependencias de Node.js utilizando npm: npm install
3. Ejecuta la aplicación Angular: ng serve

## Descripción del Proyecto
La Calculadora Aritmética permite a los usuarios realizar operaciones matemáticas básicas. La interfaz de usuario está diseñada con Angular Material para proporcionar una experiencia de usuario moderna y receptiva. El backend maneja las solicitudes de operaciones y devuelve los resultados correspondientes.

### Frontend
El frontend está desarrollado en Angular y utiliza Angular Material para los componentes de la interfaz de usuario. Proporciona una calculadora sencilla donde los usuarios pueden ingresar dos operandos y seleccionar una operación para obtener el resultado.

### Backend
El backend está construido con Spring Boot y expone una API REST para realizar las operaciones aritméticas. Cada operación (suma, resta, multiplicación, división) está disponible a través de un endpoint específico.