
delimiter $$

drop procedure if exists p3 $$

create procedure p3(in n1 int,in n2 int,out result int)
begin
set result=n1+n2;
end $$
delimiter ;