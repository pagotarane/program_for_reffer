delimiter $$
drop procedure if exists p3$$
create procedure p3(n int,a double)
begin
declare issue boolean default false;
declare continue handler for SQLException
	set issue=true;
start transaction;
select 'work started ' as MSG;
update sa set balance = balance + a
where no=n;
update ca set balance = balance - a
where no=n;

if ! issue then
	commit;
	select 'transaction completed';
else
	rollback;
	select 'transaction error ';
end if;
select 'work ended 'as MSG;
end$$
delimiter ;