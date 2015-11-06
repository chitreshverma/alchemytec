--
-- Database: `expensesdb`
--
CREATE DATABASE IF NOT EXISTS `expensesdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `expensesdb`;

-- --------------------------------------------------------

--
-- Table structure for table `EXPENSES`
--

CREATE TABLE `Expenses` (
  `expense_id` bigint(20) NOT NULL primary key AUTO_INCREMENT,
  `expense_date` datetime COLLATE utf8_unicode_ci NOT NULL,
  `expense_amount` double COLLATE utf8_unicode_ci NOT NULL,
  `expense_reason` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `expense_vat` double COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 