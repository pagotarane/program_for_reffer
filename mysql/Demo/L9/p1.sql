create database if not exists 21_dect;

use 21_dect;

drop table if exists student;

create table if not exists student(rno int unsigned primary key,
name varchar(20),
marks int unsigned,
year enum('fe','se','te','be'),
location varchar(30) default 'mumbai');

insert into student values(10,'amit',98,'fe','thane'),
(20,'sumit',79,'fe','mumbai'),
(30,'rumit',63,'se','thane'),
(40,'seema',81,'fe','thane'),
(50,'reema',45,'fe','mumbai'),
(60,'tina',95,'be','thane');



