create database db_nick;

use db_nick; 

create table `Postagem` (
	`privacidade` BOOLEAN NOT NULL,
	`resumo` TEXT(400) NOT NULL,
	`texto` mediumtext NOT NULL,
	`horario` DATETIME NOT NULL,
	`id_posatgem` varchar(400) NOT NULL,
	`id_usuario` bigint NOT NULL,
	`id_tema` bigint NOT NULL,
	PRIMARY KEY (`id_posatgem`)
);

CREATE TABLE `Tema` (
	`titulo` varchar(50) NOT NULL,
	`classificacao` varchar(50),
	`Impacto` varchar(50),
	`id` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Usuario` (
	`email` varchar(50) NOT NULL,
	`senha` varchar(8) NOT NULL,
	`nome_completo` varchar(100) NOT NULL,
	`id` bigint NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk0` FOREIGN KEY (`id_usuario`) REFERENCES `Usuario`(`id`);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk1` FOREIGN KEY (`id_tema`) REFERENCES `Tema`(`id`);




