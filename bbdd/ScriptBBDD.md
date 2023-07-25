# Script MySql Archivarius
        
                -- Eliminar la base de datos si existe
                DROP DATABASE IF EXISTS archivarius;
                
                -- Crear la base de datos
                CREATE DATABASE archivarius;
                
                -- Usar la base de datos
                USE archivarius;
                
                -- Crear la tabla "user"
                CREATE TABLE user (
                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                  username VARCHAR(50) NOT NULL UNIQUE,
                  email VARCHAR(100) NOT NULL UNIQUE,
                  password VARCHAR(255) NOT NULL,
                  enabled BOOLEAN NOT NULL DEFAULT true
                );
                
                -- Crear la tabla "user_details"
                CREATE TABLE user_details (
                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                  user_id BIGINT NOT NULL,
                  full_name VARCHAR(100) NOT NULL,
                  email VARCHAR(100) NOT NULL,
                  phone VARCHAR(20),
                  FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE
                );
                
                -- Crear la tabla "rol"
                CREATE TABLE rol (
                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                  name VARCHAR(50) NOT NULL UNIQUE
                );
                
                -- Crear la tabla "user_rol"
                CREATE TABLE user_rol (
                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                  user_id BIGINT NOT NULL,
                  rol_id BIGINT NOT NULL,
                  FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE,
                  FOREIGN KEY (rol_id) REFERENCES rol(id) ON DELETE CASCADE
                );
                
                -- Insertar roles iniciales 
                INSERT INTO rol (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');

