create database if not exists tickit_db;


use tickit_db;

create table if not exists tickit(
id int unsigned,
title varchar(255) not null,
priority enum('high','low','medium')
);



