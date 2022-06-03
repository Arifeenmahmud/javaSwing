-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2022 at 07:52 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `product`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `subtotal` double NOT NULL,
  `tax` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`subtotal`, `tax`, `total`) VALUES
(2.4, 212, 300),
(2.4, 212, 300),
(4, 0.195, 4.095),
(2.4, 212, 300),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(2.5, 0.125, 2.625),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(4, 0.2, 4.2),
(3.7, 0.18500000000000003, 4),
(4.4, 0.22000000000000003, 4.62),
(4, 0.195, 4.095),
(1.4, 0.06999999999999999, 1.47),
(2.4, 212, 300),
(3.8, 0.19, 4),
(2.3, 45656, 2.415),
(2.3, 45656, 2.415),
(4, 0.195, 4.095),
(2.3, 45656, 2.415),
(2.3, 45656, 2.415),
(2.3, 45656, 2.415),
(1.2, 0.06, 1.26),
(3.8, 0.19, 4),
(2.3, 0.11499999999999999, 3),
(4, 0.195, 4.095),
(4, 0.195, 4.095),
(2.4, 0.12, 2.52),
(2.2, 0.11000000000000001, 2.31),
(1.2, 0.06, 1.26),
(3.7, 0.18500000000000003, 4),
(1.2, 0.06, 1.26),
(2.3, 0.11499999999999999, 2.415),
(1.2, 0.06, 1.26),
(2.2, 0.11000000000000001, 2.31),
(3.7, 0.18500000000000003, 4),
(1.2, 0.06, 1.26),
(1.2, 0.06, 1.26),
(1.5, 0.07500000000000001, 1.575),
(1.3, 0.065, 1.365),
(3, 0.13499999999999998, 3),
(2.3, 0.11499999999999999, 2.415),
(1.2, 0.06, 1.26);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` varchar(30) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Password`) VALUES
('ab', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
