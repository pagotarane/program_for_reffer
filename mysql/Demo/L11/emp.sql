create table employee
(
eid int primary key,
ename varchar(20)
);

create table employee_bkup
(
eid int,
ename varchar(20),
operation varchar(20),
operation_time timestamp
);