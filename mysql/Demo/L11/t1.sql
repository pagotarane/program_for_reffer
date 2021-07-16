delimiter $$
drop trigger if exists t1$$

create trigger t1 before insert on employee for each row
begin
if (new.eid < 0) then
	signal SQLSTATE '11111'
	set message_text = "id shud not < 0";
end if;

if (new.ename is null orlength(new.ename) <2) then
	signal SQLSTATE '22222'
	set message_text = "invalid name";
end if;
end $$

drop trigger if exists t2$$

create trigger t2 after insert on employee for each row
begin
insert into employee_bkup values(new.eid,new.ename, 'INSERT',now());
end $$

delimiter;
