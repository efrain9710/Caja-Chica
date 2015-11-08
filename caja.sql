-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-11-2015 a las 23:09:51
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE IF NOT EXISTS `cargo` (
  `id_cargo` int(11) NOT NULL AUTO_INCREMENT,
  `cargo` varchar(255) NOT NULL,
  PRIMARY KEY (`id_cargo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`id_cargo`, `cargo`) VALUES
(1, 'Director'),
(2, 'Gerente'),
(3, 'Coordinador de Infraestructura'),
(4, 'DT'),
(5, 'Coordinador de desarrollo'),
(6, 'Coordinador de implementacion'),
(7, 'Consultor Lider 3'),
(8, 'Consultor Lider 2'),
(9, 'Consultor Lider 1'),
(10, 'Soporte Tecnico 2'),
(11, 'Servicios Generales'),
(12, 'Analista RRHH');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `id_factura` int(11) NOT NULL AUTO_INCREMENT,
  `n_factura` int(11) NOT NULL,
  `fecha_fac` date NOT NULL,
  `fecha_carga` date NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `id_personal` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `descri_fac` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `id_status` int(11) NOT NULL,
  `monto` double NOT NULL,
  PRIMARY KEY (`id_factura`),
  UNIQUE KEY `n_factura_2` (`n_factura`),
  KEY `id_proveedor` (`id_proveedor`),
  KEY `id_personal` (`id_personal`),
  KEY `id_servicio` (`id_servicio`),
  KEY `id_status` (`id_status`),
  KEY `n_factura` (`n_factura`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`id_factura`, `n_factura`, `fecha_fac`, `fecha_carga`, `id_proveedor`, `id_personal`, `id_servicio`, `descri_fac`, `id_status`, `monto`) VALUES
(5, 5, '2015-11-05', '2015-11-05', 1, 1, 1, 'asdas', 2, 23323),
(6, 1, '2015-11-06', '2015-11-07', 2, 1, 1, 'sdasa', 1, 11212);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `monto`
--

CREATE TABLE IF NOT EXISTS `monto` (
  `id_monto` int(11) NOT NULL AUTO_INCREMENT,
  `monto` double NOT NULL,
  PRIMARY KEY (`id_monto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `monto`
--

INSERT INTO `monto` (`id_monto`, `monto`) VALUES
(1, 5000);

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
  `tele_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `cargo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_personal`),
  UNIQUE KEY `ci_per_2` (`ci_per`),
  KEY `ci_per` (`ci_per`),
  KEY `usuario` (`usuario`),
  KEY `usuario_2` (`usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`id_personal`, `usuario`, `ci_per`, `nom_per`, `ape_per`, `tele_per`, `cargo`) VALUES
(1, 'gerente', '22440748', 'prueba', 'ape', '2147483647', 'Gerente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `rif_cedula` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `nom_prove` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `tele_prove` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `direcc_prove` text COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `rif_cedula`, `nom_prove`, `tele_prove`, `direcc_prove`) VALUES
(1, '22447878', 'Victor', '12321234', 'Proveedor del CNTI'),
(2, '1231231', 'sadsas', '14547412', 'Por ahi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE IF NOT EXISTS `proyecto` (
  `id_proyecto` int(100) NOT NULL AUTO_INCREMENT,
  `nom_pro` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_proyecto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`id_proyecto`, `nom_pro`) VALUES
(1, 'pruebaaa'),
(2, 'Prueba'),
(3, 'p3'),
(4, 'p6'),
(5, 'peaa');

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `proye_geren`
--

INSERT INTO `proye_geren` (`id_proge`, `id_proyecto`, `id_gerente`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE IF NOT EXISTS `servicio` (
  `id_servicio` int(100) NOT NULL AUTO_INCREMENT,
  `nom_servi` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `descri_servi` text COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_servicio`),
  KEY `nom_servi` (`nom_servi`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`id_servicio`, `nom_servi`, `descri_servi`) VALUES
(1, 'Servicio de Correo', 'Servicio de Correo'),
(2, 'Servicio de Prueba', 'Servicio de Prueba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `status`
--

CREATE TABLE IF NOT EXISTS `status` (
  `id_status` int(11) NOT NULL AUTO_INCREMENT,
  `nom_sta` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_status`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `status`
--

INSERT INTO `status` (`id_status`, `nom_sta`) VALUES
(1, 'Aprobado'),
(2, 'Rechazado'),
(3, 'En proceso');

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
(1, 'Administrador'),
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `tipo_usu`, `usuario`, `clave`, `correo_usu`) VALUES
(1, 1, 'gerente', '11', 'gerente@gmail.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_5` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `factura_ibfk_6` FOREIGN KEY (`id_personal`) REFERENCES `personal` (`id_personal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `factura_ibfk_7` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id_servicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `factura_ibfk_8` FOREIGN KEY (`id_status`) REFERENCES `status` (`id_status`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `personal`
--
ALTER TABLE `personal`
  ADD CONSTRAINT `personal_ibfk_6` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `proye_geren`
--
ALTER TABLE `proye_geren`
  ADD CONSTRAINT `proye_geren_ibfk_7` FOREIGN KEY (`id_proyecto`) REFERENCES `proyecto` (`id_proyecto`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `proye_geren_ibfk_8` FOREIGN KEY (`id_gerente`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`tipo_usu`) REFERENCES `tipo_usuario` (`id_tipo`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
