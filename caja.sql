-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-10-2015 a las 03:06:23
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `caja`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `em_geren`
--

CREATE TABLE IF NOT EXISTS `em_geren` (
  `id_emge` int(50) NOT NULL AUTO_INCREMENT,
  `id_empleado` int(50) NOT NULL,
  `id_gerente` int(50) NOT NULL,
  PRIMARY KEY (`id_emge`),
  KEY `id_empleado` (`id_empleado`),
  KEY `id_gerente` (`id_gerente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `em_geren`
--

INSERT INTO `em_geren` (`id_emge`, `id_empleado`, `id_gerente`) VALUES
(1, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `id_factura` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_fac` date NOT NULL,
  `fecha_carga` date NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `id_personal` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `descri_fac` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `id_status` int(11) NOT NULL,
  `monto` double NOT NULL,
  PRIMARY KEY (`id_factura`),
  KEY `id_proveedor` (`id_proveedor`),
  KEY `id_personal` (`id_personal`),
  KEY `id_servicio` (`id_servicio`),
  KEY `id_status` (`id_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE IF NOT EXISTS `personal` (
  `id_personal` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `ci_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `nom_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `ape_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `tele_per` int(100) NOT NULL,
  `cargo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_personal`),
  UNIQUE KEY `ci_per_2` (`ci_per`),
  KEY `ci_per` (`ci_per`),
  KEY `usuario` (`usuario`),
  KEY `usuario_2` (`usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`id_personal`, `usuario`, `ci_per`, `nom_per`, `ape_per`, `tele_per`, `cargo`) VALUES
(1, 'gerente', '22440748', 'prueba', 'ape', 2147483647, 'programador'),
(2, 'prueba', '19587847', 'Prueba2', 'apellido', 2147483647, 'desarrolador'),
(3, 'prueba3', '1047878', 'Prueba', 'Perez', 414, 'Desarrolador'),
(4, 'o', '25', 'o', 'o', 212, '21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `rif_cedula` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `nom_prove` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `direcc_prove` text COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE IF NOT EXISTS `proyecto` (
  `id_proyecto` int(100) NOT NULL AUTO_INCREMENT,
  `nom_pro` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_proyecto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`id_proyecto`, `nom_pro`) VALUES
(1, 'pruebaaa'),
(2, 'Prueba'),
(3, 'p3'),
(4, 'p6');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proye_geren`
--

CREATE TABLE IF NOT EXISTS `proye_geren` (
  `id_proge` int(50) NOT NULL AUTO_INCREMENT,
  `id_proyecto` int(50) NOT NULL,
  `id_gerente` int(50) NOT NULL,
  PRIMARY KEY (`id_proge`),
  KEY `id_proyecto` (`id_proyecto`),
  KEY `id_gerente` (`id_gerente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `proye_geren`
--

INSERT INTO `proye_geren` (`id_proge`, `id_proyecto`, `id_gerente`) VALUES
(1, 1, 1),
(7, 4, 3),
(10, 3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE IF NOT EXISTS `servicio` (
  `id_servicio` int(100) NOT NULL AUTO_INCREMENT,
  `nom_servi` int(11) NOT NULL,
  `descri_servi` text COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_servicio`),
  KEY `nom_servi` (`nom_servi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `status`
--

CREATE TABLE IF NOT EXISTS `status` (
  `id_status` int(11) NOT NULL AUTO_INCREMENT,
  `nom_sta` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE IF NOT EXISTS `tipo_usuario` (
  `id_tipo` int(11) NOT NULL AUTO_INCREMENT,
  `nom_tipo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`id_tipo`, `nom_tipo`) VALUES
(1, 'Gerente'),
(2, 'Empleado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_usu` int(11) NOT NULL,
  `usuario` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `clave` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `correo_usu` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `id_per` (`usuario`),
  KEY `tipo_usu` (`tipo_usu`),
  KEY `usuario` (`usuario`),
  KEY `usuario_2` (`usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `tipo_usu`, `usuario`, `clave`, `correo_usu`) VALUES
(1, 1, 'gerente', '11', 'gerente@gmail.com'),
(2, 1, 'prueba', '11', 'gerente@gmail.com'),
(3, 2, 'prueba3', '11', 'prueba@gmail.com'),
(4, 1, 'o', '11', 'o');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `em_geren`
--
ALTER TABLE `em_geren`
  ADD CONSTRAINT `em_geren_ibfk_4` FOREIGN KEY (`id_gerente`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `em_geren_ibfk_3` FOREIGN KEY (`id_empleado`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`id_personal`) REFERENCES `personal` (`id_personal`),
  ADD CONSTRAINT `factura_ibfk_3` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id_servicio`),
  ADD CONSTRAINT `factura_ibfk_4` FOREIGN KEY (`id_status`) REFERENCES `status` (`id_status`);

--
-- Filtros para la tabla `personal`
--
ALTER TABLE `personal`
  ADD CONSTRAINT `personal_ibfk_2` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`usuario`) ON DELETE CASCADE;

--
-- Filtros para la tabla `proye_geren`
--
ALTER TABLE `proye_geren`
  ADD CONSTRAINT `proye_geren_ibfk_6` FOREIGN KEY (`id_gerente`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE,
  ADD CONSTRAINT `proye_geren_ibfk_5` FOREIGN KEY (`id_proyecto`) REFERENCES `proyecto` (`id_proyecto`) ON DELETE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`tipo_usu`) REFERENCES `tipo_usuario` (`id_tipo`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
