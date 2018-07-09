-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-06-2018 a las 05:03:10
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `secado_semilla`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contador`
--

CREATE TABLE `contador` (
  `cod_cont` int(10) NOT NULL,
  `valor` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `contador`
--

INSERT INTO `contador` (`cod_cont`, `valor`) VALUES
(1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experimento_secado`
--

CREATE TABLE `experimento_secado` (
  `cod_exp_sec` varchar(15) NOT NULL,
  `nombre_semilla` varchar(30) DEFAULT NULL,
  `numero_exp` varchar(10) DEFAULT NULL,
  `fecha_exp` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `experimento_secado`
--

INSERT INTO `experimento_secado` (`cod_exp_sec`, `nombre_semilla`, `numero_exp`, `fecha_exp`) VALUES
('S001', 'Arroz', '2', '2018-05-06'),
('S003', 'Lenteja', '2', '2018-05-01'),
('S004', 'Cebada', '4', '2018-05-02'),
('S005', 'TRIGO', '2', '2018-05-02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicion`
--

CREATE TABLE `medicion` (
  `cod_med` int(10) NOT NULL,
  `valor_tiempo` varchar(10) DEFAULT NULL,
  `valor_peso` varchar(10) DEFAULT NULL,
  `cod_num_exp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `medicion`
--

INSERT INTO `medicion` (`cod_med`, `valor_tiempo`, `valor_peso`, `cod_num_exp`) VALUES
(223, '0.0', '100', 'S003.1'),
(224, '60.0', '60', 'S003.1'),
(225, '120.0', '40', 'S003.1'),
(226, '180.0', '2', 'S003.1'),
(227, '0.0', '100', 'S003.2'),
(228, '60.0', '60', 'S003.2'),
(229, '120.0', '160', 'S003.2'),
(230, '180.0', '34', 'S003.2'),
(231, '0.0', '100', 'S004.1'),
(232, '30.0', '60', 'S004.1'),
(233, '60.0', '56', 'S004.1'),
(234, '90.0', '78', 'S004.1'),
(235, '120.0', '67', 'S004.1'),
(236, '150.0', '67', 'S004.1'),
(237, '180.0', '55', 'S004.1'),
(238, '0.0', '100', 'S004.2'),
(239, '30.0', '34', 'S004.2'),
(240, '60.0', '4', 'S004.2'),
(241, '90.0', '3', 'S004.2'),
(242, '120.0', '5', 'S004.2'),
(243, '150.0', '4', 'S004.2'),
(244, '180.0', '5', 'S004.2'),
(245, '0.0', '100', 'S004.3'),
(246, '30.0', '45.4', 'S004.3'),
(247, '60.0', '34.8', 'S004.3'),
(248, '90.0', '65.9', 'S004.3'),
(249, '120.0', '65.9', 'S004.3'),
(250, '150.0', '45.6', 'S004.3'),
(251, '180.0', '65.9', 'S004.3'),
(252, '0.0', '100', 'S005.1'),
(253, '30.0', '30', 'S005.1'),
(254, '60.0', '90', 'S005.1'),
(255, '90.0', '89', 'S005.1'),
(256, '120.0', '70', 'S005.1'),
(257, '150.0', '69', 'S005.1'),
(258, '180.0', '67', 'S005.1'),
(259, '0.0', '100', 'S005.2'),
(260, '30.0', '95', 'S005.2'),
(261, '60.0', '90', 'S005.2'),
(262, '90.0', '78', 'S005.2'),
(263, '120.0', '71', 'S005.2'),
(264, '150.0', '69', 'S005.2'),
(265, '180.0', '68', 'S005.2'),
(266, '0.0', '100', 'S001.1'),
(267, '20.0', '70', 'S001.1'),
(268, '40.0', '5', 'S001.1'),
(269, '60.0', '46', 'S001.1'),
(270, '80.0', '1', 'S001.1'),
(271, '100.0', '346', 'S001.1'),
(272, '120.0', '45', 'S001.1'),
(273, '140.0', '4.9', 'S001.1'),
(274, '160.0', '56.9', 'S001.1'),
(275, '180.0', '56.7', 'S001.1'),
(276, '0.0', '100', 'S001.2'),
(277, '60.0', '3', 'S001.2'),
(278, '120.0', '56', 'S001.2'),
(279, '180.0', '67', 'S001.2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `num_experimentos`
--

CREATE TABLE `num_experimentos` (
  `cod_num_exp` varchar(10) NOT NULL,
  `duracion_exp` varchar(10) DEFAULT NULL,
  `intervalo_tiempo_exp` varchar(10) DEFAULT NULL,
  `peso_inicial_exp` varchar(10) DEFAULT NULL,
  `cod_exp_sec` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `num_experimentos`
--

INSERT INTO `num_experimentos` (`cod_num_exp`, `duracion_exp`, `intervalo_tiempo_exp`, `peso_inicial_exp`, `cod_exp_sec`) VALUES
('S001.1', '180', '20', '100', 'S001'),
('S001.2', '180', '60', '100', 'S001'),
('S003.1', '180', '60', '100', 'S003'),
('S003.2', '180', '60', '100', 'S003'),
('S004.1', '180', '30', '100', 'S004'),
('S004.2', '180', '30', '100', 'S004'),
('S004.3', '180', '30', '100', 'S004'),
('S005.1', '180', '30', '100', 'S005'),
('S005.2', '180', '30', '100', 'S005');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repeticion`
--

CREATE TABLE `repeticion` (
  `id` int(10) NOT NULL,
  `contador` int(10) DEFAULT NULL,
  `cod_exp_sec` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `repeticion`
--

INSERT INTO `repeticion` (`id`, `contador`, `cod_exp_sec`) VALUES
(3, 2, 'S003'),
(4, 3, 'S004'),
(5, 2, 'S005'),
(6, 2, 'S001');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contador`
--
ALTER TABLE `contador`
  ADD PRIMARY KEY (`cod_cont`);

--
-- Indices de la tabla `experimento_secado`
--
ALTER TABLE `experimento_secado`
  ADD PRIMARY KEY (`cod_exp_sec`);

--
-- Indices de la tabla `medicion`
--
ALTER TABLE `medicion`
  ADD PRIMARY KEY (`cod_med`),
  ADD KEY `cod_num_exp` (`cod_num_exp`);

--
-- Indices de la tabla `num_experimentos`
--
ALTER TABLE `num_experimentos`
  ADD PRIMARY KEY (`cod_num_exp`),
  ADD KEY `cod_exp_sec` (`cod_exp_sec`);

--
-- Indices de la tabla `repeticion`
--
ALTER TABLE `repeticion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cod_exp_sec` (`cod_exp_sec`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `medicion`
--
ALTER TABLE `medicion`
  MODIFY `cod_med` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=280;
--
-- AUTO_INCREMENT de la tabla `repeticion`
--
ALTER TABLE `repeticion`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `medicion`
--
ALTER TABLE `medicion`
  ADD CONSTRAINT `medicion_ibfk_1` FOREIGN KEY (`cod_num_exp`) REFERENCES `num_experimentos` (`cod_num_exp`) ON DELETE CASCADE;

--
-- Filtros para la tabla `num_experimentos`
--
ALTER TABLE `num_experimentos`
  ADD CONSTRAINT `num_experimentos_ibfk_1` FOREIGN KEY (`cod_exp_sec`) REFERENCES `experimento_secado` (`cod_exp_sec`) ON DELETE CASCADE;

--
-- Filtros para la tabla `repeticion`
--
ALTER TABLE `repeticion`
  ADD CONSTRAINT `repeticion_ibfk_1` FOREIGN KEY (`cod_exp_sec`) REFERENCES `experimento_secado` (`cod_exp_sec`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
