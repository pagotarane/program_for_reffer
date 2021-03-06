create table department(
dept_name varchar(30) primary key,
dept_bldg int,
dept_hod varchar(30)
);


create table employee(
id int primary key, 
name varchar(30),
dept_name varchar(30),
salary decimal(8,2),
gender enum('m','f'),
foreign key(dept_name) references department(dept_name)
);

insert into department values
('comps',1,'surya'),
('extc',2,'vaishnavi'),
('it',1,'Raja');


insert into employee values
(1,'amit','comps',4500.00,'m'),
(2,'sumit','comps',5000.00,'m'),
(3,'reena','comps',5000.00,'f'),
(4,'nikhil','it',3500.00,'m'),
(5,'seema','extc',2500.00,'f'),
(6,'rakesh','it',4200.00,'m'),
(7,'rinkesh','comps',6200.00,'m'),
(8,'pooja','extc',2200.00,'f'),
(9,'saurabh','comps',4800.00,'m'),
(10,'rahul','extc',5800.00,'m');


select * from employee where salary =
(select min(salary) from employee);



select * from employee where dept_name IN
(select dept_name from department where dept_hod='surya');

select * from employee where dept_name IN
(select dept_name from department where dept_bldg=1);

select * from employee where salary IN
(select max(salary) from employee group by dept_name;

create table emp_comps like employee;

insert into emp_comps(select * from employee where dept_name='comps');


create table emp_it like employee;

insert into emp_it(select * from employee where dept_name='it');

create table emp_extc like employee;

insert into emp_extc(select * from employee where dept_name='extc');

