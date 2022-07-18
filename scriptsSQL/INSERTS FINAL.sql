--ALMACEN
INSERT INTO ALMACEN (id_almacen,tipo_almacen,direccion_almacen) VALUES
(1,'ALMACEN DE POLOS','GAMARRA');
INSERT INTO ALMACEN (id_almacen,tipo_almacen,direccion_almacen) VALUES
(2,'ALMACEN DE ROLLOS DE TELA','COMAS');

--TIPO_ESTANTE
insert into TIPO_ESTANTE (id_tipo_estante, color_estante) values
(1, 'BLANCO');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(2, 'ROJO');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(3, 'ROSADO');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(4, 'AMARILLO');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(5, 'VERDE');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(6, 'CELESTE');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(7, 'AZUL');
insert into TIPO_ESTANTE (id_tipo_estante, color_estante)values
(8, 'NEGRO');

-- ESTANTES
--DE POLOS 1-4
-- POLOS BLANCOS
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(1,1,1);
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(2,1,1);
-- POLOS ROJOS
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(1,2,1);
-- POLOS NEGROS
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(2,8,1);

-- DE TELAS 5-8

--TELAS VERDES
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(1,5,2);
-- TELAS CELESTES
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(2,6,2);
-- TELAS AZULES
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(1,7,2);
-- TELAS NEGRAS
INSERT INTO ESTANTE(numero_pasillo, id_tipo_estante, id_almacen) VALUES
(2,8,2);

-- TIPO_ESPACIO
--POLOS

insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(1, 'TALLA 2',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(2,'TALLA 4',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(3, 'TALLA 6',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(4,'TALLA 8',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(5, 'TALLA 10',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(6,'TALLA 12',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(7, 'TALLA 14',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(8, 'TALLA 16',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(9,'TALLA S',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(10, 'TALLA M',10);
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(11,'TALLA L',10);
--TELAS
insert into TIPO_ESPACIO(id_tipo_espacio, talla_espacio,capacidad) values
(12,'TELA',10);

--ESPACIOS

/* 
 * LA REGLA ES QUE TODO ESTANTE TIENE 4 ESPACIOS (2 FILAS Y 2 COLUMNAS)
 */
--DE POLOS
-- POLOS BLANCOS TALLA 2,S,M,L 
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,1,1);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,9,1);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,10,1);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,11,1);

INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,1,1,1);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,2,9,1);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,1,10,1);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,2,11,1);

--POLOS BLANCOS TALLA 4,6,8,10
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,2,2);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,3,2);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,4,2);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,5,2);

INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,1,2,2);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,2,3,2);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,1,4,2);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,2,5,2);
--POLOS ROJOS TALLA 16,S,M,L
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,1,3);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,9,3);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,10,3);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,11,3);

INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,1,1,3);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,2,9,3);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,1,10,3);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,2,11,3);
--POLOS NEGROS TALLA 16,S,M,L
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,1,4);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,9,4);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,10,4);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,11,4);

INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,1,1,4);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(3,2,9,4);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,1,10,4);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(4,2,11,4);

-- DE TELAS
--ID TIPO_ESPACIO DEBE SER 12,  (START ID_ESTANTE:6 ID_ESPACIO: 9)
--TELAS VERDES
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,12,5);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,12,5);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,12,5);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,12,5);
--TELAS CELESTES
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,12,6);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,12,6);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,12,6);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,12,6);
--TELAS AZULES
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,12,7);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,12,7);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,12,7);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,12,7);
--TELAS NEGRAS
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,1,12,8);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(1,2,12,8);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,1,12,8);
INSERT INTO ESPACIO(numero_fila,numero_columna,id_tipo_espacio,id_estante) VALUES
(2,2,12,8);

-- BIENES
/* COLORES:
 * BLANCO
 * ROJO
 * ROSADO
 * AMARILLO
 * VERDE
 * CELESTE
 * AZUL
 * NEGRO
 * LOS NO UBICADOS SE PONE NULL
 */

--POLOS BLANCOS (E1-E4 Y E5-E8) TALLA S UBICADOS EN E2
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',25,'BLANCO',2);

--POLOS BLANCOS(E1-E4 Y E5-E8) TALLA 2 
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',20,'BLANCO',NULL);
-- POLOS ROJOS (E9-E12)TALLA S
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',20,'ROJO',NULL);
-- POLOS NEGROS (E13-E16)TALLA S
INSERT INTO BIEN (estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',20,'NEGRO',NULL);

--TELAS VERDES (E17-20) UBICADO EN E17
INSERT INTO BIEN(estado_bien,peso_bien,color_bien,id_espacio) VALUES
('UBICADO',500,'VERDE',17);
--TELAS VERDES (E17-20) RECIBIDOS 
INSERT INTO BIEN(estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',500,'VERDE',null);
--TELAS CELESTES (E21-E24) 
INSERT INTO BIEN(estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',550,'CELESTE',NULL);
--TELAS AZULES (E25-E28)
INSERT INTO BIEN(estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',600,'AZUL',NULL);
--TELAS NEGRAS (E29-E32)
INSERT INTO BIEN(estado_bien,peso_bien,color_bien,id_espacio) VALUES
('RECIBIDO',600,'NEGRO',NULL);

-- TIPO_LOTE
insert into TIPO_LOTE (id_tipo_lote,material_lote)values
(1, 'PLASTICO 1');
insert into TIPO_LOTE (id_tipo_lote,material_lote) values
(2, 'PLASTICO 2');
insert into TIPO_LOTE (id_tipo_lote,material_lote)values
(3, 'CARTON');

--LOTE
INSERT INTO LOTE (id_tipo_lote)VALUES
(1);
INSERT INTO LOTE(id_tipo_lote) VALUES
(2);
INSERT INTO LOTE(id_tipo_lote) VALUES
(3);

--TIPO_PAQUETE
insert into TIPO_PAQUETE (id_tipo_paquete,material_paquete) values
(1,'PLASTICO 1');
insert into TIPO_PAQUETE (id_tipo_paquete,material_paquete)  values
(2,'PLASTICO 2');
insert into TIPO_PAQUETE (id_tipo_paquete,material_paquete) values
(3,'CARTON');

-- PAQUETE
-- 13 PORQUE SON 13 BIENES POLO
INSERT INTO PAQUETE (id_tipo_paquete,id_lote )VALUES
(1,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(2,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(3,null);
INSERT INTO PAQUETE (id_tipo_paquete,id_lote )VALUES
(1,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(2,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(3,null);
INSERT INTO PAQUETE (id_tipo_paquete,id_lote )VALUES
(1,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(2,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(3,null);
INSERT INTO PAQUETE (id_tipo_paquete,id_lote )VALUES
(1,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(2,null);
INSERT INTO PAQUETE(id_tipo_paquete,id_lote ) VALUES
(3,null);
INSERT INTO PAQUETE (id_tipo_paquete,id_lote )VALUES
(1,null);

--POLOS
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(1,'HOMBRE','REDONDO','LARGA','TALLA S',1,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(2,'HOMBRE','REDONDO','LARGA','TALLA S',2,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(3,'MUJER','CAMISERO','CORTA','TALLA S',3,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(4,'HOMBRE','CAMISERO','LARGA','TALLA S',4,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(5,'UNISEX','REDONDO','CORTA','TALLA S',5,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(6,'HOMBRE','REDONDO','LARGA','TALLA S',6,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(7,'HOMBRE','REDONDO','LARGA','TALLA S',7,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(8,'MUJER','CAMISERO','CORTA','TALLA S',8,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(9,'HOMBRE','CAMISERO','LARGA','TALLA S',9,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(10,'UNISEX','REDONDO','CORTA','TALLA S',10,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(11,'HOMBRE','REDONDO','LARGA','TALLA 2',11,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(12,'HOMBRE','REDONDO','LARGA','TALLA S',12,12);
INSERT INTO POLO (id_bien,tipo_diseno,tipo_cuello,tipo_manga,tipo_talla,id_paquete,cantidad_polos)VALUES
(13,'MUJER','CAMISERO','CORTA','TALLA S',13,12);

--ROLLOS DE TELA
INSERT INTO ROLLO_TELA (id_bien, grosor_tela,tipo_tela,precio_tela,resistencia_traccion,cantidad_telas) VALUES
(14,80,'JERSEY',100,2,3);
INSERT INTO ROLLO_TELA (id_bien, grosor_tela,tipo_tela,precio_tela,resistencia_traccion,cantidad_telas)VALUES
(15,80,'RIB',115,3,5);
INSERT INTO ROLLO_TELA(id_bien, grosor_tela,tipo_tela,precio_tela,resistencia_traccion,cantidad_telas) VALUES
(16,90,'POLIALGODON',120,6,8);
INSERT INTO ROLLO_TELA (id_bien, grosor_tela,tipo_tela,precio_tela,resistencia_traccion,cantidad_telas)VALUES
(17,80,'RIB',115,3,7);
INSERT INTO ROLLO_TELA(id_bien, grosor_tela,tipo_tela,precio_tela,resistencia_traccion,cantidad_telas) VALUES
(18,90,'POLIALGODON',120,8,10);

--TIPO_USUARIO
insert into TIPO_USUARIO (id_tipo_usuario,descripcion)values
(1,'Administrador');
insert into TIPO_USUARIO (id_tipo_usuario,descripcion)values
(2,'Almacenero recepcion');
insert into TIPO_USUARIO (id_tipo_usuario,descripcion)values
(3, 'Almacenero ubicacion');
insert into TIPO_USUARIO (id_tipo_usuario,descripcion)values
(4, 'Almacenero picking');
insert into TIPO_USUARIO (id_tipo_usuario,descripcion)values
(5,'Almacenero packing');
insert into TIPO_USUARIO (id_tipo_usuario,descripcion)values
(6,'Almacenero despacho');

--USUARIO
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)values 
('76586375', 'Rene Misael', 'Ramirez Acuña', 1, '76586375', 1);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('54256423', 'Jhordy Johan', 'Ramirez Acuña', 2, '54256423', 1);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('12436586', 'Martin Felipe', 'Ramirez Inti', 1, '12436586', 2);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('08646743', 'Harold Jonathan', 'Huarcaya Rosales', 4, '08646743', 1);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('54763575', 'Tony', 'Pantoja Morales', 3, '54763575', 2);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('23547698', 'Ronaldo Jorge', 'Pascual Manrique', 3, '23547698', 2);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('45875345', 'Ignacio Alegre', 'Montana Montoya', 2, '45875345', 1);
INSERT INTO USUARIO (dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen)VALUES
('12349846', 'Patricio Peter', 'Vidal Del Rio', 5, '12349846', 2);
INSERT INTO USUARIO(dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen) VALUES
('62468536', 'Pamela Rosmery', 'Alarcon Lozano', 4, '62468536', 2);
INSERT INTO USUARIO(dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen) VALUES
('12523678', 'Jorge Anibal', 'Segura Monterrico', 6, '12523678', 1);
INSERT INTO USUARIO(dni_usuario,nombres_usuario,apellidos_usuario,id_tipo_usuario,contrasena_usuario,id_almacen) VALUES
('57869789', 'Jimena Alisson', 'Segura Monterrico', 6, '57869789', 1);

--10
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('987456321', 1);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('986754123', 1);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('900046364', 2);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('911141535', 3);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('900112233', 4);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('902376548', 5);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('968354783', 6);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('916354875', 7);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('963462465', 8);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('976445235', 9);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('943525235', 10);
INSERT INTO TELF_USUARIO(telefono_usuario,id_usuario) VALUES
('987456321', 11);

--11
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('rene@jrj.pe', 1);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('rene@gmail.com', 1);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('jhordy@jrj.pe', 2);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('martin@jrj.pe', 3);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('harold@jrj.pe', 4);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('tony@jrj.pe', 5);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('ronaldo@jrj.pe', 6);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('ignacio@jrj.pe', 7);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('patricio@jrj.pe', 8);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('pamela@jrj.pe', 9);
INSERT INTO CORREOS_USUARIO(correo_usuario,id_usuario) VALUES
('pamela@gmail.com', 9);

--12
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('recepcion','2022-04-10', '12:30:00', 1, 'Juan Lopez', '76587655');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('recepcion','2022-05-10', '15:30:00', 1, 'Juan Lopez', '76587655');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('recepcion','2022-05-10', '15:35:00', 1, 'Pedro Casas', '77697655');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('recepcion','2022-05-10', '16:02:30', 2, 'Jorge Lopez', '56787655');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('recepcion','2022-05-10', '16:30:40', 2, 'Jorge Lopez', '56787655');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('despacho','2022-05-15', '12:20:40', 1, 'Sofia Rivera', '83468754');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('despacho','2022-05-15', '12:25:50', 1, 'Daniela Arredondo', '08536768');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('despacho','2022-05-16', '12:30:30', 1, 'Marcelo Vargas', '75286356');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('despacho','2022-05-16', '13:20:40', 1, 'Rodrigo Lopez', '93658456');
INSERT INTO CITA (tipo_cita,fecha_cita,hora_cita,id_almacen,nombre_cliente,documento_cliente)VALUES
('despacho','2022-05-17', '14:30:20', 1, 'Marcelo Vargas', '75286356');

--13.1
INSERT INTO ORDEN (tipo_orden,id_cita,id_usuario) values
('recepcion',1,1);
INSERT INTO ORDEN (tipo_orden,id_cita,id_usuario)VALUES
('recepcion',2,1);
INSERT INTO ORDEN(tipo_orden,id_cita,id_usuario) VALUES
('recepcion',3,2);
INSERT INTO ORDEN (tipo_orden,id_cita,id_usuario) values
('recepcion',4,2);
INSERT INTO ORDEN (tipo_orden,id_cita,id_usuario)VALUES
('recepcion',5,2);


--13.2
INSERT INTO MOV_MERCADERIA (tipo_movimiento,id_orden,id_bien) VALUES
('entrada',1,1);
INSERT INTO MOV_MERCADERIA (tipo_movimiento,id_orden,id_bien) VALUES
('entrada',1,3);
INSERT INTO MOV_MERCADERIA(tipo_movimiento,id_orden,id_bien) VALUES
('entrada',2,4);

--14
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario)VALUES
('recepcionados','Reportes de polos entrantes', 1);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('recepcionados','Reportes de rollos entrantes', 2);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('inventariado','Reportes de polos en stock', 3);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('inventariado','Reportes de rollos en stock', 1);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('empaquetados','Reportes de polos empaquetados', 2);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('despachados','Reportes de polos despachados ', 3);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('despachados','Reportes de rollos despachados', 1);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('recepcionados','Reportes de polos entrantes', 1);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('recepcionados','Reportes de polos entrantes talla M', 1);
INSERT INTO ALBARAN (tipo_albaran,titulo_albaran,id_usuario) VALUES
('recepcionados','Reportes de polos entrantes color rojo', 2);

--15
INSERT INTO SELECCION (id_bien,id_albaran)VALUES (1,1);
INSERT INTO SELECCION (id_bien,id_albaran)VALUES (1,3);
INSERT INTO SELECCION (id_bien,id_albaran)VALUES (5,4);
INSERT INTO SELECCION (id_bien,id_albaran)VALUES (5,5);


--16
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (1, 1);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (2, 1);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (3, 1);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (4, 1);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (5, 1);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (1, 2);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (2, 3);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (1, 4);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (1, 5);
INSERT INTO ACCESO (id_usuario,id_albaran) VALUES (1, 6);

--17
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('recepcion','Llegada de polos', 'Polos talla L color rojo' , 1);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('recepcion','Llegada de polos', 'Polos talla M color verde',3);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('recepcion','Llegada de polos', 'Polos talla 2 color azul' , 1);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('recepcion','Llegada de polos', 'Polos talla 4 color blanco' ,2);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('recepcion','Llegada de polos', 'Polos talla S color negro' , 3);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('despacho','Llegada de rollos', 'Rollos rib 30/1 color rojo' ,4);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('despacho','Llegada de rollos', 'Rollos jersey 30/1 80 color negro',4);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('despacho','Salida de polos', 'Polos talla L color blanco' ,3);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('despacho','Salida de polos', 'Polos talla 8 color azul' ,1);
INSERT INTO NOTIFICACION (tipo_notificacion,titulo_notificacion,detalle_notificacion,id_usuario)VALUES
('despacho','Salida de polos', 'Polos talla S color negro' , 1);

--18
INSERT INTO RECEPCION_NOTIFICACION(id_usuario,id_notificacion) VALUES (2,1);
INSERT INTO RECEPCION_NOTIFICACION(id_usuario,id_notificacion) VALUES (1,2);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (2,3);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (3,4);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (1,5);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (3,6);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (3,7);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (2,8);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (2,9);
INSERT INTO RECEPCION_NOTIFICACION (id_usuario,id_notificacion)VALUES (2,10);

--CARGA DE LOS CSV
/*
\copy ALMACEN FROM '/Almacenalo/ALMACEN.csv' DELIMITER ';' CSV HEADER
\copy TIPO_ESTANTE FROM '/Almacenalo/TIPO_ESTANTE.csv' DELIMITER ';' CSV HEADER;
\copy ESTANTE FROM '/Almacenalo/ESTANTE.csv' DELIMITER ';' CSV HEADER;
\copy TIPO_ESPACIO FROM '/Almacenalo/TIPO_ESPACIO.csv' DELIMITER ';' CSV HEADER;
--FALTARON 4 ESPACIOS POR ESTANTE SEGUN VISTA \copy ESPACIO FROM '/Almacenalo/ESPACIO.csv' DELIMITER ';' CSV HEADER;
\copy BIEN FROM '/Almacenalo/BIEN.csv' DELIMITER ';' CSV HEADER;
\copy ROLLO_TELA FROM '/Almacenalo/ROLLO_TELA.csv' DELIMITER ';' CSV HEADER;
\copy TIPO_LOTE FROM '/Almacenalo/TIPO_LOTE.csv' DELIMITER ';' CSV HEADER;
\copy LOTE FROM '/Almacenalo/LOTE.csv' DELIMITER ';' CSV HEADER;
\copy TIPO_PAQUETE FROM '/Almacenalo/TIPO_PAQUETE.csv' DELIMITER ';' CSV HEADER;
\copy PAQUETE FROM '/Almacenalo/PAQUETE.csv' DELIMITER ';' CSV HEADER;
\copy POLO FROM '/Almacenalo/POLO.csv' DELIMITER ';' CSV HEADER;
\copy TIPO_USUARIO FROM '/Almacenalo/TIPO_USUARIO.csv' DELIMITER ';' CSV HEADER;
\copy USUARIO FROM '/Almacenalo/USUARIO.csv' DELIMITER ';' CSV HEADER;
\copy TELF_USUARIO FROM '/Almacenalo/TELF_USUARIO.csv' DELIMITER ';' CSV HEADER;
\copy CORREOS_USUARIO FROM '/Almacenalo/CORREOS_USUARIO.csv' DELIMITER ';' CSV HEADER;
\copy CITA FROM '/Almacenalo/CITA.csv' DELIMITER ';' CSV HEADER;
\copy ORDEN FROM '/Almacenalo/ORDEN.csv' DELIMITER ';' CSV HEADER;
\copy MOV_MERCADERIA FROM '/Almacenalo/MOV_MERCADERIA.csv' DELIMITER ';' CSV HEADER;
\copy ALBARAN FROM '/Almacenalo/ALBARAN.csv' DELIMITER ';' CSV HEADER;
\copy SELECCION FROM '/Almacenalo/SELECCION.csv' DELIMITER ';' CSV HEADER;
\copy ACCESO FROM '/Almacenalo/ACCESO.csv' DELIMITER ';' CSV HEADER;
\copy NOTIFICACION FROM '/Almacenalo/NOTIFICACION.csv' DELIMITER ';' CSV HEADER;
\copy RECEPCION_NOTIFICACION FROM '/Almacenalo/RECEPCION_NOTIFICACION.csv' DELIMITER ';' CSV HEADER;
*/