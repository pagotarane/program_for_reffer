-- wamp to convert tempurature from fah to celcius use inout

delimiter $$

drop procedure if exists p6 $$

create procedure p6(inout info double)
begin
set info = (info -32) * 5/9;
set info = round(info,2);

end$$
delimiter ;