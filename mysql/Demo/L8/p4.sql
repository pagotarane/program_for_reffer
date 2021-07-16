-- wamp to find area of circle...rad will be supplied

delimiter $$

drop procedure if exists p4 $$

create procedure p4(rad double)
begin
declare area double default 0.0;
set area=3.14159 * power(rad,2);
set area=round(area,2);
select area as AREA;

select round((3.14159 * power(rad,2)),2) as AREA1;

end $$
delimiter ;