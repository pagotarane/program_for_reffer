-- wamp to display grades


delimiter $$
drop procedure if exists p9 $$

create procedure p9(marks int)
begin

if marks >=70 then
	select 'Distinction' as GRADE;
elseif marks >= 60 then
	select 'First class' as GRADE;
elseif marks >= 50 then
	select 'Second class' as GRADE;
elseif marks >= 40 then
	select 'Pass class' as GRADE;
else
	select 'Fail' as GRADE;
end if;

end $$
delimiter ;

