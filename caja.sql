-- phpMyAdmin SQL Dump
-- version 4.2.12deb2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 06, 2015 at 04:37 PM
-- Server version: 5.5.43-0+deb8u1
-- PHP Version: 5.6.7-1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `caja`
--

-- --------------------------------------------------------

--
-- Table structure for table `cargo`
--

CREATE TABLE IF NOT EXISTS `cargo` (
`id_cargo` int(11) NOT NULL,
  `cargo` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cargo`
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
-- Table structure for table `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
`id_factura` int(11) NOT NULL,
  `n_factura` int(11) NOT NULL,
  `fecha_fac` date NOT NULL,
  `fecha_carga` date NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `id_personal` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL,
  `descri_fac` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `id_status` int(11) NOT NULL,
  `monto` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `factura`
--

INSERT INTO `factura` (`id_factura`, `n_factura`, `fecha_fac`, `fecha_carga`, `id_proveedor`, `id_personal`, `id_servicio`, `descri_fac`, `id_status`, `monto`) VALUES
(5, 5, '2015-11-05', '2015-11-05', 1, 1, 1, 'asdas', 1, 23323);

-- --------------------------------------------------------

--
-- Table structure for table `monto`
--

CREATE TABLE IF NOT EXISTS `monto` (
`id_monto` int(11) NOT NULL,
  `monto` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `monto`
--

INSERT INTO `monto` (`id_monto`, `monto`) VALUES
(1, 4000);

-- --------------------------------------------------------

--
-- Table structure for table `personal`
--

CREATE TABLE IF NOT EXISTS `personal` (
`id_personal` int(11) NOT NULL,
  `usuario` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `ci_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `nom_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `ape_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `tele_per` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `cargo` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `personal`
--

INSERT INTO `personal` (`id_personal`, `usuario`, `ci_per`, `nom_per`, `ape_per`, `tele_per`, `cargo`) VALUES
(1, 'gerente', '22440748', 'prueba', 'ape', '2147483647', 'Gerente');

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
`id_proveedor` int(11) NOT NULL,
  `rif_cedula` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `nom_prove` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `tele_prove` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `direcc_prove` text COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `rif_cedula`, `nom_prove`, `tele_prove`, `direcc_prove`) VALUES
(1, '22447878', 'Victor', '', 'Proveedor del CNTI');

-- --------------------------------------------------------

--
-- Table structure for table `proyecto`
--

CREATE TABLE IF NOT EXISTS `proyecto` (
`id_proyecto` int(100) NOT NULL,
  `nom_pro` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `proyecto`
--

INSERT INTO `proyecto` (`id_proyecto`, `nom_pro`) VALUES
(1, 'pruebaaa'),
(2, 'Prueba'),
(3, 'p3'),
(4, 'p6'),
(5, 'peaa');

-- --------------------------------------------------------

--
-- Table structure for table `proye_geren`
--

CREATE TABLE IF NOT EXISTS `proye_geren` (
`id_proge` int(50) NOT NULL,
  `id_proyecto` int(50) NOT NULL,
  `id_gerente` int(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `proye_geren`
--

INSERT INTO `proye_geren` (`id_proge`, `id_proyecto`, `id_gerente`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `servicio`
--

CREATE TABLE IF NOT EXISTS `servicio` (
`id_servicio` int(100) NOT NULL,
  `nom_servi` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `descri_servi` text COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `servicio`
--

INSERT INTO `servicio` (`id_servicio`, `nom_servi`, `descri_servi`) VALUES
(1, 'Servicio de Correo', 'Servicio de Correo'),
(2, 'Servicio de Prueba', 'Servicio de Prueba');

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE IF NOT EXISTS `status` (
`id_status` int(11) NOT NULL,
  `nom_sta` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`id_status`, `nom_sta`) VALUES
(1, 'Aprobado'),
(2, 'Rechazado');

-- --------------------------------------------------------

--
-- Table structure for table `tipo_usuario`
--

CREATE TABLE IF NOT EXISTS `tipo_usuario` (
`id_tipo` int(11) NOT NULL,
  `nom_tipo` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`id_tipo`, `nom_tipo`) VALUES
(1, 'Administrador'),
(2, 'Empleado');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
`id_usuario` int(11) NOT NULL,
  `tipo_usu` int(11) NOT NULL,
  `usuario` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `clave` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `correo_usu` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `tipo_usu`, `usuario`, `clave`, `correo_usu`) VALUES
(1, 1, 'gerente', '11', 'gerente@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cargo`
--
ALTER TABLE `cargo`
 ADD PRIMARY KEY (`id_cargo`);

--
-- Indexes for table `factura`
--
ALTER TABLE `factura`
 ADD PRIMARY KEY (`id_factura`), ADD UNIQUE KEY `n_factura_2` (`n_factura`), ADD KEY `id_proveedor` (`id_proveedor`), ADD KEY `id_personal` (`id_personal`), ADD KEY `id_servicio` (`id_servicio`), ADD KEY `id_status` (`id_status`), ADD KEY `n_factura` (`n_factura`);

--
-- Indexes for table `monto`
--
ALTER TABLE `monto`
 ADD PRIMARY KEY (`id_monto`);

--
-- Indexes for table `personal`
--
ALTER TABLE `personal`
 ADD PRIMARY KEY (`id_personal`), ADD UNIQUE KEY `ci_per_2` (`ci_per`), ADD KEY `ci_per` (`ci_per`), ADD KEY `usuario` (`usuario`), ADD KEY `usuario_2` (`usuario`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
 ADD PRIMARY KEY (`id_proveedor`);

--
-- Indexes for table `proyecto`
--
ALTER TABLE `proyecto`
 ADD PRIMARY KEY (`id_proyecto`);

--
-- Indexes for table `proye_geren`
--
ALTER TABLE `proye_geren`
 ADD PRIMARY KEY (`id_proge`), ADD KEY `id_proyecto` (`id_proyecto`), ADD KEY `id_gerente` (`id_gerente`);

--
-- Indexes for table `servicio`
--
ALTER TABLE `servicio`
 ADD PRIMARY KEY (`id_servicio`), ADD KEY `nom_servi` (`nom_servi`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
 ADD PRIMARY KEY (`id_status`);

--
-- Indexes for table `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
 ADD PRIMARY KEY (`id_tipo`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`id_usuario`), ADD UNIQUE KEY `id_per` (`usuario`), ADD KEY `tipo_usu` (`tipo_usu`), ADD KEY `usuario` (`usuario`), ADD KEY `usuario_2` (`usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cargo`
--
ALTER TABLE `cargo`
MODIFY `id_cargo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `factura`
--
ALTER TABLE `factura`
MODIFY `id_factura` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `monto`
--
ALTER TABLE `monto`
MODIFY `id_monto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `personal`
--
ALTER TABLE `personal`
MODIFY `id_personal` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `proveedor`
--
ALTER TABLE `proveedor`
MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `proyecto`
--
ALTER TABLE `proyecto`
MODIFY `id_proyecto` int(100) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `proye_geren`
--
ALTER TABLE `proye_geren`
MODIFY `id_proge` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `servicio`
--
ALTER TABLE `servicio`
MODIFY `id_servicio` int(100) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `status`
--
ALTER TABLE `status`
MODIFY `id_status` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `factura`
--
ALTER TABLE `factura`
ADD CONSTRAINT `factura_ibfk_5` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`) ON DELETE CASCADE,
ADD CONSTRAINT `factura_ibfk_6` FOREIGN KEY (`id_personal`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE,
ADD CONSTRAINT `factura_ibfk_7` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id_servicio`) ON DELETE CASCADE,
ADD CONSTRAINT `factura_ibfk_8` FOREIGN KEY (`id_status`) REFERENCES `status` (`id_status`) ON DELETE CASCADE;

--
-- Constraints for table `personal`
--
ALTER TABLE `personal`
ADD CONSTRAINT `personal_ibfk_6` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `proye_geren`
--
ALTER TABLE `proye_geren`
ADD CONSTRAINT `proye_geren_ibfk_7` FOREIGN KEY (`id_proyecto`) REFERENCES `proyecto` (`id_proyecto`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `proye_geren_ibfk_8` FOREIGN KEY (`id_gerente`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `usuarios`
--
ALTER TABLE `usuarios`
ADD CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`tipo_usu`) REFERENCES `tipo_usuario` (`id_tipo`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
