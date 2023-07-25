# Script MySql Archivarius

    drop database if exists archivarius;
    create database archivarius;
    use archivarius;
    
    -- Crear la tabla "user"
    CREATE TABLE user (
      id INT AUTO_INCREMENT PRIMARY KEY,
      username VARCHAR(50) NOT NULL UNIQUE,
      password VARCHAR(255) NOT NULL,
      enabled BOOLEAN NOT NULL DEFAULT true
    );
    
    -- Crear la tabla "user_details"
    CREATE TABLE user_details (
      id INT AUTO_INCREMENT PRIMARY KEY,
      user_id INT NOT NULL,
      full_name VARCHAR(100) NOT NULL,
      email VARCHAR(100) NOT NULL,
      phone VARCHAR(20),
      FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE
    );
    
    -- Crear la tabla "rol"
    CREATE TABLE rol (
      id INT AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(50) NOT NULL UNIQUE
    );
    
    -- Crear la tabla "user_rol"
    CREATE TABLE user_rol (
      id INT AUTO_INCREMENT PRIMARY KEY,
      user_id INT NOT NULL,
      rol_id INT NOT NULL,
      FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE,
      FOREIGN KEY (rol_id) REFERENCES rol(id) ON DELETE CASCADE
    );
    
    -- Insertar roles iniciales 
    INSERT INTO rol (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');
