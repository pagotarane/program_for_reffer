





































delimiter $$

drop procedure if exists p6$$

create procedure p5(i int,n varchar(50),s double)
begin

declare exit handler for 1062
select 'Id already there' as ERROR;

declare exit handler for SQLSTATE '88888'
select 'Id shud be +ve ' as ERROR;

declare exit handler for '77777'
select 'Invalid name' as ERROR;

declare exit handler for '55555'
select 'Salary shud be min 8000' as ERROR;


if i<0 then
	signal SQLSTATE '88888';
end if;

if n is null or length(n) < 2 or length(n) > 20 then
	signal SQLSTATE '77777';
end if;

if s < 8000 then
	signal SQLSTATE '55555';
end if;

insert into employee values(i,n,s);
select 'record has been saved ' as MSG;

end$$
delimiter ;