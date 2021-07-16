create database 23_dec;

use 23_dec;

delimiter $$
drop procedure if exists sod $$

create procedure sod(num int)
begin
declare digit int default 0;
declare result int default 0;

if (num<0) then
	select 'be +ve' as MSG;
else
	while num > 0 do
		set digit = num % 10;
		set result = result + digit;
		set num = num DIV 10;
	end while
	
end if;
select result as MSG;
end $$
delimiter ;