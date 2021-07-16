-- factorial of number

delimiter $$
drop procedure if exists fact $$

create procedure fact(num bigint)
begin

declare f bigint default 1;
declare i int default 1;

if (num < 0) then
	select 'be +ve' as MSG;
elseif (num = 0 or num = 1) then
	select 'fact = 1' as MSG;
else
	aa :loop
		begin
			set f = f * i;
			set i = i + 1;
			if  i = num + 1 then
				leave aa;
			end if;
		end;
	end loop;	
	select f as FACTORIAL;
end if;
end $$
delimiter ;

