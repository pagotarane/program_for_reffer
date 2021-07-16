-- wamp to check leap year or not

delimiter $$
drop procedure if exists p8 $$

create procedure p8(year int)
begin
declare b1 boolean default false;
declare b2 boolean default false;

set b1 = (year % 100 !=0) and (year % 4=0);           -- for every 4 years
set b2 = (year % 100 =0) and (year % 400=0);          -- for every 400 years

if b1 or b2 then
	select 'yesss' as MSG;
else
	select 'nahii' as MSG;
end if;
end$$
delimiter ;