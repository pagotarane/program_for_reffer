-- wamp to return list of names of student from thane

delimiter $$
drop procedure if exists lot $$
create procedure lot(out info varchar(500))
begin
declare n varchar(30) default '';
declare c1 cursor for select name from student where location='thane';
set info='';
open c1;
	begin
		declare exit handler for 1329
		begin end;
		while true do
			fetch c1 into n;
			set info=concat(info,' ',n);
		end while;
	end;
close c1;
end$$
delimiter ;