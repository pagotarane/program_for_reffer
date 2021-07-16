-- wamp to perform addition of two int

delimiter $$

drop procedure if exists p2 $$

create procedure p2(n1 int,n2 int)
begin
declare r1 int default 0;
declare r2 int default 0;
select n1 + n2 as RESULT;

set r1=n1 + n2;

select r1 as RESULT1;

select n1+n2 into r2;

select r2 as RESULT2;

end $$
delimiter ;