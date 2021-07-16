
delimiter $$

drop procedure if exists p1$$
create procedure p4 (rn int)
begin
declare c int default 0;
declare r int default 0;
declare a varchar(30) default '';
declare y varchar(5) default '';

select count(*) into c from student where rno=rn;
if c = 0 then
	select 'records does not exists ' as reply;
else
	select rno,eyear into r,y
	from student where rno=rn;
	case y
		when 'fe' then set a= '5 days';
		when 'se' then set a= '4 days';
		else set a= '2 days';


	end case;
	select concat("rno ",r, "Holidays", a) as
reply;
end if;
end$$
delimiter ;