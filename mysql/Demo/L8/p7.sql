-- wamp to check if the given string is palindrome

delimiter $$
drop procedure if exists p7 $$

create procedure p7(str varchar(100))
begin
if reverse(str)=str then
	select 'yess' as MSG;
else
	select 'oh noooo' MSG;
end if;
end $$
delimiter ;