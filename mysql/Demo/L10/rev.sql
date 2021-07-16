-- reverse the no. 5832 ==> 2385 using repeat loop
	
delimiter $$
drop procedure if exists rev $$

create procedure rev(num int)
begin
declare digit int default 0;
declare reverse int default 0;

if (num<0) then
	select 'be +ve' as MSG;
else
	repeat
		set digit = num % 10;
		set reverse =  reverse * 10 + digit;
		set num = num DIV 10;
	until num= 0
	end repeat;
	select reverse as MSG;
end if;
end $$
delimiter ;


-- d=n%10	r=r * 10 + d	n= n DIV 10	num=0