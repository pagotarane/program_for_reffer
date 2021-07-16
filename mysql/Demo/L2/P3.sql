create database if not exists bike_db;


use bike_db;

create table if not exists bike(
id int unsigned,
model_name varchar(255),
color enum('red','blue','black','white') default 'black',
options set('light','helmet','lock')
);



