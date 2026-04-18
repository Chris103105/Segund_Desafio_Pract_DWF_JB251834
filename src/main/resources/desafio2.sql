-- phpMyAdmin SQL Dump
-- version 5.2.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-04-2026 a las 18:35:23
-- Versión del servidor: 8.4.7
-- Versión de PHP: 8.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `desafio2`
--
CREATE DATABASE IF NOT EXISTS `desafio2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `desafio2`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE IF NOT EXISTS `alumno` (
                                        `id_alumno` int NOT NULL AUTO_INCREMENT,
                                        `nombre` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
    `apellido` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
    PRIMARY KEY (`id_alumno`)
    ) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id_alumno`, `nombre`, `apellido`) VALUES
                                                             (1, 'Christopher ', 'Jovel'),
                                                             (2, 'Odaly', 'Cruz'),
                                                             (3, 'Manuel', 'Luna'),
                                                             (4, 'Sofia', 'Menjivar'),
                                                             (5, 'Diego', 'Torre'),
                                                             (6, 'Carlos', 'Guzman');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno_materia`
--

DROP TABLE IF EXISTS `alumno_materia`;
CREATE TABLE IF NOT EXISTS `alumno_materia` (
                                                `id_alumno` bigint NOT NULL,
                                                `id_materia` bigint NOT NULL,
                                                PRIMARY KEY (`id_alumno`,`id_materia`),
    KEY `FK5rqimn29ofwxhpwdqrugqstxp` (`id_materia`)
    ) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `alumno_materia`
--

INSERT INTO `alumno_materia` (`id_alumno`, `id_materia`) VALUES
                                                             (1, 1),
                                                             (2, 2),
                                                             (3, 3),
                                                             (4, 4),
                                                             (5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

DROP TABLE IF EXISTS `materia`;
CREATE TABLE IF NOT EXISTS `materia` (
                                         `id_materia` int NOT NULL AUTO_INCREMENT,
                                         `nombre` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
    `id_profesor` bigint NOT NULL,
    PRIMARY KEY (`id_materia`),
    KEY `FKkejrlt9yd5qon0x9ijvbwv1yf` (`id_profesor`)
    ) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre`, `id_profesor`) VALUES
                                                                  (1, 'Programación Orientada a Objetos', 1),
                                                                  (2, 'Administración de Bases de Datos', 2),
                                                                  (3, 'Redes de Comunicación', 3),
                                                                  (4, 'Algebra', 4),
                                                                  (5, 'Servidores en Plataformas Propietarias', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

DROP TABLE IF EXISTS `profesor`;
CREATE TABLE IF NOT EXISTS `profesor` (
                                          `id_profesor` int NOT NULL AUTO_INCREMENT,
                                          `nombre` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
    PRIMARY KEY (`id_profesor`)
    ) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`id_profesor`, `nombre`) VALUES
                                                     (1, 'Ligia Marcela Majano'),
                                                     (2, 'Bladimir Campos'),
                                                     (3, 'Alexander  Campos'),
                                                     (4, 'Nelson  Belloso '),
                                                     (5, 'Leonardo Alfonso ');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
