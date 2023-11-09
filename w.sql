create database HumanFriends;
use HumanFriends;
CREATE TABLE `pets` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `command` VARCHAR(45) NOT NULL,
  `BirthDate` DATE NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Fido', 'Sit, Stay, Fetch', '2020-01-01', 'Dog');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Whiskers', 'Sit, Pounce', '2019-05-15', 'Cat');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Hammy', 'Roll, Hide', '2021-03-10', 'Hamster');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Buddy', 'Sit, Paw, Bark', '2018-12-10', 'Dog');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Smudge', 'Sit, Pounce, Scratch', '2020-02-20', 'Cat');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Peanut', 'Roll, Spin', '2021-08-01', 'Hamster');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Bella', 'Sit, Stay, Roll', '2019-11-11', 'Dog');
INSERT INTO `pets` (`name`, `command`, `BirthDate`, `type`) VALUES ('Oliver', 'Meow, Scratch, Jump', '2020-06-30', 'Cat');

CREATE TABLE `pack_animals` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `command` VARCHAR(45) NOT NULL,
  `BirthDate` DATE NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Thunder', 'Trot, Canter, Gallop', '2015-07-21', 'Horse');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Sandy', 'Walk, Carry Load', '2016-11-03', 'Camel');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Eeyore', 'Walk, Carry Load, Bray', '2017-09-18', 'Donkey');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Storm', 'Trot, Canter', '2014-05-05', 'Horse');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Dune', 'Walk, Sit', '2018-12-12', 'Camel');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Burro', 'Walk, Bray, Kick', '2019-01-23', 'Donkey');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Blaze', 'Trot, Jump, Gallop', '2016-02-29', 'Horse');
INSERT INTO `pack_animals` (`name`, `command`, `BirthDate`, `type`) VALUES ('Sahara', 'Walk, Run', '2015-08-14', 'Camel');

DELETE FROM `pack_animals` WHERE type = "Camel"; -- Удалить записи о верблюдах 

create table animals as select * from pack_animals
union 
select * from pets; --(создаю таблицу всех животных)

ALTER TABLE `animals` CHANGE COLUMN `id` `id` INT NULL DEFAULT '0' ; --(делаю id возможным для null)

UPDATE animals SET id = NULL;--(удаляю всю инфу с id )

ALTER TABLE `animals` CHANGE COLUMN `id` `id` INT NOT NULL AUTO_INCREMENT ,ADD PRIMARY KEY (`id`);--(делаю id автоинкрементом и первичныым ключом)


UPDATE `animals` SET `BirthDate` = '2022-03-10' WHERE (`id` = '8'); --Плменял значение для одного животного а то с учетом удаленных верблюдов только один подходил под описание

create table young_animals as SELECT *,TIMESTAMPDIFF(MONTH, '2020-11-01',BirthDate) as "age(month)" FROM animals where BirthDate > '2020-11-01';--Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.



select *, 'animals' as 'table_name'  from animals
union
select *, 'pack_animals' as 'table_name'  from pack_animals
union
select *, 'pets' as 'table_name'  from pets
union
select id,name,command,BirthDate,type, 'young_animals' as 'table_name'  from young_animals;-- Объединение всех таблиц с названиями этих таблиц