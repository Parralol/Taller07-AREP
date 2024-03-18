# Taller07-AREP

Construccion de un servicio web seguro por medio de HTTPS

## Prerequisitos

*  Maven
*  Git
*  Java
*  AWS (Opcional)

## Intalación

  Con respecto a la instanciacion en EC2, es necario instalar git y maven (De ser necesario hay que actualizar java)

    sudo yum install java

    sudo yum install git

    sudo yum install maven

  Es bueno moverse a la carpeta de /opt ya que ahí mantenemos los programas de terceros, ahi clonaremos el repo

    cd /opt

  Despues es necesario clonar el repositorio

    sudo git clone https://github.com/Parralol/Taller07-AREP.git
    
  A la hora de instalar el programa es necesario ejecutar:

    sudo mvn clean install

    sudo mvn compile

    sudo mvn verify


## Ejecución

  Bajo la misma instancia vamos a ejecutar ambos mains

    sudo mvn exec:java -Dexec.mainClass="clase.taller.controller.Index"
    
    sudo mvn exec:java -Dexec.mainClass="clase.taller.controller.WebPage"

![image](https://github.com/Parralol/Taller07-AREP/assets/110953563/5f4ddde8-f187-4689-80e3-e5800742e792)

  Podemos observar la ejecucion de los mains desde diferentes consolas en la misma instancia

Como se puede observar en el apartado de *VIDEO DE PRUEBA*

el nombre de usuario es _admin_

la contraseña es _password_

## Ejecución de test

    mvn test

## Arquitectura del proyecto

  ![image](https://github.com/Parralol/Taller07-AREP/assets/110953563/480f3051-2197-4d71-8d46-c6dfe047cc51)

  Desde un bowser cualquiera se conecta por medio de https a un servidor fachada que nos permitira enviar la informacion necesaria (username & password) para poder acceder al segundo servidor, el cual podra entabla una comunicacion por medio de HTTPS de POST-GET, cada servidor possera un servicio por medio de spark, que estara escrito en java, ambos usando certificados y las llaves de los respectivos.

### ¿Como escalaría su arquitectura de seguridad para incorporar nuevos servicios?

  Al usar principios SOLID al priorizar la responsabilidad unica, modularizacion y tener baja cohesion, ademas de que el codigo posee valores para variables editables a gusto de uso de quien necesite, ademas de poseer los certificados en una carpeta, permitiendo la personalizacion y escalabilidad de la arquitectura.

## Video de prueba

  https://github.com/Parralol/Taller07-AREP/assets/110953563/87517bf2-661c-4e12-ae66-19c00f40f649

## Constuido con

* HTML
* Java
* AWS
* keytools
