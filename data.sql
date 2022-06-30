-- "USUARIOS"
INSERT INTO USUARIOS VALUES (1,'Jhon','Jimenez','Operaciones','jjimenez@sikercompany.com');
INSERT INTO USUARIOS VALUES (2,'Juan','Perez','Compras','jperez@sikercompany.com');
INSERT INTO USUARIOS VALUES (3,'Pedro','Gonzalez','Logistica','pgonzalez@sikercompany.com');

-- "ESTADOS_ACTIVIDAD"

INSERT INTO ESTADOS_ACTIVIDAD VALUES (1,'Asignado');
INSERT INTO ESTADOS_ACTIVIDAD VALUES (2,'pendiente');


--  "ACTIVIDADES"

INSERT INTO ACTIVIDADES VALUES (3,'CompraInventario',2,('28/06/2022'));
INSERT INTO ACTIVIDADES VALUES (1,'DespachoPedidos',2,('01/06/2022'),1);
INSERT INTO ACTIVIDADES VALUES (2,'CompraInventario',2,('28/06/2022'),2);
 


-- "ACTIVIDAD_USUARIO"

INSERT INTO ACTIVIDAD_USUARIO VALUES (1,2,2);
INSERT INTO ACTIVIDAD_USUARIO VALUES (2,1,1);


-- SE REINICIAN LAS SECUENCIAS SEGÚN LOS DATOS INICIALES
SELECT setval('public.actividad_usuario_id_seq', 4, true);
SELECT setval('public.actividades_id_actividad_seq', 3, true);
SELECT setval('public.estados_actividad_id_estado_actividad_seq', 3, true);
SELECT setval('public.usuarios_id_usuario_seq', 3, true);