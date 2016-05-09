SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `proyecto` ;
CREATE SCHEMA IF NOT EXISTS `proyecto` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `proyecto` ;

-- -----------------------------------------------------
-- Table `proyecto`.`Inverter`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `proyecto`.`Inverter` ;

CREATE TABLE IF NOT EXISTS `proyecto`.`Inverter` (
  `idInverter` INT NOT NULL,
  `Status` INT NULL,
  `Power` VARCHAR(45) NULL,
  `Day_Energy` VARCHAR(45) NULL,
  `Year_Energy` VARCHAR(45) NULL,
  `Total_Energy` VARCHAR(45) NULL,
  `Opcion_idOpcion` INT NOT NULL,
  PRIMARY KEY (`idInverter`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `proyecto`.`Sensors`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `proyecto`.`Sensors` ;

CREATE TABLE IF NOT EXISTS `proyecto`.`Sensors` (
  `idSensors` INT NOT NULL,
  `Temperatura_modulo` VARCHAR(45) NULL,
  `Temperatura_ambiente` VARCHAR(45) NULL,
  `Radiacion_solar` VARCHAR(45) NULL,
  `Viento` VARCHAR(45) NULL,
  `Opcion_idOpcion` INT NOT NULL,
  PRIMARY KEY (`idSensors`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `proyecto`.`Historico`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `proyecto`.`Historico` ;

CREATE TABLE IF NOT EXISTS `proyecto`.`Historico` (
  `Frecuencia` VARCHAR(45) NULL,
  `Day_Energy` VARCHAR(45) NULL,
  `I_DC` VARCHAR(45) NULL,
  `I_AC` VARCHAR(45) NULL,
  `V_DC` VARCHAR(45) NULL,
  `V_AC` VARCHAR(45) NULL,
  `Temperatura_modulo` VARCHAR(45) NULL,
  `Opcion_idOpcion` INT NOT NULL,
  `idHistorico` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idHistorico`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
