# TALLER DE CLIENTES Y SERVICIOS

Este taller busca entender como funciona Cliente-Servidor realizando operaciones matemáticas, también se realiza un httpServer queriendo tener respuesta de un servidor por medio de un browser usando el protocolo http

## Autor ✒️


* **Jose María Castro Ortega** - *Autor*  - *Estudiante de ingeniería de sistemas*
* **07/09/2021** - *Fecha* 


## Tabla de contenido

- [Circleci](#circleci).
- [Requisitos](#requisitos-).
- [Comenzando](#comenzando-).
- [Ejecutando las pruebas](#ejecutando-las-pruebas)
- [Diagrama de clases](#diagrama-de-clases-).
- [Latex](#latex)
- [Productividad](#productividad-).
- [Javadoc](#javaDoc-).
- [Licencia](#licencia-)

## Circleci

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS)


### Requisitos 📋
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Git](https://git-scm.com/) - Software de control de versiones
* [Java](https://www.oracle.com/java/) - Lenguaje de programación



## Comenzando 🚀
1. Clonar el repositorio
```
git clone https://github.com/Jose1102/WorkNetworking
```

2. Compilar el proyecto

```
mvn package
```



3. Ejecutar el proyecto 

### EJERCICIO 1

Escriba un programa en el cual usted cree un objeto URL e imprima en pantalla cada uno de los componentes de una URL. Es decir , debe usar los siguientes métodos: getProtocol, getAuthority, getHost, getPort, getPath, getQuery, getFile, getRef. Asegúrese que ninguno imprima una cadena vacía, esto implica que la URL que use para su objeto debe contener datos suficientes.

Se debe ejecutar la clase Url.java. Luego de ello en la consola nos aparecerá la información correspondiente como se muesta a continuación:

![URL](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/url.PNG)


### EJERCICIO 2

Escriba una aplicación browser que dada una URL lea datos de esa dirección y que los almacene en un archivo con el nombre resultado.html. Intente ver este archivo en el navegador. Su implementación debe ser un programa que reciba el parámetro de URL por medio de la línea de comandos.


Se debe ejecutar primero la clase UrlReader, donde debemos ingresar en la consola el link de una pagina de estilo http://link.com

![URLREADER](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/UrlReader.PNG)
 
⚠️ Se crea un archivo resultado.html en la carpeta WWW con el código fuente de la pagina ingresada

### EJERCICIO 3

Usando sockets escriba un servidor que reciba un número y responda el cuadrado de este número. Escriba un cliente para probarlo y envíele una secuencia de 20 números.

Se debe ejecutar primero la clase SquareServer como se muestrá a continuación

![Squaree](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/squareServer1.PNG)


Luego se ejecuta la clase SquareClient, donde se debe ingresar el número, para cerrar el servidor se coloca la palabra Bye. Se realiza una secuenia de 20 números y se cierra el servidor

![SQUARECLIENT](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/squareClient.PNG)


Al momento de enviar la palabra Bye. Se puede observar que el servidor se cerró de forma correcta y que recibió la secuencia de números

![AS](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/squareServer.PNG)


### RETO 1

Escriba un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos los archivos solicitados, incluyendo páginas html e imágenes. Construya un sitio web con javascript para probar su servidor. Despliegue su solución en Heroku. NO use frameworks web como Spark o Spring use solo Java y las librerías para manejo de la red

Si se desea correr de forma local lo que se debe hacer es correr la clase MultipleServer como se muestrá a continuación

![MULTIPLESERVER](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/multiServer1.PNG)
 
Luego de ello se coloca en el browser ``` localhost:35000/mypage.html ``` como se ve a continuación

![AAA](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/multiServer2.PNG)


## Ejecutando las pruebas ⚙️

1. Compilar pruebas

```
mvn test
```
![PRUEBAS](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/images/test.PNG)

## Diagrama de clases 📖



![DIAGRAMA3](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/square.PNG)


En este diagrama se puede observar dos clases una que es cliente y la otra el servidor. Realiza el cuadrado de un número 



![DIAGRAMA4](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/url.PNG)


Su objetivo es poder mostrar información por medio de una variable de tipo URL, donde su propósito es mostrar información básica de un link.



![DIAGRAMA5](https://github.com/Jose1102/WorkNetworking/blob/master/images/diagrama/urlreader.PNG)


Por último, esta clase por medio de un entrada de una url este guarda el código html en un archivo resultado.html

 
## Latex

[DOCUMENTO](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/latex/docLatex.pdf)

## Productividad 🛠️
891 loc / 17 horas

## JavaDoc 📖

Para consultar la carpeta de [JAVADOC](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/tree/main/JavaDoc) .

## Licencia 📌

Este proyecto está bajo la Licencia Pública General GNU - consulte el archivo de [LICENCIA](https://github.com/Jose1102/AREP-TALLER-CLIENTES-Y-SERVICIOS/blob/main/LICENSE.txt) para obtener más detalles.
