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



https://github.com/Parralol/Taller07-AREP/assets/110953563/87517bf2-661c-4e12-ae66-19c00f40f649



## Ejecución de test

## Arquitectura del proyecto

### ¿Como escalaría su arquitectura de seguridad para incorporar nuevos servicios?

## Video de prueba

## Constuido con

