create database if not exists vendors_db;

use vendors_db;

create table if not exists vendor
(
vendor_id int not null,
vendor_name varchar(20) not null,
vendor_description varchar(500)
);

alter table vendor add vendor_location varchar(50);
desc vendor;

alter table vendor drop vendor_description;
desc vendor;

alter table vendor modify vednor_name varchar(50);
desc vendor;

alter table vendor modify vendor_name varchar(50) default 'flipkart';
desc vendor;