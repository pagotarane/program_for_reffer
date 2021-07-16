-- wamf to find the highest marks
-- u r not suppose use max() bif

delimiter $$
drop function if exists f2$$
create function f2() returns int deterministic
begin
declare m int default 0;
declare h int default 0;
declare c1 cursor for select marks from student;
open c1;
	begin
	declare exit handler for 1329 
	begin end;
	while true do
		fetch c1 into m;
		if m > h then
		set h=m;
	end if;
	end while;
	end;
close c1;
return h;
end$$
delimiter ;