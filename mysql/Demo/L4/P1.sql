create database if not exists vendors;

use vendors;

create table if not exists vendor(vendor_id int primary key,vendor_name varchar(10));


create table if not exists invoices
(
invoice_id int,
vendor_id int,
invoices_name varchar(10),
foreign key(vendor_id) references vendor(vendor_id)
);
