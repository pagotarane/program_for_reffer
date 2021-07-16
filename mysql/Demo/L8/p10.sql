-- wamp to read price and return the new price as per discount


delimiter $$
drop procedure if exists p10 $$

create procedure p10(inout price double)
begin
declare r int default 0;

set r=ceiling(10 * rad());

if (r > 7) then
	set price * 0.90;
elseif (r > 3) then
	set price * 0.85;
else
	set price = price * 0.95;
end if;

set price = round(price,2);

end $$
delimiter ;

