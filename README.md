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

    sudo git clone 
    
  A la hora de instalar el programa es necesario ejecutar:

    mvn clean install

    mvn compile

    mvn verify


## Ejecución

    mvn exec:java -Dexec.mainClass="clase.taller.controller.Index"
    
    mvn exec:java -Dexec.mainClass="clase.taller.controller.WebPage"


## Ejecución de test

## Arquitectura del proyecto

### ¿Como escalaría su arquitectura de seguridad para incorporar nuevos servicios?

## Video de prueba

## Constuido con

