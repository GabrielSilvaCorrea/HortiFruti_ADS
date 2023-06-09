-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Dez-2022 às 19:43
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco_horti`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `compra`
--

CREATE TABLE `compra` (
  `id_compra` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `quantidade` decimal(10,0) NOT NULL,
  `data_compra` date NOT NULL,
  `hora_compra` time NOT NULL,
  `id_prod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `compra`
--

INSERT INTO `compra` (`id_compra`, `codigo`, `quantidade`, `data_compra`, `hora_compra`, `id_prod`) VALUES
(1, 1, '10', '2022-11-16', '11:10:00', 2),
(2, 1, '11', '2022-11-01', '23:01:00', 1),
(3, 1, '1', '2022-11-20', '22:07:08', 1),
(4, 2, '1', '2022-11-20', '22:32:42', 1),
(5, 3, '3', '2022-11-20', '22:33:12', 5),
(6, 4, '24', '2022-11-21', '19:47:45', 2),
(7, 5, '13', '2022-11-21', '19:50:12', 1),
(8, 5, '3', '2022-11-21', '19:50:12', 3),
(9, 6, '1', '2022-11-21', '22:11:57', 1),
(10, 7, '2', '2022-11-22', '07:09:29', 1),
(11, 7, '2', '2022-11-22', '07:09:29', 1),
(12, 7, '2', '2022-11-22', '07:09:29', 3),
(13, 7, '2', '2022-11-22', '07:09:29', 4),
(14, 7, '2', '2022-11-22', '07:09:29', 5),
(15, 8, '11', '2022-11-22', '08:13:06', 1),
(16, 9, '10', '2022-11-22', '08:14:45', 1),
(17, 10, '9', '2022-11-22', '08:20:41', 1),
(18, 11, '8', '2022-11-22', '08:46:45', 1),
(19, 12, '7', '2022-11-22', '08:47:53', 1),
(20, 13, '12', '2022-11-22', '08:56:52', 1),
(21, 14, '1', '2022-11-22', '08:59:01', 1),
(22, 15, '3', '2022-11-22', '09:01:52', 1),
(23, 16, '4', '2022-11-22', '09:03:30', 2),
(24, 17, '9', '2022-11-22', '09:04:21', 1),
(25, 18, '2', '2022-11-22', '09:09:42', 1),
(26, 19, '2', '2022-11-22', '09:09:53', 1),
(27, 20, '4', '2022-11-22', '09:12:11', 2),
(28, 21, '3', '2022-11-22', '09:14:52', 2),
(29, 22, '5', '2022-11-22', '09:15:57', 2),
(30, 23, '3', '2022-11-22', '09:21:21', 1),
(31, 23, '3', '2022-11-22', '09:21:21', 2),
(32, 24, '2', '2022-11-22', '10:05:55', 1),
(33, 24, '8', '2022-11-22', '10:05:55', 2),
(34, 24, '1', '2022-11-22', '10:05:55', 3),
(35, 25, '6', '2022-11-22', '10:06:36', 1),
(36, 26, '1', '2022-11-25', '08:53:27', 1),
(37, 26, '10', '2022-11-25', '08:53:27', 8),
(38, 26, '10', '2022-11-25', '08:53:27', 4),
(39, 26, '10', '2022-11-25', '08:53:27', 4),
(40, 26, '2', '2022-11-25', '08:53:27', 3),
(41, 26, '9', '2022-11-25', '08:53:27', 5),
(42, 27, '2', '2022-11-25', '10:02:54', 4),
(275, 28, '2', '2022-11-25', '10:05:31', 8),
(276, 29, '3', '2022-12-04', '12:56:57', 9),
(277, 29, '1', '2022-12-04', '12:56:57', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_forn` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `tel_prin` varchar(15) NOT NULL,
  `tel_sec` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_forn`, `nome`, `endereco`, `tel_prin`, `tel_sec`) VALUES
(1, 'FB Hortifruti', 'Rodovia Anhanguera, KM 25, São Paulo - SP', '(11) 3911-0005', ' (11)3485-5588'),
(2, 'Agrofruti Distribuidora', 'Rua Capitão Abdala Chama, 254, Benfica - Rio de Janeiro - RJ', '(21)3580-1015', '(21)95101-0131'),
(3, 'Rio FL Distribuidora de Hortifrutigranjeiros LTDA', 'Armazém CA - Av. Brasil, 19001 - Pavilhão 100 - Irajá, Rio de Janeiro - RJ', '(21)99316-0677', NULL),
(4, 'Castor Alimentos', 'Av. Dr. Gastão Vidigal, 1946 – Pavilhão AMI – Box 46/47/48/49 – Vila Leopoldina – São Paulo SP', '(11)3646-0030', NULL),
(5, 'Leo Distribuidora', 'Rua. Anton Philips, 251 - Vila Herminia - Guarulhos - SP', '(11)97060-6222', NULL),
(6, 'Distribuidora Mariano', 'Rodovia BR 262 S/N, KM 6.5, Ceasa pavilhão III, Lojas 59, 60, 61 e 62, Vila Capixaba, Cariacica - ES', '(27)3366-3122', '(21)2624-0057'),
(7, 'Hortifruti do Alemão', 'Rod. Dom Gabriel Paulino Bueno Couto, Km 94,5 - Pedregulho, Itu - SP', '(11) 4013-2459', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id_prod` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `preco` double NOT NULL,
  `quant_prod` decimal(10,0) NOT NULL,
  `fornecedor_id_forn` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_prod`, `nome`, `preco`, `quant_prod`, `fornecedor_id_forn`) VALUES
(1, 'Abóbora Japonesa', 3.59, '18', 2),
(2, 'Abóbora Moranga', 2.64, '14', 1),
(3, 'Abobrinha Brasileira', 2.5, '22', 1),
(4, 'Alho', 2, '215', 6),
(5, 'Batata Monalisa', 3.18, '180', 1),
(8, 'Batata Boneca', 2.05, '222', 5),
(9, 'Batata Doce', 2.5, '98', 5),
(11, 'Batata Salsa', 11.5, '52', 1),
(12, 'Berinjela', 3.75, '97', 1),
(13, 'Beterraba', 1.88, '84', 5),
(14, 'Cebola', 2.31, '302', 6),
(15, 'Cebola Roxa', 4.5, '105', 6),
(16, 'Cenoura', 2.14, '264', 6),
(17, 'Chuchu', 1.89, '92', 2),
(18, 'Mandioca', 4.5, '140', 5),
(19, 'Pepino Comum', 1.88, '115', 2),
(20, 'Pepino Japonês', 3.34, '210', 2),
(21, 'Pimentão Amarelo', 7.48, '160', 2),
(22, 'Pimentão Verde', 4.44, '220', 7),
(23, 'Pimentão Vermelho', 7.48, '112', 7),
(24, 'Quiabo', 5, '88', 2),
(25, 'Tomate', 3.36, '377', 1),
(26, 'Vagem', 5.84, '105', 1),
(27, 'Acelga', 3, '20', 1),
(28, 'Agrião', 4, '59', 1),
(29, 'Alface Americana', 3, '25', 6),
(30, 'Alface Crespa', 2.25, '20', 6),
(31, 'Alface Lisa', 2.5, '20', 6),
(32, 'Alface Roxa', 3, '26', 6),
(33, 'Almeirão', 3, '30', 6),
(34, 'Alho Poró', 4, '41', 6),
(35, 'Brócolis', 6.3, '16', 6),
(36, 'Cebolinha', 3, '51', 4),
(37, 'Chicória', 2.25, '33', 4),
(38, 'Coentro', 2.4, '21', 4),
(39, 'Couve-Flor', 6.3, '55', 7),
(40, 'Couve Manteiga', 2.5, '25', 7),
(41, 'Espinafre', 4, '55', 7),
(42, 'Hortelã', 8, '30', 1),
(43, 'Manjericão', 6.4, '66', 2),
(44, 'Repolho Roxo', 4.68, '42', 2),
(45, 'Repolho Verde', 3.34, '66', 2),
(46, 'Rúcula', 3, '50', 3),
(47, 'Salsinha', 3, '64', 1),
(48, 'Salsão', 5, '22', 1),
(49, 'Abacate', 5.45, '40', 6),
(50, 'Abacaxi', 4.1, '30', 6),
(51, 'Acerola', 15.5, '115', 6),
(52, 'Amora', 4.56, '100', 6),
(53, 'Banana Nanica', 3.59, '60', 5),
(54, 'Banana Prata', 2.75, '50', 5),
(55, 'Caju', 2.5, '50', 2),
(56, 'Cereja', 13.25, '43', 2),
(57, 'Coco Seco', 7, '33', 5),
(58, 'Coco Verde', 8, '30', 5),
(59, 'Goiaba', 3.05, '52', 1),
(60, 'Kiwi', 2.37, '62', 1),
(61, 'Laranja Lima', 8.99, '152', 2),
(62, 'Laranja Pêra', 7.5, '150', 2),
(63, 'Limão Tahiti', 7, '120', 2),
(64, 'Limão Siciliano', 8.2, '105', 2),
(65, 'Maçã Fuji', 3.34, '123', 4),
(66, 'Maçã Verde', 4.3, '80', 4),
(67, 'Mamão Formosa', 10.25, '102', 4),
(68, 'Mamão Papaia', 11, '105', 4),
(69, 'Manga', 6.1, '100', 4),
(70, 'Maracujá', 7.2, '82', 3),
(71, 'Melancia', 11.99, '34', 3),
(72, 'Melão', 3.85, '20', 3),
(73, 'Morango', 7.25, '79', 2),
(74, 'Pêra', 6.3, '64', 1),
(75, 'Pêssego', 4.25, '23', 4),
(76, 'Romã', 15.77, '66', 1),
(77, 'Uva', 9.95, '29', 1),
(78, 'Uva Passas', 1.5, '20', 3),
(79, 'Uva Verde', 3.99, '15', 1),
(80, 'Pimenta Malagueta', 3.5, '20', 3),
(81, 'Manjericão', 1.5, '23', 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `cod_user` int(11) NOT NULL,
  `login` varchar(40) NOT NULL,
  `senha` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`cod_user`, `login`, `senha`) VALUES
(1, 'Hortifruti', 'Senha123');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD KEY `fk_compra_produto1` (`id_prod`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_forn`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_prod`),
  ADD KEY `fornecedor_id_forn` (`fornecedor_id_forn`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_user`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `compra`
--
ALTER TABLE `compra`
  MODIFY `id_compra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=278;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_forn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_prod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `cod_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `fk_compra_produto1` FOREIGN KEY (`id_prod`) REFERENCES `produto` (`id_prod`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `fornecedor_id_forn` FOREIGN KEY (`fornecedor_id_forn`) REFERENCES `fornecedor` (`id_forn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
