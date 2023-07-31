# Archivarius

Instalacion de Lombok en macOs: descargar el jar y ejecutar en terminal:

    java -jar lombok.jar


## BBDD

### user

| Columna    | Tipo           | Restricciones                |
|------------|----------------|------------------------------|
| id         | BIGINT         | PRIMARY KEY, AUTO_INCREMENT  |
| username   | VARCHAR(50)    | NOT NULL, UNIQUE             |
| email      | VARCHAR(100)   | NOT NULL, UNIQUE             |
| password   | VARCHAR(255)   | NOT NULL                     |
| enabled    | BOOLEAN        | NOT NULL, DEFAULT true       |


### user_details

| Columna    | Tipo           | Restricciones                |
|------------|----------------|------------------------------|
| id         | BIGINT         | PRIMARY KEY, AUTO_INCREMENT  |
| user_id    | BIGINT         | NOT NULL                     |
| full_name  | VARCHAR(100)   | NOT NULL                     |
| email      | VARCHAR(100)   | NOT NULL                     |
| phone      | VARCHAR(20)    |                              |

### rol

| Columna    | Tipo           | Restricciones                |
|------------|----------------|------------------------------|
| id         | BIGINT         | PRIMARY KEY, AUTO_INCREMENT  |
| name       | VARCHAR(50)    | NOT NULL, UNIQUE             |

### user_rol

| Columna    | Tipo           | Restricciones                |
|------------|----------------|------------------------------|
| id         | BIGINT         | PRIMARY KEY, AUTO_INCREMENT  |
| user_id    | BIGINT         | NOT NULL                     |
| rol_id     | BIGINT         | NOT NULL                     |
