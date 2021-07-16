-- wamp using cursor to display two lists  
-- whoes marks >=80
-- whoes marks <80

delimiter $$
drop procedure if exists los $$
create procedure los()
begin
declare n varchar(30) default '';
declare m int default 0;
declare list1 varchar(500) default '';
declare list2 varchar(500) default '';
declare c1 cursor for select name,marks from student;
open c1;
	begin
		declare exit handler for 1329
		begin end;
		repeat
			fetch c1 into n,m;
			if m>=80 then
				set list1=concat(list1,' ',n,'-->',m,'!');
			else
				set list2=concat(list2,' ',n,'-->',m,'!');
			end if;
		until false
		end repeat;
		end;
close c1;
select list1 as LIST1;
select list2 as LIST2;
end$$
delimiter ;