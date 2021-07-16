-- wamp to find sum of first n positive integer
-- eg:  i/p:5			1+2+3+4+5=15
		
delimiter $$
drop procedure if exists p7$$
create procedure p7(n int)
begin
declare i int default 1;
declare sum int default 0;

if n < 0 then
	select "b +ve" as MSG;
else
	repeat
-- 	while  i <=n do
		set sum=sum+i;
		set i = i+1;
	until i>n
	end repeat;
-- end while;
select concat("result=",sum) as SUM;

end if;
end $$
delimiter ;
