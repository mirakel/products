## Información del Proyecto

- **Versión de Java:** 17
- **Base de Datos:** Oracle 19c
- **Spring Boot:** 3.3.4

## Instrucciones para Levantar la Base de Datos

Para levantar la base de datos en Docker, ejecuta el siguiente comando:

```bash
docker-compose up 
```

## Crear una Secuencia en la Base de Datos

Para crear una secuencia en la base de datos, primero conéctate a ella y ejecuta el siguiente comando SQL:

```sql
CREATE SEQUENCE MPACO.SEQ_PRODUCTS 
    INCREMENT BY 1 
    MINVALUE 1 
    MAXVALUE 1000000 
    NOCYCLE 
    CACHE 20 
    NOORDER;
```

## Ejecutar el Archivo JAR
Para ejecutar la aplicación, utiliza el siguiente comando:

```bash
java -jar products-0.0.1-SNAPSHOT.jar
```

## Postman
Puedes importar el archivo **Products.postman_collection.json** en Postman.