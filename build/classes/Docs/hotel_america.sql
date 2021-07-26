-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-07-2021 a las 14:14:38
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: hotel_america
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla administrador
--

CREATE TABLE administrador (
  id int(10) UNSIGNED NOT NULL,
  usuario_id int(10) UNSIGNED NOT NULL,
  nombre varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  apellido varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla administrador
--

INSERT INTO administrador (id, usuario_id, nombre, apellido) VALUES
(2, 2, 'JOSE', 'MENDOZA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla cliente
--

CREATE TABLE cliente (
  id int(10) UNSIGNED NOT NULL,
  usuario_id int(10) UNSIGNED NOT NULL,
  nombre varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  apellido varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  domicilio varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  poblacion varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  provincia varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  cod_postal varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  telefono varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla cliente
--

INSERT INTO cliente (id, usuario_id, nombre, apellido, domicilio, poblacion, provincia, cod_postal, telefono) VALUES
(1, 1, 'ELIZABETH', 'MONTES DE OCA', 'CALLE 37', 'Barquisimeto', 'Lara', '3001', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla hotel
--

CREATE TABLE hotel (
  id int(10) UNSIGNED NOT NULL,
  administrador_id int(10) UNSIGNED NOT NULL,
  nombre varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  descripcion varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  categoria varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  domicilio varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  poblacion varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  provincia varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  cod_postal varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  telefono varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla hotel
--

INSERT INTO hotel (id, administrador_id, nombre, descripcion, categoria, domicilio, poblacion, provincia, cod_postal, telefono) VALUES
(8, 2, 'aaa', 'sfsdf', '', '', '', '', '', ''),
(9, 2, 'bbb', 'QW QDQW3 QW W W', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla reserva
--

CREATE TABLE reserva (
  id int(10) UNSIGNED NOT NULL,
  cliente_id int(10) UNSIGNED NOT NULL,
  tipo_habitacion_id int(10) UNSIGNED NOT NULL,
  fecha_inicio date NOT NULL,
  fecha_fin date NOT NULL,
  precio decimal(13,2) NOT NULL,
  total float(13,2) UNSIGNED DEFAULT NULL,
  nombre_tomador varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla reserva
--

INSERT INTO reserva (id, cliente_id, tipo_habitacion_id, fecha_inicio, fecha_fin, precio, total, nombre_tomador) VALUES
(2, 1, 2, '2021-07-05', '2021-07-05', '10000.00', NULL, NULL),
(3, 1, 2, '2021-07-12', '2021-07-12', '60000.00', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla tipo_habitacion
--

CREATE TABLE tipo_habitacion (
  id int(10) UNSIGNED NOT NULL,
  hotel_id int(10) UNSIGNED NOT NULL,
  nombre varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  descripcion varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  capacidad int(4) UNSIGNED NOT NULL,
  precio float(13,2) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla tipo_habitacion
--

INSERT INTO tipo_habitacion (id, hotel_id, nombre, descripcion, capacidad, precio) VALUES
(2, 8, 'Especial', 'xxxdsdf', 5, 10000.00),
(4, 8, 'fwef', 'aefw', 13, 12233.00),
(5, 9, 'YYY', 'PRUEBA', 3, 150.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla usuario
--

CREATE TABLE usuario (
  id int(10) UNSIGNED NOT NULL,
  email varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  password varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  login varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'NO SE QUE USO DARLE',
  fecha_alta timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  ultimo_acceso timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla usuario
--

INSERT INTO usuario (id, email, `password`, login, fecha_alta, ultimo_acceso) VALUES
(1, 'eli@gmail.com', '123', NULL, '2021-07-02 17:12:47', '2021-07-25 18:07:20'),
(2, 'jose@gmail.com', '123', NULL, '2021-07-01 12:34:47', '2021-07-23 22:03:54');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla administrador
--
ALTER TABLE administrador
  ADD PRIMARY KEY (id),
  ADD KEY usuario_id (usuario_id);

--
-- Indices de la tabla cliente
--
ALTER TABLE cliente
  ADD PRIMARY KEY (id),
  ADD KEY usuario_id (usuario_id);

--
-- Indices de la tabla hotel
--
ALTER TABLE hotel
  ADD PRIMARY KEY (id),
  ADD KEY administrador_id (administrador_id);

--
-- Indices de la tabla reserva
--
ALTER TABLE reserva
  ADD PRIMARY KEY (id),
  ADD KEY cliente_id (cliente_id),
  ADD KEY tipo_habitacion_id (tipo_habitacion_id);

--
-- Indices de la tabla tipo_habitacion
--
ALTER TABLE tipo_habitacion
  ADD PRIMARY KEY (id),
  ADD KEY hotel_id (hotel_id);

--
-- Indices de la tabla usuario
--
ALTER TABLE usuario
  ADD PRIMARY KEY (id);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla administrador
--
ALTER TABLE administrador
  MODIFY id int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla cliente
--
ALTER TABLE cliente
  MODIFY id int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla hotel
--
ALTER TABLE hotel
  MODIFY id int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla reserva
--
ALTER TABLE reserva
  MODIFY id int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla tipo_habitacion
--
ALTER TABLE tipo_habitacion
  MODIFY id int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla usuario
--
ALTER TABLE usuario
  MODIFY id int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla administrador
--
ALTER TABLE administrador
  ADD CONSTRAINT administrador_ibfk_1 FOREIGN KEY (usuario_id) REFERENCES usuario (id) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla cliente
--
ALTER TABLE cliente
  ADD CONSTRAINT cliente_ibfk_1 FOREIGN KEY (usuario_id) REFERENCES usuario (id) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla hotel
--
ALTER TABLE hotel
  ADD CONSTRAINT hotel_ibfk_1 FOREIGN KEY (administrador_id) REFERENCES administrador (id) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla reserva
--
ALTER TABLE reserva
  ADD CONSTRAINT reserva_ibfk_1 FOREIGN KEY (cliente_id) REFERENCES `cliente` (id),
  ADD CONSTRAINT reserva_ibfk_2 FOREIGN KEY (tipo_habitacion_id) REFERENCES tipo_habitacion (id);

--
-- Filtros para la tabla tipo_habitacion
--
ALTER TABLE tipo_habitacion
  ADD CONSTRAINT tipo_habitacion_ibfk_1 FOREIGN KEY (hotel_id) REFERENCES hotel (id) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
