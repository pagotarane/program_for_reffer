-- wamf to count the total no. of students
-- u r not suppose use count() bif

delimiter $$
drop function if exists f1$$
create function f1() returns int deterministic
begin
declare c int default 0;
declare r int default 0;
declare c1 cursor for select rno from student;
open c1;
	begin
	declare exit handler for 1329 
	begin end;
	while true do
		fetch c1 into r;
		set c=c+1;
	end while;
	end;
close c1;
return c;
end$$
delimiter ;