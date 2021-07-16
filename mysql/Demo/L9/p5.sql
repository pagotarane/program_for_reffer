
delimiter $$

drop procedure if exists p5$$
create procedure p5(rn int)
begin
declare c int default 0;
declare r int default 0;
declare m int default 0;
declare a varchar(30) default '';


select count(*) into c from student where rno=rn;
if c = 0 then
	select 'records does not exists ' as reply;
else
	select rno,marks into r,m
	from student where rno=rn;
	case
		when m>70 then set a= 'Grade A';
		when m>60 then set a= 'Grade B';
		else set a= 'Grade c';


	end case;
	select concat("rno     ", r , "   Grade  = ", a) as
reply;
end if;
end$$
delimiter ;