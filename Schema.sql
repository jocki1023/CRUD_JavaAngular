-- -----------------------------------------------------
-- Table "USUARIOS"
-- -----------------------------------------------------
CREATE TABLE  USUARIOS (
  "id_usuario" SERIAL NOT NULL,
  "nombre" VARCHAR(45) NOT NULL,
  "apellido" VARCHAR(45) NOT NULL,
  "area" VARCHAR(45) NOT NULL,
  "correo_electronico" VARCHAR(70) NULL,
  PRIMARY KEY ("id_usuario"));


-- -----------------------------------------------------
-- Table "ESTADOS_ACTIVIDAD"
-- -----------------------------------------------------
CREATE TABLE  ESTADOS_ACTIVIDAD(
  "id_estado_actividad" SERIAL NOT NULL,
  "estado" VARCHAR(20) NULL,
  PRIMARY KEY ("id_estado_actividad")); 



-- -----------------------------------------------------
-- Table "ACTIVIDADES"
-- -----------------------------------------------------
CREATE TABLE  ACTIVIDADES (
  "id_actividad" SERIAL NOT NULL,
  "nombre_actividad" VARCHAR(40) NULL,
  "id_estado_actividad" INT NULL,
  "fecha_inicio_actividad" DATE NULL,
  PRIMARY KEY ("id_actividad"),
    CONSTRAINT "fk_ESTADOS_ACTIVIDAD"
    FOREIGN KEY ("id_estado_actividad")
    REFERENCES ESTADOS_ACTIVIDAD ("id_estado_actividad")); 
  
  
  -- -----------------------------------------------------
-- Table "ACTIVIDAD_USUARIO"
-- -----------------------------------------------------
CREATE TABLE  ACTIVIDAD_USUARIO (
  "id" SERIAL NOT NULL,
  "id_actividad" INT NULL,
  "id_usuario" INT NULL,
  PRIMARY KEY ("id"), 
    CONSTRAINT "fk_USUARIOS"
    FOREIGN KEY ("id_usuario")
    REFERENCES USUARIOS ("id_usuario"),
	CONSTRAINT "fk_ACTIVIDADES"
    FOREIGN KEY ("id_actividad")
    REFERENCES ACTIVIDADES ("id_actividad"));
	
	
 ---------------------
 --ALTER 
 ---------------------
 
 ALTER TABLE ACTIVIDADES ADD COLUMN "id_usuario" INT;
 ALTER TABLE ACTIVIDADES ALTER COLUMN fecha_inicio_actividad type date;