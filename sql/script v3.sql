-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema lufthavn
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lufthavn
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lufthavn` DEFAULT CHARACTER SET utf8 ;
USE `lufthavn` ;

-- -----------------------------------------------------
-- Table `lufthavn`.`afgang`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`afgang` (
  `idAfgang` INT(11) NOT NULL,
  `til_land` VARCHAR(100) NOT NULL,
  `afgang_tidspunkt` DATETIME NOT NULL,
  PRIMARY KEY (`idAfgang`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `lufthavn`.`destination`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`destination` (
  `idDestination` INT(11) NOT NULL,
  `fra_land` VARCHAR(100) NOT NULL,
  `ankomst_tidspunkt` DATETIME NOT NULL,
  PRIMARY KEY (`idDestination`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `lufthavn`.`flyselskab`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`flyselskab` (
  `idFlySelskab` INT(11) NOT NULL,
  `navn` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idFlySelskab`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `lufthavn`.`flysize`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`flysize` (
  `idFlySize` INT(11) NOT NULL,
  `antal_passagerer` INT(11) NOT NULL,
  `antal_personale` INT(11) NOT NULL,
  PRIMARY KEY (`idFlySize`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `lufthavn`.`Standplads`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`Standplads` (
  `standpladsNummer` INT NOT NULL,
  `terminal` INT NOT NULL,
  `size` VARCHAR(45) NOT NULL,
  `available` TINYINT(1) NOT NULL,
  PRIMARY KEY (`standpladsNummer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lufthavn`.`fly`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`fly` (
  `idFly` INT(11) NOT NULL,
  `FlySelskab_idFlySelskab` INT(11) NOT NULL,
  `Afgang_idAfgang` INT(11) NOT NULL,
  `flysize_idFlySize` INT(11) NOT NULL,
  `destination_idDestination` INT(11) NOT NULL,
  `Standplads_standpladsNummer` INT NOT NULL,
  PRIMARY KEY (`idFly`),
  INDEX `fk_Fly_FlySelskab1_idx` (`FlySelskab_idFlySelskab` ASC) VISIBLE,
  INDEX `fk_Fly_Afgang1_idx` (`Afgang_idAfgang` ASC) VISIBLE,
  INDEX `fk_fly_flysize1_idx` (`flysize_idFlySize` ASC) VISIBLE,
  INDEX `fk_fly_destination1_idx` (`destination_idDestination` ASC) VISIBLE,
  INDEX `fk_fly_Standplads1_idx` (`Standplads_standpladsNummer` ASC) VISIBLE,
  CONSTRAINT `fk_Fly_Afgang1`
    FOREIGN KEY (`Afgang_idAfgang`)
    REFERENCES `lufthavn`.`afgang` (`idAfgang`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fly_FlySelskab1`
    FOREIGN KEY (`FlySelskab_idFlySelskab`)
    REFERENCES `lufthavn`.`flyselskab` (`idFlySelskab`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fly_flysize1`
    FOREIGN KEY (`flysize_idFlySize`)
    REFERENCES `lufthavn`.`flysize` (`idFlySize`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fly_destination1`
    FOREIGN KEY (`destination_idDestination`)
    REFERENCES `lufthavn`.`destination` (`idDestination`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fly_Standplads1`
    FOREIGN KEY (`Standplads_standpladsNummer`)
    REFERENCES `lufthavn`.`Standplads` (`standpladsNummer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `lufthavn`.`handlingselskab`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lufthavn`.`handlingselskab` (
  `idHandlingSelskab` INT(11) NOT NULL,
  `size` VARCHAR(45) NOT NULL,
  `Taxi_ind_ved_ankomst` INT(11) NOT NULL,
  `Passagerer_ud` INT(11) NOT NULL,
  `Bagage_ud` INT(11) NOT NULL,
  `Brændstof_påfyldning` INT(11) NOT NULL,
  `Rengøring` INT(11) NOT NULL,
  `Bagage_ind` INT(11) NOT NULL,
  `Passagerer_ind` INT(11) NOT NULL,
  `Taxi_ud_til_afgang` INT(11) NOT NULL,
  `Taxi_til_og_fra_ventepladser` INT(11) NOT NULL,
  `Personale_til_og_fra_naboplads` INT(11) NOT NULL,
  `Personale_til_og_fra_øvrige_i_egen_terminal` INT(11) NOT NULL,
  `Personale_til_og_fra_den_anden_terminal` INT(11) NOT NULL,
  PRIMARY KEY (`idHandlingSelskab`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
