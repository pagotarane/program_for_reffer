
delimiter $$

drop procedure if exists p3$$
create procedure p3 (rn int)
begin
declare c int default 0;
declare r int default 0;
declare n varchar(30) default '';
declare m int default 0;
declare a varchar(30) default '';

select count(*) into c from student where rno=rn;
if c = 0 then
	select 'records does not exists ' as reply;
else
	select rno,name,marks into r,n,m
	from student where rno=rn;
	if m > 70 then
		set a = 'Distinction';
	elseif m>=50 then
		set a = 'First class';
	elseif m>=40 then
		set a = 'Second class';
	else
		set a = 'Fail';
	end if;
	select concat("rno ",r, "name ",n,"result ", a) as
reply;
end if;
end$$
delimiter ;